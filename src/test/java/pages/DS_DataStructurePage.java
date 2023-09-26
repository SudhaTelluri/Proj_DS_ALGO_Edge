package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelElements;

public class DS_DataStructurePage {
	 WebDriver driver;

	public DS_DataStructurePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[text()=\"Time Complexity\"]")
	private WebElement timecomplexity;
	
	@FindBy(xpath="//*[text()=\"Try here>>>\"]")
	WebElement tryhere;
	
	public void clickOnTimecomplexityLink()
	{
		Actions actions=new Actions(driver);
		actions.scrollToElement(timecomplexity);
		timecomplexity.click();
	}

	public void clickOnTryhereLink()
	{
		tryhere.click();
	}
	
}
