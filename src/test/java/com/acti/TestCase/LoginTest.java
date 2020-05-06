package com.acti.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void TestActiLogo()
	{
		boolean LogoFlag = lp.verifyactilogo();
		Assert.assertTrue(LogoFlag);
	}
	
	@Test(priority=2)
	public void TestLoginDetails()
	{
		lp.logindetails(Prop.getProperty("Username"), Prop.getProperty("Password"));
	}
}

	
	
