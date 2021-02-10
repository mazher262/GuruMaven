package com.main.factory.java;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.main.utils.java.TestUtil;
import com.main.utils.java.WebEventsListener;


public class TestBase {
  
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_Driver;
	public static WebEventsListener eventListener;
	
	public TestBase()
	{
		
		prop = new Properties();
		try
		{
			FileInputStream fileinput= new FileInputStream("D:\\DemoGuruProj\\DemoSelenium\\src\\main\\java\\com\\main\\utils\\java\\util.properties");
			prop.load(fileinput);
						
			
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	}
	  
	public static void initialization()
	{
		System.out.println("entered from jenkins");
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "D:\\htmlunit-driver-2.45.0\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\htmlunit-driver-2.45.0\\geckodriver.exe");
			driver = new ChromeDriver();
		
		}
		//Alert alert = driver.switchTo().alert();
	
		//e_Driver =  new EventFiringWebDriver(driver);
		//eventListener = new WebEventsListener();
		//e_Driver.register(eventListener);
		//driver = e_Driver;
		
		//driver.manage().window().window()).maximize();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
}

		