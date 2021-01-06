package com.main.pages.java;

import org.openqa.selenium.WebElement;
import com.main.pages.reqqo.java.RequestQuotation;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.factory.java.TestBase;



public class GuruHomePage extends TestBase{
	
	@FindBy(xpath="//h4[contains(text(), 'mm@gmai.com'])")
	WebElement emailValue;
	
	//@FindBy(css="a.ui-id-2.ui-tabs-anchor")
	@FindBy(xpath="//a[@id='ui-id-2']")
	WebElement requestQuotation;
	
	@FindBy(xpath="//input[@class='btn btn-danger']")
	WebElement logOut;
	
	public GuruHomePage()
	{
		//current class objects
		PageFactory.initElements(driver, this);
	}
	
	public void requestQuotationClick()
	{
		requestQuotation.click();
	}

	public String getTitleOfHomePage()
	{
		String strTitle= driver.getTitle();
		return strTitle;
	}
	
	public RequestQuotation clickOnRequestQuotationLink()
	{
		requestQuotation.click();
		return new RequestQuotation();
		
	}
	public void clickLogoutTest()
	{
		logOut.click();
	}
	
	public SEOClass getSEOClass()
	{
		return new SEOClass();
	}
}
