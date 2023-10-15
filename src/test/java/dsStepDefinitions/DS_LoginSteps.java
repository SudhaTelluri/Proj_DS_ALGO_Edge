package dsStepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DS_HomePage;
import pages.DS_LoginPage;
import pages.DS_RegisterPage;

public class DS_LoginSteps {
	
	
	DS_RegisterSteps registerSteps=new DS_RegisterSteps();
	
	WebDriver driver = registerSteps.getDriver();
	DS_LoginPage loginPage=new DS_LoginPage(driver);

	@Then("User click on Sign in link")
	public void user_click_on_sign_in_link() {
		DS_HomePage homePage=new DS_HomePage(driver);
		homePage.clickOnSignin();
	    }
	@When("^User enters valid Username (.+)$")
	public void user_enters_valid_username(String username) 
	{
		
		loginPage.getUsername().sendKeys(username);
	}

	@And("^Enters valid Password (.+)$")
	public void enters_valid_password(String password) {
		
		loginPage.getPassword().sendKeys(password);
	}
	
	@When("clicks on Login button")
	public void clicks_on_login_button() {
		
		
		loginPage.clickOnLoginButton();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		DS_HomePage homePage=new DS_HomePage(driver);
		Assert.assertTrue(homePage.signOutLink());
		
	}
	
	@When("User enters invalid username {string} into username field")
	public void user_enters_invalid_username_into_username_field(String invalidUsernameText) {
		
		loginPage.getUsername().sendKeys(invalidUsernameText);
	    	}

	@And("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidPasswrodText) {
		loginPage.getPassword().sendKeys(invalidPasswrodText);
	    	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		DS_LoginPage loginPage=new DS_LoginPage(driver);
		loginPage.clickOnLoginButton();
	    	}

	@Then("User should get proper warning message like invalid credentials")
	public void user_should_get_proper_warning_message_like_invalid_credentials() {
		DS_LoginPage loginPage=new DS_LoginPage(driver);
		String errormsg=loginPage.getWarningMessage();
		Assert.assertEquals(errormsg, "Invalid Username and Password");
	}

	@When("User enters valid username {string} into username field")
	public void user_enters_valid_username_into_username_field(String validUsernameText) {
		loginPage.getUsername().sendKeys(validUsernameText);
	    	}

		@And("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String validPasswordText) {
		loginPage.getPassword().sendKeys(validPasswordText);
	    
	}


	public WebDriver getDriver()
	{
		return driver;
	}
}
