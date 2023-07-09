//Launch Browser-->Navigate-->Login-->Create user-->Modify user-->Delete user-->Logout-->Close application

package com.sgtesting.reflection5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserScenarioDemo2 {
	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;

	public static void launchBrowser() 
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage=new ActiPage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(5000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void minimizeFlyoutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void createUser()
	{
		try
		{
			oPage.getUserLink().click();
			Thread.sleep(2000);
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("User1");
			oPage.getLastName().sendKeys("Demo1");
			oPage.getEmail().sendKeys("user1demo@gmail.com");
			oPage.getUserName().sendKeys("User1Demo1");
			oPage.getUserPassword().sendKeys("WelcomeUser1");
			oPage.getUserPasswordCopy().sendKeys("WelcomeUser1");
			oPage.getCreateUserButton().click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void modifyUser()
	{
		try
		{
			oPage.getUser1LinkFromList().click();
			Thread.sleep(2000);
			oPage.getUserPassword().sendKeys("WelcomeAgainUser1");
			oPage.getUserPasswordCopy().sendKeys("WelcomeAgainUser1");
			oPage.getSaveChangesButton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void deleteUser()
	{
		try
		{
			oPage.getUser1LinkFromList().click();
			Thread.sleep(2000);
			oPage.getDeleteUserButton().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			Thread.sleep(2000);
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void logout()
	{
		try
		{
			oPage.getLogoutButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
