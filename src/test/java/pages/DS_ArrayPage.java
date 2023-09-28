package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import utilities.ExcelElements;

public class DS_ArrayPage {
	
	WebDriver driver;
	
public DS_ArrayPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()=\"Arrays in Python\"]")
private WebElement arraysinPython;
@FindBy(xpath="//*[text()=\"Try here>>>\"]")
private WebElement tryhere;

public void clickOnArraysinPython()
{
	arraysinPython.click();
}
public WebElement getTryhere()
{
	return tryhere;
}
public void enterPythonCode(String sheetName,int rowNum) throws InvalidFormatException, IOException
{
	DS_TryEditor tryEditor=new DS_TryEditor(driver);
	Actions actions=new Actions(driver);
	ExcelElements excelElements=new ExcelElements();
	String code=excelElements.getCodefromExcel(sheetName, rowNum);
	actions.sendKeys(tryEditor.getEditorTextBox(), code).build().perform();
	
	
}

}
