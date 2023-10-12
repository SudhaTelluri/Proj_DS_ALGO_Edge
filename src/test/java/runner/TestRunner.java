package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\dsfeatures",
//@CucumberOptions(features="src\\test\\resources\\dsfeatures\\Test01_ds_GetStarted.feature",
                  glue={"dsStepDefinitions","hooks"},
                  publish=true,
                  monochrome=true,
                  tags="@all",
plugin= {"pretty",
		"html:target/CucumberReports/CucumberReport.html",
		"json:target/CucumberReports/CucumberReport.json",
		"junit:target/CucumberReports/CucumberReport.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
				
})
public class TestRunner{

}
