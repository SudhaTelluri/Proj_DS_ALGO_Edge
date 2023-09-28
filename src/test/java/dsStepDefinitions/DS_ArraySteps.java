package dsStepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.cucumber.java.en.*;
import pages.DS_ArrayPage;
import pages.DS_HomePage;
import pages.DS_TryEditor;
import utilities.ExcelElements;

public class DS_ArraySteps {

	DS_LoginSteps loginSteps = new DS_LoginSteps();
	DS_DataStructureSteps dataStructureSteps = new DS_DataStructureSteps();
	WebDriver driver = dataStructureSteps.getDriver();
	DS_ArrayPage arrayPage = new DS_ArrayPage(driver);

	@Given("User navigates to Arrays page by using dropdown menu in Home Page")
	public void user_navigates_to_arrays_page_by_using_dropdown_menu_in_home_page() {
		DS_HomePage homePage = new DS_HomePage(driver);
		homePage.gotoArraysPage();
	}

	@When("User click on Arrays in Python link")
	public void user_click_on_arrays_in_python_link() {

		arrayPage.clickOnArraysinPython();

	}

	@When("User navigates to tryeditor page")
	public void user_navigates_to_tryeditor_page() throws InvalidFormatException, IOException {
		Actions actions = new Actions(driver);
		actions.moveToElement(arrayPage.getTryhere()).perform();
		arrayPage.getTryhere().click();

	}

	@When("User enters valid python code in tryEditor from sheet {string} and rownumber {int}")
	public void user_enters_valid_python_code_in_try_editor_from_sheet_and_rownumber(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		DS_ArrayPage arrayPage = new DS_ArrayPage(driver);
		arrayPage.enterPythonCode(sheetName, rowNum);

	}

	@Then("User should get appropriate output")
	public void user_should_get_appropriate_output() {
		DS_TryEditor tryEditor = new DS_TryEditor(driver);
		tryEditor.clickOnRunButton();
		String output = tryEditor.getTextFromOutput();
		System.out.println("<<<<<<<<<<<<<<<Arrays in Python link code output>>>>>>>> :" + output);

	}

	@When("User click on Arrays Using List link")
	public void user_click_on_arrays_using_list_link() {
		arrayPage.clickOnArraysUsingList();
	}

	@When("User enters Arrays using List python code in tryEditor from sheet {string} and rownumber {int}")
	public void user_enters_arrays_using_list_python_code_in_try_editor_from_sheet_and_rownumber(String sheetName,
			Integer rowNum) throws InvalidFormatException, IOException {

		arrayPage.enterPythonCode(sheetName, rowNum);

	}

	@When("User click on Basic Operations in Lists")
	public void user_click_on_basic_operations_in_lists() {
		arrayPage.clickOnBasicOperationsInLists();
			}

	@When("User enters basic operations of list code in tryEditor from sheet {string} and rownumber {int}")
	public void user_enters_basic_operations_of_list_code_in_try_editor_from_sheet_and_rownumber(String sheetName,
			Integer rowNum) throws InvalidFormatException, IOException {
		arrayPage.enterPythonCode(sheetName, rowNum);
			}
	@When("User click on Applications of Array link")
	public void user_click_on_applications_of_array_link() {
		arrayPage.clickOnApplicationsofArray();
	    	}

	@When("User enters Applications of Array code in tryEditor from sheet {string} and rownumber {int}")
	public void user_enters_applications_of_array_code_in_try_editor_from_sheet_and_rownumber(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		arrayPage.enterPythonCode(sheetName, rowNum);
	    	}




}
