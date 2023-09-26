package dsStepDefinitions;

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


	@Then("User click on Sign in link")
	public void user_click_on_sign_in_link() {
		DS_HomePage homePage=new DS_HomePage(driver);
		homePage.clickOnSignin();
	    }
	@When("^User enters valid Username (.+)$")
	public void user_enters_valid_username(String username) 
	{
		DS_LoginPage loginPage=new DS_LoginPage(driver);
		loginPage.getUsername().sendKeys(username);
	}

	@And("^Enters valid Password (.+)$")
	public void enters_valid_password(String password) {
		DS_LoginPage loginPage=new DS_LoginPage(driver);
		loginPage.getPassword().sendKeys(password);
	}
	
	@When("clicks on Login button")
	public void clicks_on_login_button() {
		DS_LoginPage loginPage=new DS_LoginPage(driver);
		
		loginPage.clickOnLoginButton();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		DS_HomePage homePage=new DS_HomePage(driver);
		Assert.assertTrue(homePage.signOutLink());
		
	}
	public WebDriver getDriver()
	{
		return driver;
	}
}
