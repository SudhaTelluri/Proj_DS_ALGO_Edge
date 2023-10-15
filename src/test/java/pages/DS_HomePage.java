package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.LoggerLoad;

public class DS_HomePage {

	WebDriver driver;
	public DS_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=\"Get Started\"]")
	private WebElement getStarted;
	
	@FindBy(xpath="//*[text()=\" Register \"]")
	private WebElement register;

	@FindBy(xpath="//*[text()=\"Sign out\"]")
	private WebElement signOut;
	
	@FindBy(xpath="//*[text()=\"Sign in\"]")
	private WebElement signin;
	
	@FindBy(xpath="//a[contains(@href,\"data-structures-introduction\")]")
	private WebElement ds_intro;
	
	@FindBy(xpath="//*[text()=\"Data Structures\"]")
	private WebElement dataStructuredropdown;
	
	@FindBy(xpath="//*[text()=\"Arrays\"]")
	private WebElement Arraysoptions;
	
	@FindBy(xpath="//a[@href=\"/stack\"]")
	private WebElement stack;

	@FindBy(xpath="//a[@href=\"/tree\"]")
	private WebElement tree;
	
	@FindBy(xpath="//a[@href=\"/graph\"]")
	private WebElement graphLink;

	@FindBy(xpath="//*[text()=\"Sign out\"]")
	private WebElement singoutLink;

	@FindBy(xpath="//*[contains(@class,\"alert alert-primary\")]")
	private WebElement logoutmsg;
	
	@FindBy(xpath="//*[text()=\"Arrays\"]")
	private WebElement dropdown_array;

	@FindBy(xpath="//a[text()=\"Linked List\"]")
	private WebElement dropdown_LinkedList;

	@FindBy(xpath="//a[text()=\"Stack\"]")
	private WebElement dropdown_Stack;

	@FindBy(xpath="//a[text()=\"Queue\"]")
	private WebElement dropdown_Queue;

	@FindBy(xpath="//a[text()=\"Tree\"]")
	private WebElement dropdown_Tree;

	@FindBy(xpath="//a[text()=\"Graph\"]")
	private WebElement dropdown_Graph;
	
	@FindBy(xpath="//div[contains(@class,\"alert alert-primary\")]")
	private WebElement warningMessage;
	
	@FindBy(xpath="//a[@href=\"data-structures-introduction\"]")
	private WebElement home_DS_GetStarted;

	@FindBy(xpath="//a[@href=\"array\"]")
	private WebElement home_Array_GetStarted;

	@FindBy(xpath="//a[@href=\"linked-list\"]")
	private WebElement home_LinkedList_GetStarted;

	@FindBy(xpath="//a[@href=\"stack\"]")
	private WebElement home_Stack_GetStarted;

	@FindBy(xpath="//a[@href=\"queue\"]")
	private WebElement home_Queue_GetStarted;

	@FindBy(xpath="//a[@href=\"tree\"]")
	private WebElement home_Tree_GetStarted;

	@FindBy(xpath="//a[@href=\"graph\"]")
	private WebElement home_Graph_GetStarted;

			
	public void clickOnRegisterLink()
	{
		register.click();
	}

	public boolean signOutLink()
	{
		return signOut.isDisplayed();
	}
	public void clickOngetStarted()
	{
		getStarted.click();
	}
	
	public String getHomePageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String getRegisterPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void clickOnSignin()
	{
		signin.click();
	}

	public void clickOnDSintroLink()
	{
		ds_intro.click();
	}
	
	public void gotoArraysPage()
	{
		dataStructuredropdown.click();
		Arraysoptions.click();
	}
	public void clickOnDataStructuredropdown()
	{
		dataStructuredropdown.click();
	}
	public void clickOnStackdropdown()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(stack).click().build().perform();
	}
	public void clickOnTreeLink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(tree).click().build().perform();

	}
	public void clickOnGraphLink()
	{
		graphLink.click();
	}
	public void clickOnSingoutLink()
	{
		singoutLink.click();
	}
	public boolean logOutMessage()
	{
		return logoutmsg.isDisplayed();
	}

	public void dropdown(String dropdownoption)
	{
		

		        switch (dropdownoption) {
		            case "Arrays":
		                LoggerLoad.info("User clicked on Arrays Option");
		                dropdown_array.click();
		                break;
		            case "Linked List":
		            	LoggerLoad.info("User clicked on Linked List Option");
		            	dropdown_LinkedList.click();
		                break;
		            case "Stack":
		            	LoggerLoad.info("User clicked on Stack Option");
		            	dropdown_Stack.click();
		                break;
		            case "Queue":
		            	LoggerLoad.info("User clicked on Queue Option");
		            	dropdown_Queue.click();
		                break;
		            case "Tree":
		            	LoggerLoad.info("User clicked on Tree Option");
		            	dropdown_Tree.click();
		                break;
		            case "Graph":
		            	LoggerLoad.info("User clicked on Graph Option");
		            	dropdown_Graph.click();
		                break;
		        }
		    }
	public String getWarningMessage()
	{
		return warningMessage.getText();
	}
	
	public void getStartedMethod(String option) {
		

	switch (option) {
	    case "Datastructures_GetStarted":
	    	home_DS_GetStarted.click();
	        break;
	    case "Arrays_GetStarted":
	    	home_Array_GetStarted.click();
	        	        break;
	    case "Linkedlist_GetStarted":
	    	home_LinkedList_GetStarted.click();
	        break;
	    case "Stack_GetStarted":
	    	home_Stack_GetStarted.click();
	        break;
	    case "Queue_GetStarted":
	    	home_Queue_GetStarted.click();
	        break;
	    case "Tree_GetStarted":
	    	home_Tree_GetStarted.click();
	        break;
	    case "Graph_GetStarted":
	    	home_Graph_GetStarted.click();
	        break;
	}

	}
	}



