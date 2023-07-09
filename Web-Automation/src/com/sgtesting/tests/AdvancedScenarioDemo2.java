/*Launch Browser-->Navigate-->Login as admin-->Create user(user1)-->Logout as admin-->Login as user1-->
  Create user(user2)-->Logout as user1-->Login as user2-->Create user(user3)-->Logout as user2-->
  Login as user3-->Logout as user3-->Login as user2-->Modify password for user3-->Logout as user2-->
  Login as user3-->Logout as user3-->Login as user1-->Modify password for user2-->Logout as user1-->
  Login as user2-->Logout as user2-->Login as admin-->Modify password for user1-->Logout as admin-->
  Login as user1-->Logout as user1-->Login as user2-->Delete user3-->Logout as user2-->Login as user1-->
  Delete user2-->Logout as user1-->Login as admin-->Delete user1-->Logout as admin-->Close Application.
 */

package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenarioDemo2 {

	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		loginUser1();
		welcomeToActiTime();
		createUser2();
		logout();
		loginUser2();
		welcomeToActiTime();
		createUser3();
		logout();
		loginUser3();
		welcomeToActiTime();
		logout();
		loginUser2();
		modifyUser3Password();
		logout();
		loginUser3New();
		logout();
		loginUser1();
		modifyUser2Password();
		logout();
		loginUser2New();
		logout();
		loginAdmin();
		modifyUser1Password();
		logout();
		loginUser1New();
		logout();
		loginUser2New();
		deleteUser3();
		logout();
		loginUser1New();
		deleteUser2();
		logout();
		loginAdmin();
		deleteUser1();
		logout();
		closeApplication();
	}

	private static void LaunchBrowser() {
		try
		{
			oBrowser=new ChromeDriver();

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

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButtonContainer']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
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
	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("user1demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1Demo");
			oBrowser.findElement(By.name("password")).sendKeys("Welcomeuser1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1Demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser1");
			oBrowser.findElement(By.xpath("//*[@id='loginButtonContainer']")).click();
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
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("user2demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2Demo");
			oBrowser.findElement(By.name("password")).sendKeys("Welcomeuser2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser2");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2Demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser2");
			oBrowser.findElement(By.xpath("//*[@id='loginButtonContainer']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo3");
			oBrowser.findElement(By.name("lastName")).sendKeys("User3");
			oBrowser.findElement(By.name("email")).sendKeys("user3demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3Demo");
			oBrowser.findElement(By.name("password")).sendKeys("Welcomeuser3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser3");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3Demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser3");
			oBrowser.findElement(By.xpath("//*[@id='loginButtonContainer']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void modifyUser3Password()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User3, Demo3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcomeuser3again");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser3again");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void loginUser3New()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3Demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser3again");
			oBrowser.findElement(By.xpath("//*[@id='loginButtonContainer']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void modifyUser2Password()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User2, Demo2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcomeuser2again");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser2again");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void loginUser2New()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2Demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser2again");
			oBrowser.findElement(By.xpath("//*[@id='loginButtonContainer']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void modifyUser1Password()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User1, Demo1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcomeuser1again");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser1again");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void loginUser1New()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1Demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser1again");
			oBrowser.findElement(By.xpath("//*[@id='loginButtonContainer']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User3, Demo3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User2, Demo2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User1, Demo1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
