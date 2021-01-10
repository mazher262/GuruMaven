package com.test.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.factory.java.TestBase;
import com.main.pages.java.GuruHomePage;
import com.main.pages.java.LoginPage;
import com.main.pages.java.SEOClass;

public class SEOTestClass extends TestBase {
 
	GuruHomePage guruHomePage;
	LoginPage loginPage;
	String sheetName = "Contacts";
	SEOClass seoClass;
	
	public SEOTestClass()
	{
		super();
	}	
	
@BeforeMethod (alwaysRun = true)
public void setUp()
{
	initialization();
	loginPage=new LoginPage();
	guruHomePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	seoClass = guruHomePage.getSEOClass();
}

@AfterMethod
public void tearDown()
{
//	driver.quit();
}
	
	@Test
  public void seoClassClickTest() throws Throwable {
		
		//Thread.sleep(2000);
		seoClass.seoMenuClick();
		Thread.sleep(1000);
  }
}
