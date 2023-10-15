package dsStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DS_HomePage;



public class DS_HomeSteps {
	
	DS_GetStartedSteps getStartedSteps=new DS_GetStartedSteps();
	WebDriver driver=getStartedSteps.getDriver();
	DS_HomePage homePage=new DS_HomePage(driver);
	@When("User selects one of the dropdownoption {string}")
	public void user_selects_one_of_the_dropdownoption(String option) {
		homePage.clickOnDataStructuredropdown();
		homePage.dropdown(option);
		
	    	}

	@Then("User should get warning message {string}")
	public void user_should_get_warning_message(String warningmessage) {
		String actualMessage=homePage.getWarningMessage();
	Assert.assertEquals(actualMessage, "You are not logged in");
	}
	@Then("User should be redirected to register page")
	public void user_should_be_redirected_to_register_page() {
		String actualMessage=driver.getTitle();
		Assert.assertEquals(actualMessage, "Registration");
	    	}

	@Then("User should be redirected to login page")
	public void user_should_be_redirected_to_login_page() {
		String actualMessage=driver.getTitle();
		Assert.assertEquals(actualMessage, "Login");
	}
		
	@When("The user clicks on Get Started links on homepage {string} without loging in")
	public void the_user_clicks_on_get_started_links_on_homepage_without_loging_in(String string) {
		homePage.getStartedMethod(string);
	}





}
