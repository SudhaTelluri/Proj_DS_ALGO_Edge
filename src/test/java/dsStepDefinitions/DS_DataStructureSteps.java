package dsStepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.cucumber.java.en.*;
import pages.DS_DataStructurePage;
import pages.DS_HomePage;
import pages.DS_LoginPage;
import pages.TryEditor;
import utilities.ExcelElements;
import utilities.ExcelReader;

public class DS_DataStructureSteps {
	DS_LoginSteps loginSteps=new DS_LoginSteps();
	WebDriver driver=loginSteps.getDriver();
	@When("User enters valid Username, password and click on Login button")
	public void user_enters_valid_username_password_and_click_on_login_button()  {
		DS_LoginPage loginPage=new DS_LoginPage(driver);
		loginPage.login();
	   	}

	@When("User clicks on Get Started link of DataStructures intro page")
	public void user_clicks_on_get_started_link_of_data_structures_intro_page() throws IOException, InterruptedException {
		DS_HomePage homePage=new DS_HomePage(driver);
		homePage.clickOnDSintroLink();
		DS_DataStructurePage dataStructurePage=new DS_DataStructurePage(driver);
		dataStructurePage.clickOnTimecomplexityLink();
		dataStructurePage.clickOnTryhereLink();
					   }

	@Then("User navigates to editor page")
	public void user_navigates_to_editor_page() {
		TryEditor tryEditor=new TryEditor(driver);
		tryEditor.getEditorTextBox().click();
	    }

	@When("Enters the basic python code in editor and click on run")
	public void enters_the_basic_python_code_in_editor_and_click_on_run() throws InvalidFormatException, IOException {
		TryEditor tryEditor=new TryEditor(driver);
		tryEditor.senddatatoEditorTextbox();
	    }

	@Then("Output should print on editor")
	public void output_should_print_on_editor() {
		TryEditor tryEditor=new TryEditor(driver);
		tryEditor.clickOnRunButton();
		String output=tryEditor.getTextFromOutput();
		System.out.println("Output of sample DataStructure code :"+output);
		
	    }


}
