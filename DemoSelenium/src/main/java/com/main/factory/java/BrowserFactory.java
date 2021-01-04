package com.main.factory.java;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
  WebDriver driver;
	
  
	  private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	  
	
	  public static void setup()
	  {
		  //System.setProperty("webdriver.chrome.driver", "D:\\htmlunit-driver-2.45.0\\chromedriver.exe");
		 // driver = new ChromeDriver();
		  //driver.manage().window().maximize();
		 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }
	  
	  
	  
	  /*
	  * Factory method for getting browsers
	  */
	  @BeforeSuite
	  public static WebDriver getBrowser(String browserName) {
	  WebDriver driver = null;
	  
	  switch (browserName)
	  {
	  case "Firefox":
		  driver = drivers.get("Firefox");
		  if (driver == null)
		  {
			  driver = new FirefoxDriver();
			  drivers.put("Firefox", driver);
		  }
		  break;
	  case "IE":
		  driver = drivers.get("IE");
		  if (driver == null)
		  {
			  System.setProperty("webdriver.ie.driver",
				  "C:\\Users\\abc\\Desktop\\Server\\IEDriverServer.exe");
			  driver = new InternetExplorerDriver();
			  drivers.put("IE", driver);
		  }
	  break;
	  case "Chrome":
		  driver = drivers.get("Chrome");
		  if (driver == null) 
		  {
			  System.setProperty("webdriver.chrome.driver",
				  "D:\\htmlunit-driver-2.45.0\\chromedriver.exe");
			  driver = new ChromeDriver();
			  drivers.put("Chrome", driver);
		  }
	  break;
	  }
	  return driver;
	  }

 public static void closeAllDriver() {
 for (String key : drivers.keySet()) {
 drivers.get(key).close();
 drivers.get(key).quit();
 }
 }
}
  

