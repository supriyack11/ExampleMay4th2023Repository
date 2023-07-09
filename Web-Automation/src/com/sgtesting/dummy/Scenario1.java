//Launch Browser-->Navigate-->Login-->Create user-->Modify user-->Delete user-->Logout-->Close application

package com.sgtesting.dummy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	public static WebDriver oBrowser=null;
	public static ActiTime oPage=null;
	public static void main(String args[])
	{
		launch();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyuser();
		deleteUser();
		logout();
		closeApplication();
	}

	private static void launch() 
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage=new ActiTime(oBrowser);
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
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()=\"Login \"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()=\"Getting Started Shortcuts\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()=\"Add User\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("email")).sendKeys("user1demo1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user1demo1");
		    oBrowser.findElement(By.name("password")).sendKeys("Welcomeuser1");
		    oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser1");
		    oBrowser.findElement(By.xpath("//span[text()=\"Create User\"]")).click();
		    Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyuser()
	{
		try
		{
			oPage.getUserFromList().click();
			Thread.sleep(5000);
			oPage.getpassword().sendKeys("Welcomeuser1again");
			oPage.getpasswordCopy().sendKeys("Welcomeuser1again");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()=\"Demo1, User1\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			System.out.println(oAlert.getText());
			oAlert.accept();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout() 
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
