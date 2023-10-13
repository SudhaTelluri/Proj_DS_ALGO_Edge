package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\resources\\dsfeatures",
		//features="src\\test\\resources\\dsfeatures\\Test01_ds_GetStarted.feature",
		glue={"dsStepDefinitions","hooks"},
		tags="@all",
		plugin= {"pretty",
				"html:testngtarget/CucumberReports/CucumberReport.html",
				"json:testngtarget/CucumberReports/CucumberReport.json",
				"junit:testngtarget/CucumberReports/CucumberReport.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
				
		}
		)
public class TestngTestRunner extends AbstractTestNGCucumberTests {
}
