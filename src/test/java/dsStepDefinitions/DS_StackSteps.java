package dsStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DS_HomePage;
import pages.DS_StackPages;

public class DS_StackSteps {
	DS_LinkedListSteps linkedListSteps=new DS_LinkedListSteps();
	WebDriver driver=linkedListSteps.getDriver();
	DS_StackPages stackPages=new DS_StackPages(driver);
	@Given("User navigates to Stack page using dropdown Data Structure menu")
	public void user_navigates_to_stack_page_using_dropdown_data_structure_menu() {
		DS_HomePage homePage=new DS_HomePage(driver);
		homePage.clickOnDataStructuredropdown();
		homePage.clickOnStackdropdown();
	    	}

	@When("User navigates to tryEditor page by clicking Operations in Stack link")
	public void user_navigates_to_try_editor_page_by_clicking_operations_in_stack_link() {
		stackPages.clickOnOperationsinStacklink();
		stackPages.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking Implementation link")
	public void user_navigates_to_try_editor_page_by_clicking_implementation_link() {
		stackPages.clickOnImplementationlink();
		stackPages.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking Applications link")
	public void user_navigates_to_try_editor_page_by_clicking_applications_link() {
		stackPages.clickOnApplicationsLink();
		stackPages.clickOnTryhere();
	}



}
