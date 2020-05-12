package com.actiBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverScript {
	public static WebDriver driver;
	public static Properties Prop;

	// Constructor
	public DriverScript() {
		try {
			File Src = new File("./actiConfiguration/config.properties");
			FileInputStream FIS = new FileInputStream(Src);
			Prop = new Properties();
			Prop.load(FIS);
		} catch (Exception e) {
			System.out.println("Exception thrown" + e.getMessage());
		}
	}

	// Method
	public static void initApp() {
		String Browser = Prop.getProperty("browser");
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./actiBrowsers/chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOuput", "true");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.IE.driver", "./actiBrowsers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL = Prop.getProperty("IFTURL");
		driver.get(URL);
	}
	
}
