package hooks;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.ConfigReader;

public class DSHooks {
		
	WebDriver driver;
	public static DriverFactory driverFactory;
	static Scenario scenario;
	@Before
public  void setUp(Scenario scenario) 
//scenario is used to get the scenario name
{
	System.out.println("***Execution starts for scenario "+scenario.getName());
	Properties prop = ConfigReader.intializeProperties();
	DriverFactory.intializeBrowser(prop.getProperty("browser"));
	driver=DriverFactory.getDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get(prop.getProperty("url"));
}
//after hook run after each scenario

@After
public void tearDown(Scenario scenario)
{	
	String scenarioName=scenario.getName().replaceAll(" ", "_");
	if(scenario.isFailed())
	{
		byte[] sourcescreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcescreenshot, "img/png", scenarioName);
		Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(sourcescreenshot));
	}
driver.quit();
System.out.println("***Execution ends for scenario "+scenario.getName());
}
}
