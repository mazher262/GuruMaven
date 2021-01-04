package com.test.java;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.factory.java.TestBase;
import com.main.utils.pops.PopupsClass;

public class PopupTestClass extends TestBase {
 
	PopupsClass popupclass;
	
	@BeforeMethod (alwaysRun = true)
	public void setUp()
	{
		initialization();
		popupclass=new PopupsClass();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

	@Test
  public void closePopupBtn() throws Exception {
		Thread.sleep(500);
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#closeBtn")));
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#closeBtn")));
		popupclass.clseButton();
		System.out.println();
  }
}
