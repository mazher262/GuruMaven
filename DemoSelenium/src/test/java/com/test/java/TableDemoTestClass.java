package com.test.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.factory.java.TestBase;
import com.main.pages.java.GuruHomePage;
import com.main.pages.java.LoginPage;
import com.main.pages.java.TableDemoClass;

public class TableDemoTestClass extends TestBase{
  
	LoginPage loginpt;
	GuruHomePage guruHomePage;
	
	
	TableDemoTestClass()
	{
		super();
	}
	
	@BeforeMethod (alwaysRun = true)
	public void setUp()
	{
		initialization();
		loginpt=new LoginPage();
		guruHomePage = loginpt.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
  public void TableDemoClick() {
		TableDemoClass tdc = new TableDemoClass();
		tdc.clickTableDemo();
		
  }
}
