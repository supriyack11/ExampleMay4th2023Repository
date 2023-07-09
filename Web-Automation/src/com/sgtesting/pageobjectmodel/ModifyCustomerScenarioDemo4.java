//Launch Browser-->Navigate-->Login-->Create customer-->Modify customer-->Delete customer-->Logout-->Close application

package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyCustomerScenarioDemo4 {
	
	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;

	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login("admin","manager");
		minimizeFlyoutWindow();
		createCustomer("Customer1","Customer Description");
		modifyCustomer();
		deleteCustomer();
		logout();
		closeApplication();
	}

	private static void launchBrowser() 
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

	private static void navigate()
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

	private static void login(String userName, String password)
	{
		try
		{
			oPage.getUserName().sendKeys(userName);
			oPage.getPassword().sendKeys(password);
			oPage.getLoginButton().click();
			Thread.sleep(5000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyoutWindow()
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

	private static void createCustomer(String custname,String desc)
	{
		try
		{
			oPage.getTasksLink().click();
			Thread.sleep(2000);
			oPage.getAddNewButton().click();
			Thread.sleep(2000);
			oPage.getNewCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerName().sendKeys(custname);
			oPage.getCustomerDescription().sendKeys(desc);
			oPage.getCreateCustomerButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyCustomer()
	{
		try
		{
			oPage.getCustomerSettingsButton().click();
			Thread.sleep(2000);
			oPage.getCustomerStatusButton().click();
			Thread.sleep(2000);
			oPage.getCustomerArchived().click();
			Thread.sleep(2000);
			oPage.getCustomerCloseButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteCustomer()
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

	private static void logout()
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

	private static void closeApplication()
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
