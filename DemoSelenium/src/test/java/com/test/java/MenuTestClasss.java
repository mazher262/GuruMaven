package com.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTestClasss {
 
	ChromeDriver driver;
	@BeforeMethod (alwaysRun = true)
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\htmlunit-driver-2.45.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		//WebElement menu = driver.findElement(By.xpath(xpathExpression));
	}
	@Test
  public void MenuTestDemo() {
	  Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//span[contains(text()='Testing')]"));
		//WebElement mainMenu = driver.findElement(By.cssSelector(//span[contains(text()='Testing')"));
		actions.moveToElement(mainMenu);

		WebElement subMenu = driver.findElement(By.xpath("//span[contains(text()='LoadRunner')"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
  }
}
