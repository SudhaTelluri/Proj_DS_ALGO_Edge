package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_StackPages {
	WebDriver driver;
	public DS_StackPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()=\"Operations in Stack\"]")
	private WebElement OperationsinStacklink;

	@FindBy(xpath="//*[text()=\"Implementation\"]")
	private WebElement implementationlink;

	@FindBy(xpath="//*[text()=\"Applications\"]")
	private WebElement applications;

	@FindBy(xpath="//*[text()=\"Try here>>>\"]")
	WebElement tryhere;

	
	

	
	public void clickOnOperationsinStacklink()
	{
		OperationsinStacklink.click();
	}
	public void clickOnImplementationlink()
	{
		implementationlink.click();
	}
	public void clickOnApplicationsLink()
	{
		applications.click();
	}
	public void clickOnTryhere() {
		Actions actions=new Actions(driver);
		actions.moveToElement(tryhere).click().build().perform();
	}

}
