package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelElements;

public class DS_GraphPage {
	WebDriver driver;
	ExcelElements excelElements=new ExcelElements();
	
public DS_GraphPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()=\"Try here>>>\"]")
private WebElement tryhere;


@FindBy(xpath="//*[@href=\"graph\"]")
private WebElement graphelement ;

@FindBy(xpath="//*[text()=\"Graph Representations\"]")
private WebElement graphRepresentations;



public void clickOnTryhere() {
	Actions actions = new Actions(driver);
	actions.moveToElement(tryhere).click().build().perform();
}
public void clickOnGraphelement()
{
	graphelement.click();
}
public void clickOnGraphRepresentations()
{
	graphRepresentations.click();
}

}
