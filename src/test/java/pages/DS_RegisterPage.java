package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_RegisterPage {
	
	WebDriver driver;
	
	public DS_RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_username")
	WebElement username;

	@FindBy(id = "id_password1")
	WebElement password;

	@FindBy(id = "id_password2")
	WebElement password2;
	
	@FindBy(xpath="//*[@value=\"Register\"]")
	WebElement register;
	@FindBy(linkText="Login ")
	WebElement loginlink;
	
	@FindBy(xpath="//div[contains(@class,\"alert alert-primary\")]")
	WebElement alertMessage;
	
	public void clickOnLoginlink()
	{
		Actions actions=new Actions(driver);
	 actions.moveToElement(loginlink).click().perform();
		
	}


	public void register() {
	
		java.util.Random random=new java.util.Random();
		int random_int=random.nextInt(300);
	
		username.sendKeys("Shambhavi"+random_int);
		String var2="Vishnuvu"+random_int;
		password.sendKeys(var2);
		password2.sendKeys(var2);
		register.click();
	}

	public void ClickOnregisterbutton()
	{
		register.click();
	}
	
	public WebElement getUsernameField()
	{
		return username;
	}
	public WebElement getPasswordField()
	{
		return password;
	}
	public WebElement getConfirmPasswordField()
	{
		return password2;
	}
	
	public String getAlertMessage()
	{
		return alertMessage.getText();
	}
	
	




}
