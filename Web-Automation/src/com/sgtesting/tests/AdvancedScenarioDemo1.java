/*Launch Browser-->Navigate-->Login as admin-->Create 3 users(user1,user2,user3)-->Logout as admin-->
  Login as user1-->Logout-->Login as user2-->Logout-->Login as user3-->Logout-->Login as admin-->
  Modify the password for user1,user2,user3-->Logout as admin-->Login as user1-->Logout-->Login as user2-->
  Logout-->Login as user3-->Logout-->Login as admin-->Delete user1,user2,user3-->Logout as admin-->Close application.
 */

package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenarioDemo1 {

	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		createUsers();
		logout();
		loginUser1();
		logout();
		loginUser2();
		logout();
		loginUser3();
		logout();
		loginAdmin();
		modifyUsersPassword();
		logout();
		loginUser1New();
		logout();
		loginUser2New();
		logout();
		loginUser3New();
		logout();
		loginAdmin();
		deleteUsers();
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
	private static void createUsers()
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
	private static void loginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1Demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeuser1");
			oBrowser.findElement(By.xpath("//*[@id='loginButtonContainer']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(5000);
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
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(5000);
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
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void modifyUsersPassword()
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
			Thread.sleep(5000);
			
			oBrowser.findElement(By.xpath("//span[text()='User2, Demo2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcomeuser2again");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser2again");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			
			oBrowser.findElement(By.xpath("//span[text()='User3, Demo3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcomeuser3again");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcomeuser3again");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
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
	private static void deleteUsers()
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
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//span[text()='User2, Demo2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oAlert.accept();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//span[text()='User3, Demo3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oAlert.accept();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
