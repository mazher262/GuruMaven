package com.test.java;

import org.testng.annotations.Test;

import com.main.factory.java.TestBase;
import com.main.pages.java.GuruHomePage;
import com.main.pages.java.LoginPage;

public class TableDemoTestClass extends TestBase{
  
	LoginPage loginpt;
	GuruHomePage guruHomePage;
	
	
	TableDemoTestClass()
	{
		super();
	}
	
	public void setUp()
	{
		initialization();
		loginpt=new LoginPage();
		guruHomePage = loginpt.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
  public void TableDemoClick() {
		
  }
}
