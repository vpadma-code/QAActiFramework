package com.actiPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiBase.DriverScript;
import com.actiUtils.Commons;

public class TasksPage extends DriverScript {

// **************Locating Page elements*************************************
	@FindBy(id = "container_tasks") WebElement Tasks;
	@FindBy(xpath="//*[@class='title ellipsis']") WebElement AddNewBtn;
	@FindBy(xpath="//*[@class='item createNewCustomer']") WebElement NewCustomer;
	@FindBy(xpath="//*[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement CustomerNameTB;
	@FindBy(xpath="//*[contains(text(), 'Create Customer')]") WebElement CustomerBtn;
	

// **************Initializing Page elements**********************************

	public TasksPage() 
	{
		PageFactory.initElements(driver, this);
	}

// **************Action on Page elements*************************************

	public void TaskClick() 
	{
		Commons.Highlightelements(Tasks);
		Tasks.click();
		Commons.Highlightelements(AddNewBtn);
		AddNewBtn.click();
		Commons.Highlightelements(NewCustomer);
		NewCustomer.click();

	}
    public void CustomerDetails()
    {
     Commons.Highlightelements(CustomerNameTB);
	 CustomerNameTB.sendKeys("Test AddCustomer1");
	 Commons.Highlightelements(CustomerBtn);
	 CustomerBtn.click();
    }
 
}
