package com.main.pages.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.factory.java.TestBase;

public class SEOClass extends TestBase {

	//@FindBy(css = "a.dropdown-toggle")
	//@FindBy(xpath = "//a[@class='dropdown-toggle' and @data-toggle='dropdown' and @aria-expanded='false']")
	//@FindBy(xpath="//a[@class='dropdown-toggle' and @data-toggle='dropdown' and @aria-expanded='true']")
	//@FindBy(xpath="//li[@class='dropdown open'] ")
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a")
	WebElement SeoMenu;
	
	public SEOClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void seoMenuClick()
	{
		SeoMenu.click();
	}
}
