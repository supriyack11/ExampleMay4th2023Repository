//Launch Browser-->Navigate-->Login-->Create customer-->Delete customer-->Logout-->Close application

package com.sgtesting.reflection5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomerScenarioDemo3 {
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

	public static void createCustomer()
	{
		try
		{
			oPage.getTasksLink().click();
			Thread.sleep(2000);
			oPage.getAddNewButton().click();
			Thread.sleep(2000);
			oPage.getNewCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerName().sendKeys("Customer1");
			oPage.getCustomerDescription().sendKeys("Customer Description");
			oPage.getCreateCustomerButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void deleteCustomer()
	{
		try
		{
			oPage.getCustomerSettingsButton().click();
			Thread.sleep(2000);
			oPage.getCustomerActions().click();
			Thread.sleep(2000);
			oPage.getCustomerDeleteButton().click();
			Thread.sleep(2000);
			oPage.getDeleteCustomerConfirmationMgs().click();
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
