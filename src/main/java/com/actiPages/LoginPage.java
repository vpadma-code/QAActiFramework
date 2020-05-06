package com.actiPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiBase.DriverScript;
import com.actiUtils.Commons;

public class LoginPage extends DriverScript {

//**************Locating Page elements*************************************

	@FindBy(id = "username") WebElement usernametb;
	@FindBy(name = "pwd") WebElement passwordtb;
	@FindBy(id = "loginButton") WebElement loginbtn;
	@FindBy(id = "logoContainer") WebElement logo;
	
//**************Initializing Page elements**********************************
	
	// Constructor
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
//**************Action on Page elements**************************************
	
	// Method
		
	public boolean verifyactilogo()
	{
		Commons.Highlightelements(logo);
		return logo.isDisplayed();
	}
	
	public void logindetails(String Username, String Password)
	{
		Commons.Highlightelements(usernametb);
		usernametb.sendKeys(Username);
		Commons.Highlightelements(passwordtb);
		passwordtb.sendKeys(Password);
		Commons.Highlightelements(loginbtn);
		loginbtn.click();
	}

}



