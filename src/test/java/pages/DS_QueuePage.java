package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_QueuePage {

	WebDriver driver;

	public DS_QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()=\"Try here>>>\"]")
	WebElement tryhere;

	@FindBy(xpath = "//a[@href=\"/queue\"]")
	WebElement queue;

	@FindBy(xpath = "//*[text()=\"Implementation of Queue in Python\"]")
	WebElement implementationofQueueinPython;

	@FindBy(xpath = "//*[text()=\"Implementation using collections.deque\"]")
	WebElement implementationusingcollectionsdeque;

	@FindBy(xpath = "//*[text()=\"Implementation using array\"]")
	WebElement implementationusingarray;

	@FindBy(xpath = "//*[text()=\"Queue Operations\"]")
	WebElement queueOperations;

	public void clickOnTryhere() {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryhere).click().build().perform();
	}

	public void clickOnImplementationofQueueinPython() {
		implementationofQueueinPython.click();
	}

	public void clickOnImplementationusingcollectionsdequelink() {
		implementationusingcollectionsdeque.click();
	}

	public void clickOnImplementationusingarraylink() {
		implementationusingarray.click();
	}

	public void clickOnQueueOperationslink() {
		queueOperations.click();
	}
	public void clickOnQueue() {
		Actions actions = new Actions(driver);
		actions.moveToElement(queue).click().build().perform();
	}

}
