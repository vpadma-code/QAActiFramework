package com.acti.TestCase;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actiBase.DriverScript;
import com.actiPages.LoginPage;
import com.actiPages.TasksPage;
import com.actiUtils.Commons;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest extends DriverScript {

	LoginPage lp;
	TasksPage tp;
	ExtentHtmlReporter HtmlReport;
	ExtentReports Extent;
	ExtentTest Logger;

	// constructor
	public BaseTest()
	{
		super();
	}

	@BeforeClass()
	public void Reports()
	{
		HtmlReport = new ExtentHtmlReporter("./actiReports/Reports.html");
		Extent = new ExtentReports();
		Extent.attachReporter(HtmlReport);
		
	}
	@BeforeMethod()
	public void PageStart() 
	{
		initApp();
		lp = new LoginPage();
		tp = new TasksPage();
	}

	@AfterMethod() 	
	public void ScreenShotBase(ITestResult result) throws Exception
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			String ScreenShotPath = Commons.Screenshot(driver, "Screen");
			Logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case Failed", ExtentColor.RED));
			Logger.fail(result.getThrowable());
			Logger.fail("Snapshot below:" + Logger.addScreenCaptureFromPath(ScreenShotPath));
		}
		else if (result.getStatus() == ITestResult.SUCCESS)
		{
			Logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test Case Passed", ExtentColor.GREEN));
		}
		else
		{
			Logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case Skipped", ExtentColor.GREEN));
			Logger.skip(result.getThrowable());
		}
		
		driver.close();
		Extent.flush();
	}

}
