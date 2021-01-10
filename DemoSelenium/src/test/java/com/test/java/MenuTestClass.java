package com.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import com.main.factory.java.TestBase;
import com.main.pages.java.GuruHomePage;
import com.main.pages.java.LoginPage;
import com.main.pages.java.SEOClass;

public class MenuTestClass extends TestBase{

	GuruHomePage guruHomePage;
	LoginPage loginPage;
	String sheetName = "Contacts";
	SEOClass seoClass;
	ChromeDriver driver;
	
	public MenuTestClass()
	{
		//super();
	}	
	
@BeforeMethod (alwaysRun = true)
public void setUp()
{
	System.setProperty("webdriver.chrome.driver", "D:\\htmlunit-driver-2.45.0\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.guru99.com/");
	//WebElement menu = driver.findElement(By.xpath(xpathExpression));
	
	Actions actions = new Actions(driver);
	WebElement mainMenu = driver.findElement(By.xpath("//span[contains(text()='Testing')"));
	actions.moveToElement(mainMenu);

	WebElement subMenu = driver.findElement(By.xpath("//span[contains(text()='LoadRunner')"));
	actions.moveToElement(subMenu);
	actions.click().build().perform();
	//initialization();
	//loginPage=new LoginPage();
	//guruHomePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	//seoClass = guruHomePage.getSEOClass();
}

}
