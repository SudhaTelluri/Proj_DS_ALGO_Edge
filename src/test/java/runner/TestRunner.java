package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sudha\\OneDrive\\Documents\\GitHub\\Projects\\Proj-DS-ALGO\\src\\test\\resources\\dsfeatures",
                  glue={"dsStepDefinitions","hooks"},
                  monochrome=true,
                  tags="@all",
plugin= {"pretty",
		"html:target/CucumberReports/CucumberReport.html",
		"json:target/CucumberReports/CucumberReport.json",
		"junit:target/CucumberReports/CucumberReport.xml"
		
})
public class TestRunner {

}
