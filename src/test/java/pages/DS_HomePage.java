package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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




}
