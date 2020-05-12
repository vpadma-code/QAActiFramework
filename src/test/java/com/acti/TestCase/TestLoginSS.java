package com.acti.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TestLoginSS extends BaseTest {
	@Test
	public void SSTest() 
	{
		Logger = Extent.createTest("Testing Screenshot Code");
		lp.logindetails("admin", "admin");
		Assert.assertTrue(driver.getTitle().contains("Enter"));
		Logger.log(Status.PASS , "User Logged in Successfully");
	}

}
