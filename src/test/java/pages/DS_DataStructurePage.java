package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

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
	
	@FindBy(xpath="//*[@id=\"output\"]")
	WebElement outputField;
	
	
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
	public void enterInvalidPythonCode(String sheetname,int rownum) throws InvalidFormatException, IOException {
		ExcelElements excelElements=new ExcelElements();
		Actions actions=new Actions(driver);
		DS_TryEditorPage tryEditorPage=new DS_TryEditorPage(driver);
		String code=excelElements.getCodefromExcel(sheetname, rownum);
		actions.sendKeys(tryEditorPage.getEditorTextBox(),code).build().perform();
		
		
	}
	public String getTextFromoutputField()
	{
		return outputField.getText();
	}
	
	
}
