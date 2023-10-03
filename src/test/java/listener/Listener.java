package listener;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import hooks.DSHooks;
import listeners.ExtentReportListener;

public class Listener {
	WebDriver driver;
	public class Listeners extends DSHooks implements ITestListener {
	    ExtentTest extentTest;
	    ExtentReports extentReports = ExtentReportListener.getReport();
	    public void onTestStart(ITestResult result) {
	        extentTest = extentReports.createTest(result.getMethod().getMethodName());
	    }
	    public void onTestSuccess(ITestResult result) {
	        extentTest.log(Status.PASS, " Test Passed");
	    }
	    public void onTestFailure(ITestResult result) {
	        extentTest.log(Status.FAIL, "Test Failed");
	        try {
	            driver = (WebDriver) result.getTestClass().getRealClass().getField("driver")
	                    .get(result.getInstance());
	        } catch (NoSuchFieldException | IllegalAccessException e) {
	            throw new RuntimeException(e);
	        }
	        String filePath = null;
	        try {
	            filePath = getScreenshot(result.getMethod().getMethodName(), driver);
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	    }
	    public void onFinish(ITestContext context) {
	        extentReports.flush();
	    }


	}


}