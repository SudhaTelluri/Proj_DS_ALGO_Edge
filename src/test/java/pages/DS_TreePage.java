package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_TreePage {
	WebDriver driver;
	public DS_TreePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=\"Overview of Trees\"]")
	private WebElement overviewofTrees;

	@FindBy(xpath="//*[text()=\"Terminologies\"]")
	private WebElement terminologies;
	@FindBy(xpath="//*[text()=\"Types of Trees\"]")
	private WebElement typesofTrees;
	@FindBy(xpath="//*[text()=\"Tree Traversals\"]")
	private WebElement treeTraversals;
	@FindBy(xpath="//*[text()=\"Traversals-Illustration\"]")
	private WebElement traversalIllustration;
	@FindBy(xpath="//*[text()=\"Binary Trees\"]")
	private WebElement binaryTrees;
	@FindBy(xpath="//*[text()=\"Types of Binary Trees\"]")
	private WebElement typesofBinaryTrees;
	@FindBy(xpath="//*[text()=\"Implementation in Python\"]")
	private WebElement implementationinPython;
	@FindBy(xpath="//*[text()=\"Applications of Binary trees\"]")
	private WebElement applicationsofBinaryTrees;
	@FindBy(xpath="//*[text()=\"Binary Tree Traversals\"]")
	private WebElement binaryTreeTraversals;
	@FindBy(xpath="//*[text()=\"Implementation of Binary Trees\"]")
	private WebElement implementationinBinaryTrees;
	@FindBy(xpath="//*[text()=\"Binary Search Trees\"]")
	private WebElement binarySearchTrees;
	@FindBy(xpath="//*[text()=\"Implementation Of BST\"]")
	private WebElement implementationofBST;
	
	@FindBy(xpath="//*[text()=\"Try here>>>\"]")
	private WebElement tryhere;

	
	
	
	
	

	public void clickOnOverviewofTrees()
	{
		overviewofTrees.click();
	}

	
	public void clickOnTerminologies()
	{
		terminologies.click();
	}

	public void clickOnTypesofTrees()
	{
		typesofTrees.click();
	}

	public void clickOnTreeTraversals()
	{
		treeTraversals.click();
	}

	public void clickOnTraversalIllustration()
	{
		traversalIllustration.click();
	}

	public void clickOnBinaryTrees()
	{
		binaryTrees.click();
	}

	public void clickOnTypesofBinaryTrees()
	{
		typesofBinaryTrees.click();
	}

	public void clickOnImplementationinPython()
	{
		implementationinPython.click();
	}

	public void clickOnApplicationsofBinaryTrees()
	{
		applicationsofBinaryTrees.click();
	}

	public void clickOnBinaryTreeTraversals()
	{
		binaryTreeTraversals.click();
	}

	public void clickOnImplementationinBinaryTrees()
	{
		implementationinBinaryTrees.click();
	}

	public void clickOnBinarySearchTrees()
	{
		binarySearchTrees.click();
	}

	public void clickOnImplementationofBST()
	{
		implementationofBST.click();
	}
	public void clickOnTryhere() {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryhere).click().build().perform();
	}
	
	
	
}
