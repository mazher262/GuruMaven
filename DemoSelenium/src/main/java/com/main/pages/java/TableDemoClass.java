package com.main.pages.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.factory.java.TestBase;

public class TableDemoClass extends TestBase {

	@FindBy(xpath="//a[contains(text(), 'Table Demo')]")
	WebElement tableDemo;
	
	@FindBy(xpath="//a[@aria-expanded='false']")
	WebElement selenium;
	
	public TableDemoClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickTableDemo()
	{
		selenium.click();
		tableDemo.click();
	}
}
