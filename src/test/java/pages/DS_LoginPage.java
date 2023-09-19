package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_LoginPage {
	WebDriver driver;
	public DS_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath="//input[@id=\"id_username\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@id=\"id_password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@value=\"Login\"]")
	WebElement loginbutton;

	
	
	
	public WebElement getUsername()
	{
		return username;
	}
	
	public WebElement getPassword()
	{
		return password;
	}
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}
}
