package com.test.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.factory.java.TestBase;
import com.main.pages.java.GuruHomePage;
import com.main.pages.java.LoginPage;

public class GitTest extends TestBase {
 
	GuruHomePage guruHomePage;
	LoginPage loginPage;
	String sheetName = "Contacts";
	
	public GitTest()
	{
		super();
	}	
	
@BeforeMethod (alwaysRun = true)
public void setUp()
{
	initialization();
	loginPage=new LoginPage();
	guruHomePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}

	
	@Test
  public void guruLogOut() {
		guruHomePage.clickLogoutTest();
		Thread.sleep(1000);
  }
}
