package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.ConfigReader;

public class DS_LoginPage {
	WebDriver driver;

	public DS_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"id_username\"]")
	WebElement username;

	@FindBy(xpath = "//input[@id=\"id_password\"]")
	WebElement password;

	@FindBy(xpath = "//*[@value=\"Login\"]")
	WebElement loginbutton;
	@FindBy(xpath = "//div[@class=\"container\"]/following-sibling::div")
	WebElement warningmessage;


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void clickOnLoginButton() {
		loginbutton.click();
	}

	public void login() {

		Properties prop = ConfigReader.intializeProperties();

		username.sendKeys(prop.getProperty("valid_username"));
		password.sendKeys(prop.getProperty("valid_password"));
		loginbutton.click();
	}
	public void enterUsername(String pageusername)
	{
		username.sendKeys(pageusername);	
	}
	public void enterPassword(String pagepwd)
	{
		password.sendKeys(pagepwd);	
	}

	public void signin(String uname,String pwd) {
		//username.clear();
		username.sendKeys(uname);
		//password.clear();
		password.sendKeys(pwd);
	}
	
	public String getWarningMessage()
	{
		return warningmessage.getText();	
	}
}
