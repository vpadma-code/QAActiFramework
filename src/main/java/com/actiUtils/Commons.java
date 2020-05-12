package com.actiUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.actiBase.DriverScript;

public class Commons extends DriverScript {
	
	public static void Highlightelements(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	}
	
	public static String Screenshot(WebDriver driver, String Screename){
		TakesScreenshot SS = (TakesScreenshot) driver;
		File Src = SS.getScreenshotAs(OutputType.FILE);
		String DestPath = "C:/Users/vpadm/git/QAActiFramework/actiReports/Screenshots/Screename.png";
		File Dest = new File(DestPath);
		try {
			FileUtils.copyFile(Src, Dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return DestPath;
	}
}
