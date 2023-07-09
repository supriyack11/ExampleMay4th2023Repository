package com.sgtesting.dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupOrTabledBrowser {

	public static WebDriver oBrowser=null;
	public static void main(String args[])
	{
		launch();
		navigate();
		handlePopupBrowser();
	}

	private static void launch() 
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate() 
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void handlePopupBrowser()
	{
		try
		{
			WebElement oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Number of Popups before click: "+count());
			oLink.click();
			System.out.println("Number of Popups after click: "+count());
			if(count()>0)
			{
				popUpOperation();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static int count()
	{
		int count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	private static void popUpOperation()
	{
		try
		{
			System.out.println("Parent Browser: "+oBrowser.getWindowHandle());
			Object[] popUps=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popUps.length;i++)
			{
				String childBrowser=popUps[i].toString();
				Thread.sleep(2000);
				System.out.println("Child Browser: "+childBrowser);
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(2000);
				System.out.println("Url:"+oBrowser.getCurrentUrl());
				Thread.sleep(2000);
				System.out.println("Title: "+oBrowser.getTitle());
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Log in")).click();
				Thread.sleep(2000);				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

