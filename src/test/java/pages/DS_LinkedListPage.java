package pages;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import factory.DriverFactory;
import utilities.ExcelElements;

public class DS_LinkedListPage {
	WebDriver driver=DriverFactory.getDriver();
	ExcelElements excelElements=new ExcelElements();
	public DS_LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@href=\"/linked-list\"]")
	WebElement dropdownLinkedList;
	
	@FindBy(xpath="//*[text()=\"Introduction\"]")
	WebElement introductionLink;
	@FindBy(xpath="//*[text()=\"Try here>>>\"]")
	WebElement tryhere;
	@FindBy(xpath="//*[text()=\"Creating Linked LIst\"]")
	WebElement creatingLinkedListlink;
	
	@FindBy(xpath="//*[text()=\"Types of Linked List\"]")
	WebElement typesOfLinkedListlink;
	
	@FindBy(xpath="//*[text()=\"Types of Linked List\"]")
	WebElement implementLinkedListInPythonlink;
	@FindBy(xpath="//*[text()=\"Traversal\"]")
	WebElement traversallink;
	@FindBy(xpath="//*[text()=\"Insertion\"]")
	WebElement insertionlink;
	@FindBy(xpath="//*[text()=\"Deletion\"]")
	WebElement deletionlink;
	@FindBy(xpath="//div[contains(@class,\"CodeMirror cm-s-default\")]")
	private WebElement editortextbox;

	
	
	public void clickonDropdownLinkedList() {
		Actions actions=new Actions(driver);
		actions.moveToElement(dropdownLinkedList).click().build().perform();
		
	}

	public void clickonIntroductionLink() {
		introductionLink.click();		
	}
	public void clickOnTryhere() {
		Actions actions=new Actions(driver);
		actions.moveToElement(tryhere).click().build().perform();
		
	}
//	public void enterPythonCode(String sheetName,int rowNum) throws InvalidFormatException, IOException
//	{
//		DS_TryEditor tryEditor=new DS_TryEditor(driver);
//		Actions actions=new Actions(driver);
//		
//		String code=excelElements.getCodefromExcel(sheetName, rowNum);
//		actions.sendKeys(tryEditor.getEditorTextBox(), code).build().perform();
//	}
	
	public DS_LinkedListPage enterCodeInTryEditor(String code) {
		Actions actions=new Actions(driver);
		//editortextbox.sendKeys(code);
		actions.sendKeys(editortextbox, code).build().perform();
		return this;
			}
	
	
	
	public void clickOnCreatingLinkedListlink()
	{
		creatingLinkedListlink.click();
	}
	public void clickOnTypesOfLinkedListlinklink()
	{
		typesOfLinkedListlink.click();
	}
	
	public void clickOnImplementLinkedListInPythonlinklink()
	{
		implementLinkedListInPythonlink.click();
	}
	
	public void clickOnTraversallink()
	{
		traversallink.click();
	}
	public void clickOninsertionlink()
	{
		insertionlink.click();
	}
	public void clickOndeletionlink()
	{
		deletionlink.click();
	}
	

}
