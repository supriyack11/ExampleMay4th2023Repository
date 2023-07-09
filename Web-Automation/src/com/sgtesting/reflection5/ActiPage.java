package com.sgtesting.reflection5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {

	public ActiPage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}

	//Create WebElement for UserName
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Create WebElement for Password
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}

	//Create WebElement for FlyoutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//create WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutButton()
	{
		return oLogout;
	}

	//create WebElement for User Link
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oUser;
	public WebElement getUserLink()
	{
		return oUser;
	}

	//create WebElement for Add User Button
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oAddUser;
	public WebElement getAddUserButton()
	{
		return oAddUser;
	}

	//Create WebElement for First Name
	private WebElement firstName;
	public WebElement getFirstName()
	{
		return firstName;
	}

	//Create WebElement for Last Name
	private WebElement lastName;
	public WebElement getLastName()
	{
		return lastName; 
	}

	//Create WebElement for Email
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}

	//Create WebElement for User Password
	private WebElement password;
	public WebElement getUserPassword()
	{
		return password;
	}

	//Create WebElement for User Password copy
	private WebElement passwordCopy;
	public WebElement getUserPasswordCopy()
	{
		return passwordCopy;
	}

	//Create WebElement for Create User button
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement oCreateUser;
	public WebElement getCreateUserButton()
	{
		return oCreateUser;
	}

	//Create WebElement for user link
	@FindBy(xpath="//span[text()='Demo1, User1']")
	private WebElement oUser1Link;
	public WebElement getUser1LinkFromList()
	{
		return oUser1Link;
	}

	//Create WebElement for Delete User button
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDeleteUserButton()
	{
		return userDataLightBox_deleteBtn;
	}

	//Create WebElement for Save Changes button
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement oSaveChanges;
	public WebElement getSaveChangesButton()
	{
		return oSaveChanges;
	}

	//Create WebElement for Tasks link
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")
	private WebElement oTasks;
	public WebElement getTasksLink()
	{
		return oTasks;
	}

	//create WebElement for Add New button
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement oAddNew;
	public WebElement getAddNewButton()
	{
		return oAddNew;
	}

	//create WebElement for New Customer
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement oNewCustomer;
	public WebElement getNewCustomer()
	{
		return oNewCustomer;
	}

	//create WebElement for Customer Name
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerName()
	{
		return customerLightBox_nameField;
	}

	//create WebElement for Customer Description
	private WebElement customerLightBox_descriptionField;
	public WebElement getCustomerDescription()
	{
		return customerLightBox_descriptionField;
	}

	//create WebElement for Create Customer button
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement oCreateCustomer;
	public WebElement getCreateCustomerButton()
	{
		return oCreateCustomer;
	}

	//create WebElement for Customer settings button
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oCustomerSettings;
	public WebElement getCustomerSettingsButton()
	{
		return oCustomerSettings;
	}

	//create WebElement for Customer Actions button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement oCustomerActions;
	public WebElement getCustomerActions()
	{
		return oCustomerActions;
	}

	//create WebElement for Customer Delete button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement oCustomerDelete;
	public WebElement getCustomerDeleteButton()
	{
		return oCustomerDelete;
	}

	//create WebElement for Customer Delete confirmation massage
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getDeleteCustomerConfirmationMgs()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}

	//create WebElement for customer status button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement oCustomerStatusButton;
	public WebElement getCustomerStatusButton()
	{
		return oCustomerStatusButton;
	}

	//create WebElement for Archived in customer
	@FindBy(xpath="//div[text()=\"Archived\"]")
	private WebElement oCustomerArchived;
	public WebElement getCustomerArchived()
	{
		return oCustomerArchived;
	}

	//create WebElement for customer close button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement oCloseCustomer;
	public WebElement getCustomerCloseButton()
	{
		return oCloseCustomer;
	}

	//create WebElement for New Project
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement oNewProject;
	public WebElement getNewProject()
	{
		return oNewProject;
	}

	//create WebElement for Project Name
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectName()
	{
		return projectPopup_projectNameField;
	}

	//create WebElement for Project Description
	private WebElement projectDescriptionField;
	public WebElement getProjectDescription()
	{
		return projectDescriptionField;
	}

	//create WebElement for Create Project button
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement oCreateProject;
	public WebElement getCreateProjectButton()
	{
		return oCreateProject;
	}

	//create WebElement for Project settings button
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oProjectSettings;
	public WebElement getProjectSettingsButton()
	{
		return oProjectSettings;
	}

	//create WebElement for Project Actions button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oProjectActions;
	public WebElement getProjectActions()
	{
		return oProjectActions;
	}

	//create WebElement for Project Delete button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement oProjectDelete;
	public WebElement getProjectDeleteButton()
	{
		return oProjectDelete;
	}

	//create WebElement for Project Delete confirmation massage
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getDeleteProjectConfirmationMgs()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}

	//create WebElement for project status button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")
	private WebElement oProjectStatusButton;
	public WebElement getProjectStatusButton()
	{
		return oProjectStatusButton;
	}

	//create WebElement for Archived in project
	@FindBy(xpath="//div[text()=\"Archived\"]")
	private WebElement oProjectArchived;
	public WebElement getProjectArchived()
	{
		return oProjectArchived;
	}

	//create WebElement for customer close button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement oCloseProject;
	public WebElement getProjectCloseButton()
	{
		return oCloseProject;
	}

	//create WebElement for Add New Task
	@FindBy(xpath="//div[text()=\"Add New Task\"]")
	private WebElement oAddNewTask;
	public WebElement getAddNewTask()
	{
		return oAddNewTask;
	}

	//create WebElement for Create New Task
	@FindBy(xpath="//div[text()=\"Create new tasks\"]")
	private WebElement oCreateNewTask;
	public WebElement getCreateNewTask()
	{
		return oCreateNewTask;
	}

	//create WebElement for Task name
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement oTaskName;
	public WebElement getTaskName()
	{
		return oTaskName;
	}

	//create WebElement for Create Tasks button
	@FindBy(xpath="//span[text()=\"Create Tasks\"]")
	private WebElement oCreateTask;
	public WebElement getCreateTaskButton()
	{
		return oCreateTask;
	}

	//Create WebElement for task link
	@FindBy(xpath="//div[text()='Task1']")
	private WebElement oTask1Link;
	public WebElement getTaskLinkFromList()
	{
		return oTask1Link;
	}

	//create WebElement for Task Actions button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oTaskActions;
	public WebElement getTaskActions()
	{
		return oTaskActions;
	}

	//create WebElement for Project Delete button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement oTaskDelete;
	public WebElement getTaskDeleteButton()
	{
		return oTaskDelete;
	}

	//create WebElement for Task Delete confirmation massage
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getDeleteTaskConfirmationMgs()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	
	//Create WebElement for user link
	@FindBy(xpath="//span[text()='Demo2, User2']")
	private WebElement oUser2Link;
	public WebElement getUser2LinkFromList()
	{
		return oUser2Link;
	}
	
	//Create WebElement for user link
	@FindBy(xpath="//span[text()='Demo3, User3']")
	private WebElement oUser3Link;
	public WebElement getUser3LinkFromList()
	{
		return oUser3Link;
	}
	
	//Create WebElement for Start exploring actiTIME
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement oStartexploringactiTIME;
	public WebElement getStartexploringactiTIME()
	{
		return oStartexploringactiTIME;
	}
	
}
