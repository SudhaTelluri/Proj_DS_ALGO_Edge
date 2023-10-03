package hooks;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
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

	public String getScreenshot(String testcaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) this.driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir")+ "//reports//"+ testcaseName+".png");
        FileUtils.copyFile(source,file);
        return System.getProperty("user.dir")+ "//reports//"+ testcaseName+".png";
    }








@After
public void tearDown(Scenario scenario)
{	
driver.quit();
System.out.println("***Execution ends for scenario "+scenario.getName());
}
}
