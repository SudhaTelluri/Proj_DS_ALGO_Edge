package dsStepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DS_HomePage;
import pages.DS_RegisterPage;

public class DS_RegisterSteps {
	
	DS_GetStartedSteps getStartedSteps = new DS_GetStartedSteps();
	WebDriver driver = getStartedSteps.getDriver();


	@When("User click on Register link")
	public void user_click_on_register_link() 
	{
		DS_HomePage homePage = new DS_HomePage(driver);
		homePage.clickOnRegisterLink();

	    	}

	@When("User enters required fields and click on Register button")
	public void user_enters_required_fields_and_click_on_register_button() {
		DS_HomePage homePage = new DS_HomePage(driver);
		homePage.clickOnRegisterLink();

	    }

	@Then("User should login to their account")
	public void user_should_login_to_their_account() {
		DS_RegisterPage registerPage = new DS_RegisterPage(driver);
		registerPage.register();

	    }
	
	@When("User doesn't enter any details into fields and click on Register button")
	public void user_doesn_t_enter_any_details_into_fields_and_click_on_register_button() {
		DS_RegisterPage registerPage = new DS_RegisterPage(driver); 
		registerPage.ClickOnregisterbutton();
	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() {
		System.out.println("<<<<<Please fill out this field>>>>>");
	    	}

	@When("User enters details into below fields")
	public void user_enters_details_into_below_fields(DataTable dataTable) {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		DS_RegisterPage registerPage = new DS_RegisterPage(driver);
		registerPage.getUsernameField().sendKeys(dataMap.get("Username"));
		registerPage.getPasswordField().sendKeys(dataMap.get("Password"));
		registerPage.getConfirmPasswordField().sendKeys(dataMap.get("Password Confirmation"));
	    	}

	@When("User clicks on register button")
	public void user_clicks_on_register_button() {
		DS_RegisterPage registerPage = new DS_RegisterPage(driver);
		registerPage.ClickOnregisterbutton();
	    	}

	@Then("User should get error message")
	public void user_should_get_error_message() {
		DS_RegisterPage registerPage = new DS_RegisterPage(driver);
		String expectedMessage="password_mismatch:The two password fields didn’t match.";
		String actualMessage=registerPage.getAlertMessage();
		Assert.assertEquals(actualMessage, expectedMessage);
	    	}

public WebDriver getDriver(){
		return driver;
	}

}
