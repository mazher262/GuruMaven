package com.test.java;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;
import com.main.pages.java.GuruHomePage;
import com.main.factory.java.TestBase;
import com.main.pages.java.LoginPage;



public class LoginPageTestClass extends TestBase {

	public LoginPage loginpt;
	public GuruHomePage ghpage;
	
	public LoginPageTestClass()
	{
		super();
	}	
	
	Logger log =Logger.getLogger(LoginPageTestClass.class);
	
@BeforeMethod (alwaysRun = true)
public void setUp()
{
	initialization();
	loginpt=new LoginPage();
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}


@Test (enabled = true, priority=1)
public void loginPageGuruTitleTest()
{
	String guruTitle = loginpt.validateLoginPageTitle();
	log.info("Called Validata Login Page Title method..");
	log.warn("This is just a warning...");
	Assert.assertEquals(guruTitle, prop.getProperty("title"));
}

@Test (enabled = true,  priority=2)
public void loginPageGuruLogoTest()
{
	Boolean blnguruLogo = loginpt.validateGuruLogo();
	Assert.assertTrue(blnguruLogo);
}

@Test (priority=3)
public void loginTest()
{
	ghpage= loginpt.login(prop.getProperty("username"), prop.getProperty("password"));
	//System.out.println("logged in into the site");
}

}