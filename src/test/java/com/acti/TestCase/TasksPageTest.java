package com.acti.TestCase;

import org.testng.annotations.Test;

public class TasksPageTest extends BaseTest {
	
	@Test(priority = 1)
	public void VerifyTaskClick()
	{
		lp.logindetails(Prop.getProperty("Username"), Prop.getProperty("Password"));
		tp.TaskClick();
		tp.CustomerDetails();
	}

	}
