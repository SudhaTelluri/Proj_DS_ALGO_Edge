package dsStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.DS_HomePage;
import pages.DS_QueuePage;

public class DS_QueueSteps {
	DS_LinkedListSteps linkedListSteps=new DS_LinkedListSteps();
	WebDriver driver=linkedListSteps.getDriver();
	DS_QueuePage queuePage=new DS_QueuePage(driver);
	DS_HomePage homePage=new DS_HomePage(driver);

	@Given("User navigates to Queue page using dropdown Data Structure menu")
	public void user_navigates_to_queue_page_using_dropdown_data_structure_menu() {
		homePage.clickOnDataStructuredropdown();
		queuePage.clickOnQueue();
		
	    	}

	@When("User navigates to tryEditor page by clicking Implementation of Queue in Python link")
	public void user_navigates_to_try_editor_page_by_clicking_implementation_of_queue_in_python_link() {
		queuePage.clickOnImplementationofQueueinPython();
		queuePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking Implementationusingcollectionsdeque link")
	public void user_navigates_to_try_editor_page_by_clicking_implementationusingcollectionsdeque_link() {
		queuePage.clickOnImplementationusingcollectionsdequelink();
		queuePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking Implementationusingarray link")
	public void user_navigates_to_try_editor_page_by_clicking_implementationusingarray_link() {
		queuePage.clickOnImplementationusingarraylink();
		queuePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking QueueOperations link")
	public void user_navigates_to_try_editor_page_by_clicking_queue_operations_link() {
		queuePage.clickOnQueueOperationslink();
		queuePage.clickOnTryhere();
	   	}



}
