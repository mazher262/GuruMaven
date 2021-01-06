package com.main.pages.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.main.factory.java.TestBase;

public class SEOClass extends TestBase {

	WebDriverWait wait;
	//@FindBy(css = "a.dropdown-toggle")
	//@FindBy(xpath = "//a[@class='dropdown-toggle' and @data-toggle='dropdown' and @aria-expanded='false']")
	//@FindBy(xpath="//a[@class='dropdown-toggle' and @data-toggle='dropdown' and @aria-expanded='true']")
	//@FindBy(xpath="//li[@class='dropdown open'] ")
	@FindBy(xpath="/html/body/div[1]/div[2]/nav/div/div/ul/li[1]/ul/li[1]/a")
	WebElement SeoMenu;
	
	
	public SEOClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void seoMenuClick()
	{
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(SeoMenu));
		//wait.until(ExpectedConditions.elementToBeClickable(SeoMenu));
		SeoMenu.click();
	}
}
