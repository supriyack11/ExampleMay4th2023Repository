/*Launch Browser-->Navigate-->Login as admin-->Create user(user1)-->Logout as admin-->Login as user1-->
  Create user(user2)-->Logout as user1-->Login as user2-->Create user(user3)-->Logout as user2-->
  Login as user3-->Logout as user3-->Login as user2-->Modify password for user3-->Logout as user2-->
  Login as user3-->Logout as user3-->Login as user1-->Modify password for user2-->Logout as user1-->
  Login as user2-->Logout as user2-->Login as admin-->Modify password for user1-->Logout as admin-->
  Login as user1-->Logout as user1-->Login as user2-->Delete user3-->Logout as user2-->Login as user1-->
  Delete user2-->Logout as user1-->Login as admin-->Delete user1-->Logout as admin-->Close Application.
 */

package com.sgtesting.reflection5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenarioDemo2 {

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

	public static void gotoUsersLink()
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

	public static void createUser1()
	{
		try
		{
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("User1");
			oPage.getLastName().sendKeys("Demo1");
			oPage.getEmail().sendKeys("user1demo@gmail.com");
			oPage.getUserName().sendKeys("User1Demo1");
			oPage.getUserPassword().sendKeys("WelcomeUser1");
			oPage.getUserPasswordCopy().sendKeys("WelcomeUser1");
			oPage.getCreateUserButton().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void createUser2()
	{
		try
		{
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("User2");
			oPage.getLastName().sendKeys("Demo2");
			oPage.getEmail().sendKeys("user2demo@gmail.com");
			oPage.getUserName().sendKeys("User2Demo2");
			oPage.getUserPassword().sendKeys("WelcomeUser2");
			oPage.getUserPasswordCopy().sendKeys("WelcomeUser2");
			oPage.getCreateUserButton().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void createUser3()
	{
		try
		{
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("User3");
			oPage.getLastName().sendKeys("Demo3");
			oPage.getEmail().sendKeys("user3demo@gmail.com");
			oPage.getUserName().sendKeys("User3Demo3");
			oPage.getUserPassword().sendKeys("WelcomeUser3");
			oPage.getUserPasswordCopy().sendKeys("WelcomeUser3");
			oPage.getCreateUserButton().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void loginUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("User1Demo1");
			oPage.getPassword().sendKeys("WelcomeUser1");
			oPage.getLoginButton().click();
			Thread.sleep(5000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void loginUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("User2Demo2");
			oPage.getPassword().sendKeys("WelcomeUser2");
			oPage.getLoginButton().click();
			Thread.sleep(5000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void loginUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("User3Demo3");
			oPage.getPassword().sendKeys("WelcomeUser3");
			oPage.getLoginButton().click();
			Thread.sleep(5000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void welcomeToActiTime()
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

	public static void user1LinkFromUsersList()
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

	public static void user2LinkFromUsersList()
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

	public static void user3LinkFromUsersList()
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

	public static void modifyUser1()
	{
		try
		{
			oPage.getUserPassword().sendKeys("WelcomeAgainUser1");
			oPage.getUserPasswordCopy().sendKeys("WelcomeAgainUser1");
			oPage.getSaveChangesButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void modifyUser2()
	{
		try
		{
			oPage.getUserPassword().sendKeys("WelcomeAgainUser2");
			oPage.getUserPasswordCopy().sendKeys("WelcomeAgainUser2");
			oPage.getSaveChangesButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void modifyUser3()
	{
		try
		{
			oPage.getUserPassword().sendKeys("WelcomeAgainUser3");
			oPage.getUserPasswordCopy().sendKeys("WelcomeAgainUser3");
			oPage.getSaveChangesButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void loginUser1New()
	{
		try
		{
			oPage.getUserName().sendKeys("User1Demo1");
			oPage.getPassword().sendKeys("WelcomeAgainUser1");
			oPage.getLoginButton().click();
			Thread.sleep(5000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void loginUser2New()
	{
		try
		{
			oPage.getUserName().sendKeys("User2Demo2");
			oPage.getPassword().sendKeys("WelcomeAgainUser2");
			oPage.getLoginButton().click();
			Thread.sleep(5000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void loginUser3New()
	{
		try
		{
			oPage.getUserName().sendKeys("User3Demo3");
			oPage.getPassword().sendKeys("WelcomeAgainUser3");
			oPage.getLoginButton().click();
			Thread.sleep(5000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public static void deleteUser()
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


