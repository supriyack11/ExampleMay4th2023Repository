//Launch Browser-->Navigate-->Login-->Create customer-->Create project-->Delete project-->Delete customer-->Logout-->Close application

package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProjectScenarioDemo5 {

	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login("admin","manager");
		minimizeFlyOutWindow();
		createCustomer("Customer1","Customer Description");
		createProject("Project1","Project Description");
		deleteProject();
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
			Thread.sleep(2000);
		}catch(Exception e)
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
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer(String custName, String custDesc)
	{
		try
		{
			oPage.getTasksLink().click();
			Thread.sleep(2000);
			oPage.getAddNewButton().click();
			Thread.sleep(2000);
			oPage.getNewCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerName().sendKeys(custName);
			oPage.getCustomerDescription().sendKeys(custDesc);
			oPage.getCreateCustomerButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createProject(String projName, String projDesc)
	{
		try
		{
			oPage.getAddNewButton().click();
			Thread.sleep(2000);
			oPage.getNewProject().click();
			Thread.sleep(2000);
			oPage.getProjectName().sendKeys(projName);
			oPage.getProjectDescription().sendKeys(projDesc);
			oPage.getCreateProjectButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try
		{
			oPage.getProjectSettingsButton().click();
			Thread.sleep(2000);
			oPage.getProjectActions().click();
			Thread.sleep(2000);
			oPage.getProjectDeleteButton().click();
			Thread.sleep(2000);
			oPage.getDeleteProjectConfirmationMgs().click();
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
