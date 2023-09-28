package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelElements;

public class DS_TryEditor {
	WebDriver driver;
	public DS_TryEditor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(@class,\"CodeMirror cm-s-default\")]")
	private WebElement editortextbox;
	@FindBy(xpath="//*[text()=\"Run\"]")
	private WebElement runButton;

	@FindBy(xpath="//*[@id=\"output\"]")
	private WebElement output;

	
	public void senddatatoEditorTextbox() throws IOException
	{
		editortextbox.click();		
		ExcelElements excel=new ExcelElements();
		String code=excel.getCodefromExcel("Data", 0);
		Actions actions=new Actions(driver);
		actions.sendKeys(editortextbox, code).build().perform();
		//excel.enterCode(code, editortextbox);
		
		}
	
	public WebElement getEditorTextBox()
	{
		return editortextbox;
	}
	public void clickOnRunButton()
	{
		runButton.click();
	}
	
	public String getTextFromOutput()
	{
		return output.getText();
	}
}
