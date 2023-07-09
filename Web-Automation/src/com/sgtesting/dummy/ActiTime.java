package com.sgtesting.dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime 
{
	public ActiTime(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	@FindBy(xpath = "//span[text()=\"Demo1, User1\"]")
	private WebElement oUserFromList;
	public WebElement getUserFromList()
	{
		return oUserFromList;
	}
	
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	
	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}
	
	@FindBy(xpath = "//span[text()=\"Save Changes\"]")
	private WebElement saveChanges;
	public WebElement getSaveChanges()
	{
		return saveChanges;
	}
	
	

}
