package com.acti.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.actiBase.DriverScript;
import com.actiPages.LoginPage;
import com.actiPages.TasksPage;

public class BaseTest extends DriverScript {

	LoginPage lp;
	TasksPage tp;

	// constructor
	public BaseTest()
	{
		super();
	}

	@BeforeMethod()
	public void PageStart() 
	{
		initApp();
		lp = new LoginPage();
		tp = new TasksPage();
	}

/*	@AfterMethod()
	public void PageQuit()
	{
		driver.close();
	}*/

}
