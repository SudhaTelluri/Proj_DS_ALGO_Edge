package dsStepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.cucumber.java.en.*;

import pages.DS_DataStructurePage;
import pages.DS_HomePage;
import pages.DS_LoginPage;
import pages.DS_TryEditorPage;
import utilities.ExcelElements;
import utilities.ExcelReader;

public class DS_DataStructureSteps {
	DS_LoginSteps loginSteps = new DS_LoginSteps();
	WebDriver driver = loginSteps.getDriver();
	DS_DataStructurePage dataStructurePage=new DS_DataStructurePage(driver);

	@When("User enters valid Username, password and click on Login button")
	public void user_enters_valid_username_password_and_click_on_login_button() {
		DS_LoginPage loginPage = new DS_LoginPage(driver);
		loginPage.login();
	}

	@When("User clicks on Get Started link of DataStructures intro page")
	public void user_clicks_on_get_started_link_of_data_structures_intro_page()
			throws IOException, InterruptedException {
		DS_HomePage homePage = new DS_HomePage(driver);
		homePage.clickOnDSintroLink();
		DS_DataStructurePage dataStructurePage = new DS_DataStructurePage(driver);
		dataStructurePage.clickOnTimecomplexityLink();
		dataStructurePage.clickOnTryhereLink();
	}

	@Then("User navigates to editor page")
	public void user_navigates_to_editor_page() {
		DS_TryEditorPage tryEditor = new DS_TryEditorPage(driver);
		tryEditor.getEditorTextBox().click();
		String actual_result = driver.getTitle();
		Assert.assertEquals(actual_result, "Assessment");
	}

	@When("Enters the basic python code in editor and click on run")
	public void enters_the_basic_python_code_in_editor_and_click_on_run() throws InvalidFormatException, IOException {
		DS_TryEditorPage tryEditor = new DS_TryEditorPage(driver);
		tryEditor.senddatatoEditorTextbox();
	}

	@Then("Output should print on editor")
	public void output_should_print_on_editor() {
		DS_TryEditorPage tryEditor = new DS_TryEditorPage(driver);
		tryEditor.clickOnRunButton();
		String output = tryEditor.getTextFromOutput();
		System.out.println("Output of sample DataStructure code :" + output);

	}

	@When("User enters the invalid python code from xlsheet {string} and rownum {int}")
	public void user_enters_the_invalid_python_code_from_xlsheet_and_rownum(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		
		dataStructurePage.enterInvalidPythonCode(sheetName,rowNumber);
		
	    	}


	@Then("User output must be blank")
	public void user_output_must_be_blank() {
		String actualMessage=dataStructurePage.getTextFromoutputField();
		Assert.assertEquals(actualMessage, "");
			}

	public WebDriver getDriver() {
		return driver;
	}

}
