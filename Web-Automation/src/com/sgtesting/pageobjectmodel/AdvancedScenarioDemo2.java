/*Launch Browser-->Navigate-->Login as admin-->Create user(user1)-->Logout as admin-->Login as user1-->
  Create user(user2)-->Logout as user1-->Login as user2-->Create user(user3)-->Logout as user2-->
  Login as user3-->Logout as user3-->Login as user2-->Modify password for user3-->Logout as user2-->
  Login as user3-->Logout as user3-->Login as user1-->Modify password for user2-->Logout as user1-->
  Login as user2-->Logout as user2-->Login as admin-->Modify password for user1-->Logout as admin-->
  Login as user1-->Logout as user1-->Login as user2-->Delete user3-->Logout as user2-->Login as user1-->
  Delete user2-->Logout as user1-->Login as admin-->Delete user1-->Logout as admin-->Close Application.
 */

package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenarioDemo2 {

	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login("admin","manager");
		minimizeFlyoutWindow();
		gotoUsersLink();
		createUser("User1","Demo1","user1demo@gmail.com","User1Demo1","WelcomeUser1");
		logout();
		login("User1Demo1","WelcomeUser1");
		welcomeToActiTime();
		gotoUsersLink();
		createUser("User2","Demo2","user2demo@gmail.com","User2Demo2","WelcomeUser2");
		logout();
		login("User2Demo2","WelcomeUser2");
		welcomeToActiTime();
		gotoUsersLink();
		createUser("User3","Demo3","user3demo@gmail.com","User3Demo3","WelcomeUser3");
		logout();
		login("User3Demo3","WelcomeUser3");
		welcomeToActiTime();
		logout();
		login("User2Demo2","WelcomeUser2");
		gotoUsersLink();
		user3LinkFromUsersList();
		modifyUser("WelcomeAgainUser3");
		logout();
		login("User3Demo3","WelcomeAgainUser3");
		logout();
		login("User1Demo1","WelcomeUser1");
		gotoUsersLink();
		user2LinkFromUsersList();
		modifyUser("WelcomeAgainUser2");
		logout();
		login("User2Demo2","WelcomeAgainUser2");
		logout();
		login("admin","manager");
		gotoUsersLink();
		user1LinkFromUsersList();
		modifyUser("WelcomeAgainUser1");
		logout();
		login("User1Demo1","WelcomeAgainUser1");
		logout();
		login("User2Demo2","WelcomeAgainUser2");
		gotoUsersLink();
		user3LinkFromUsersList();
		deleteUser();
		logout();
		login("User1Demo1","WelcomeAgainUser1");
		gotoUsersLink();
		user2LinkFromUsersList();
		deleteUser();
		logout();
		login("admin","manager");
		gotoUsersLink();
		user1LinkFromUsersList();
		deleteUser();
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

	private static void gotoUsersLink()
	{
		try
		{
			oPage.getUserLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void createUser(String fn,String ln,String email,String un,String pwd)
	{
		try
		{
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys(fn);
			oPage.getLastName().sendKeys(ln);
			oPage.getEmail().sendKeys(email);
			oPage.getUserName().sendKeys(un);
			oPage.getUserPassword().sendKeys(pwd);
			oPage.getUserPasswordCopy().sendKeys(pwd);
			oPage.getCreateUserButton().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void welcomeToActiTime()
	{
		try
		{
			oPage.getStartexploringactiTIME().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void user1LinkFromUsersList()
	{
		try
		{
			oPage.getUser1LinkFromList().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void user2LinkFromUsersList()
	{
		try
		{
			oPage.getUser2LinkFromList().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void user3LinkFromUsersList()
	{
		try
		{
			oPage.getUser3LinkFromList().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifyUser(String pwd)
	{
		try
		{
			oPage.getUserPassword().sendKeys(pwd);
			oPage.getUserPasswordCopy().sendKeys(pwd);
			oPage.getSaveChangesButton().click();
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


