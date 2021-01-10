package com.main.pages.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.factory.java.TestBase;

public class MenuClass extends TestBase{

	@FindBy(xpath="//a[contains(text(),'Tooltip')]")
	WebElement SeoMenu;
	@FindBy(xpath="//b[@class='caret']")
	WebElement caret;
	@FindBy(xpath="//a[@aria-expanded='false']")
	WebElement SeoMenu1;
	
	public MenuClass()
	{
		PageFactory.initElements(driver, this);
	}
}
