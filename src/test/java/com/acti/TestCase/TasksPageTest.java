package com.acti.TestCase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TasksPageTest extends BaseTest {
	
	@Test(priority = 1)
	public void VerifyTaskClick()
	{
		Logger = Extent.createTest("Enter Customer Name:");
		lp.logindetails(Prop.getProperty("Username"), Prop.getProperty("Password"));
		Logger.log(Status.PASS, "Logged in Successfully");
		tp.TaskClick();
		Logger.log(Status.INFO,"Clicked on Task link");
		tp.CustomerDetails();
		Logger.log(Status.INFO, "Entered Customer details successfully");
	}

	}
