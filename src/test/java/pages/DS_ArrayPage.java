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
	ExcelElements excelElements=new ExcelElements();
	
public DS_ArrayPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()=\"Arrays in Python\"]")
private WebElement arraysinPython;
@FindBy(xpath="//*[text()=\"Try here>>>\"]")
private WebElement tryhere;

@FindBy(xpath="//*[text()=\"Arrays Using List\"]")
private WebElement arraysUsingList;

@FindBy(xpath="//*[text()=\"Basic Operations in Lists\"]")
private WebElement basicOperationsInLists;

@FindBy(xpath="//*[text()=\"Applications of Array\"]")
private WebElement applicationsofArray;


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
	
	String code=excelElements.getCodefromExcel(sheetName, rowNum);
	actions.sendKeys(tryEditor.getEditorTextBox(), code).build().perform();
}
public void clickOnArraysUsingList()
{
	Actions actions=new Actions(driver);
	actions.scrollToElement(arraysUsingList).build().perform();
	arraysUsingList.click();
	
}
public void clickOnBasicOperationsInLists()
{
	basicOperationsInLists.click();
}
public void clickOnApplicationsofArray()
{
	applicationsofArray.click();
}




}
