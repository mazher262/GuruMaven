package com.main.utils.pops;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.factory.java.TestBase;
import com.main.utils.java.TestUtil;

public class PopupsClass extends TestBase{

	
	//@FindBy(xpath="//div[@id='closeBtn']")
	@FindBy(css="div#closeBtn")
	WebElement popupAd;
	
	
	public PopupsClass()
	{
		//current class objects
		PageFactory.initElements(driver, this);
	}
	
	public void clseButton()
	{
		TestUtil.switchToFrame();
		popupAd.click();
		System.out.println("pop up closed");
	}
}
