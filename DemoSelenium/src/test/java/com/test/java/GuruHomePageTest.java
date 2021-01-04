package com.test.java;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.factory.java.TestBase;
import com.main.pages.java.GuruHomePage;
import com.main.pages.java.LoginPage;
import com.main.utils.java.TestUtil;


public class GuruHomePageTest extends TestBase {

	GuruHomePage guruHomePage;
	LoginPage loginPage;
	String sheetName = "Contacts";
	
	public GuruHomePageTest()
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

@Test (priority=1)
public void getTitleOfHomePage()
{
	String strTitle = guruHomePage.getTitleOfHomePage();
	Assert.assertEquals(strTitle, "Insurance Broker System", "This title is not correct");
}

@Test (priority=2)
public void clickRequestQuotation()
{
	guruHomePage.clickOnRequestQuotationLink();
}
/*
@DataProvider
public Object[][] getGuruTestData()
{
	//Object[][] data = TestUtil.getTestData(sheetName);
	//return data;
}

@Test (dataProvider="getGuruTestData")
public void createContacts(String title, String fname, String lastname,String company)
{
	//contactpage.createNewContact(title, fname, lastname, company);
}
//Action action = new Action(driver);
//action.movetoElement(contactlink).build().perform();
//newContactlink.click();
}*/
}


