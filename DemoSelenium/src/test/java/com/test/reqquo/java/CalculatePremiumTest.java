package com.test.reqquo.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.test.java.LoginPageTestClass;

import com.main.factory.java.TestBase;
import com.main.pages.reqqo.java.CalculatePremium;


public class CalculatePremiumTest extends TestBase {

	CalculatePremium calpremium;
	
	CalculatePremiumTest()
	{
		super();
	}
	
	@BeforeMethod (alwaysRun = true)
	public void setUp()
	{
		initialization();
		calpremium=new CalculatePremium();
		System.out.println("Calcute premium is done");
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	@Test (dependsOnGroups = {"LoginTestMethod"})
	public void windscreenrepairYes() throws Exception {
		calpremium.requestquotationClick();
		Thread.sleep(1000);
		calpremium.windscreenrepairYes();
	  }
}
