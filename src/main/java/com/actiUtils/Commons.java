package com.actiUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.actiBase.DriverScript;

public class Commons extends DriverScript {
	
	public static void Highlightelements(WebElement ele){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	}

}
