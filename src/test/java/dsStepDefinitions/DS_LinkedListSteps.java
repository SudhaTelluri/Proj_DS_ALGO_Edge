package dsStepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DS_ArrayPage;
import pages.DS_HomePage;
import pages.DS_LinkedListPage;
import pages.DS_LoginPage;
import pages.DS_TryEditorPage;
import utilities.ExcelElements;
import utilities.ExcelReader;

public class DS_LinkedListSteps {
	DS_DataStructureSteps dataStructureSteps = new DS_DataStructureSteps();
	WebDriver driver = dataStructureSteps.getDriver();

	DS_LinkedListPage linkedListPage = new DS_LinkedListPage(driver);

	@When("User login to the application")
	public void user_login_to_the_application() {
		DS_LoginPage loginPage = new DS_LoginPage(driver);
		loginPage.login();
	}

	@Given("User navigates to LinkedList page using dropdown Data Structure menu")
	public void user_navigates_to_linked_list_page_using_dropdown_data_structure_menu() throws InterruptedException {
		DS_HomePage homePage = new DS_HomePage(driver);
		homePage.clickOnDataStructuredropdown();
		linkedListPage.clickonDropdownLinkedList();

	}

	@When("User navigates to tryEditor page by clicking introduction link")
	public void user_navigates_to_try_editor_page_by_clicking_introduction_link() throws InterruptedException {
		linkedListPage.clickonIntroductionLink();
		linkedListPage.clickOnTryhere();
	}

	@Then("User enters code in tryEditor from sheet {string} and rownumber {int}")
	public void user_enters_code_in_try_editor_from_sheet_and_rownumber(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException, InterruptedException {
		String code=ExcelElements.getCodefromExcel(sheetName, rowNum);
		linkedListPage.enterCodeInTryEditor(code);
	}

	@Then("User click on Run")
	public void user_click_on_run() {
		DS_TryEditorPage tryEditor = new DS_TryEditorPage(driver);
		tryEditor.clickOnRunButton();
	}

	@Then("User should get the output")
	public void user_should_get_the_output() {
		DS_TryEditorPage tryEditor = new DS_TryEditorPage(driver);
		String output = tryEditor.getTextFromOutput();
		System.out.println("<<<<<<<<<<<<<<<Arrays in Python link code output>>>>>>>> :" + output);
	}

	@When("User navigates to tryEditor page by clicking Created Linked List link")
	public void user_navigates_to_try_editor_page_by_clicking_created_linked_list_link() {
		linkedListPage.clickOnCreatingLinkedListlink();
		linkedListPage.clickOnTryhere();
	}

	@When("User navigates to tryEditor page by clicking Types of Linked List link")
	public void user_navigates_to_try_editor_page_by_clicking_types_of_linked_list_link() {
		linkedListPage.clickOnTypesOfLinkedListlinklink();
		linkedListPage.clickOnTryhere();
	}

	@When("User navigates to tryEditor page by clicking Implement Linked List in Python link")
	public void user_navigates_to_try_editor_page_by_clicking_implement_linked_list_in_python_link() {
		linkedListPage.clickOnImplementLinkedListInPythonlinklink();
		linkedListPage.clickOnTryhere();
	}

	@When("User navigates to tryEditor page by clicking Traversal link")
	public void user_navigates_to_try_editor_page_by_clicking_traversal_link() {
		linkedListPage.clickOnTraversallink();
		linkedListPage.clickOnTryhere();
	}

	@When("User navigates to tryEditor page by clicking Insertion link")
	public void user_navigates_to_try_editor_page_by_clicking_insertion_link() {
		linkedListPage.clickOninsertionlink();
		linkedListPage.clickOnTryhere();
	}

	@When("User navigates to tryEditor page by clicking Deletion link")
	public void user_navigates_to_try_editor_page_by_clicking_deletion_link() {
		linkedListPage.clickOndeletionlink();
		linkedListPage.clickOnTryhere();
	}

	public WebDriver getDriver() {
		return driver;

	}

}
