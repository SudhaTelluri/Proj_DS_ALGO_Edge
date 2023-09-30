package dsStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.DS_HomePage;
import pages.DS_TreePage;

public class DS_TreeSteps {
	
	DS_DataStructureSteps dataStructureSteps = new DS_DataStructureSteps();
	WebDriver driver = dataStructureSteps.getDriver();
	DS_TreePage treePage=new DS_TreePage(driver);
	
	@Given("User navigates to Tree page using dropdown Data Structure menu")
	public void user_navigates_to_tree_page_using_dropdown_data_structure_menu() {
		DS_HomePage homePage=new DS_HomePage(driver);
		homePage.clickOnDataStructuredropdown();
		homePage.clickOnTreeLink();
	}

	@When("User navigates to tryEditor page by clicking OverviewofTrees link in Tree")
	public void user_navigates_to_try_editor_page_by_clicking_overviewof_trees_link_in_tree() {
		treePage.clickOnOverviewofTrees();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking Terminologies link")
	public void user_navigates_to_try_editor_page_by_clicking_terminologies_link() {
		treePage.clickOnTerminologies();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking TypesofTrees link")
	public void user_navigates_to_try_editor_page_by_clicking_typesof_trees_link() {
		treePage.clickOnTypesofTrees();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking TreeTraversals link")
	public void user_navigates_to_try_editor_page_by_clicking_tree_traversals_link() {
		treePage.clickOnTreeTraversals();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking TraversalsIllustration link")
	public void user_navigates_to_try_editor_page_by_clicking_traversals_illustration_link() {
		treePage.clickOnTraversalIllustration();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking BinaryTrees link")
	public void user_navigates_to_try_editor_page_by_clicking_binary_trees_link() {
		treePage.clickOnBinaryTrees();
		treePage.clickOnTryhere();
	}

	@When("User navigates to tryEditor page by clicking TypesofBinaryTrees link")
	public void user_navigates_to_try_editor_page_by_clicking_typesof_binary_trees_link() {
		treePage.clickOnTypesofBinaryTrees();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking ImplementationinPython link")
	public void user_navigates_to_try_editor_page_by_clicking_implementationin_python_link() {
		treePage.clickOnImplementationinPython();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking BinaryTreeTraversals link")
	public void user_navigates_to_try_editor_page_by_clicking_binary_tree_traversals_link() {
		treePage.clickOnBinaryTreeTraversals();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking ImplementationofBinaryTrees link")
	public void user_navigates_to_try_editor_page_by_clicking_implementationof_binary_trees_link() {
		treePage.clickOnImplementationinBinaryTrees();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking ApplicationsofBinaryTrees link")
	public void user_navigates_to_try_editor_page_by_clicking_applicationsof_binary_trees_link() {
		treePage.clickOnApplicationsofBinaryTrees();
		treePage.clickOnTryhere();
		
	    	}

	@When("User navigates to tryEditor page by clicking BinarySearchTrees link")
	public void user_navigates_to_try_editor_page_by_clicking_binary_search_trees_link() {
		treePage.clickOnBinarySearchTrees();
		treePage.clickOnTryhere();
	    	}

	@When("User navigates to tryEditor page by clicking ImplementationofBST link")
	public void user_navigates_to_try_editor_page_by_clicking_implementationof_bst_link() {
		treePage.clickOnImplementationofBST();
		treePage.clickOnTryhere();
	    	}



}
