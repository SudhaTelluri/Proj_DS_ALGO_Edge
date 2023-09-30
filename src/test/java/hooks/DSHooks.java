package hooks;



import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class DSHooks {
	
	WebDriver driver;
	
	
	//Before hook run before each scenario
@Before
public void setUp(Scenario scenario) 
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
driver.quit();
System.out.println("***Execution ends for scenario "+scenario.getName());
}
}
