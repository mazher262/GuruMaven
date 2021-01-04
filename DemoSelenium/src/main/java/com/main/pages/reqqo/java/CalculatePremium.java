package com.main.pages.reqqo.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.factory.java.TestBase;

public class CalculatePremium extends TestBase {

	//@FindBy(xpath="//select[@id='quotation_breadowncover']")
	@FindBy(css="a#ui-id-2")
	WebElement requestquotationele;
	
	@FindBy(xpath="//select[@id='quotation_breadowncover']")
	WebElement breakdowncoverele;
	
	@FindBy(xpath="//input[@name='windscreenrepair' and @value='Yes']")
	WebElement windscreenrepairYes;
	
	@FindBy(xpath="//input[@name='windscreenrepair' and @value='No']")
	WebElement windscreenrepairNo;
	
	public CalculatePremium()
	{
		//current class objects
		PageFactory.initElements(driver, this);
	}
	
	public void requestquotationClick()
	{
		requestquotationele.click();
	}
	
	public void windscreenrepairYes()
	{
		windscreenrepairYes.click();
	}
	public void windscreenrepairNo()
	{
		windscreenrepairNo.click();
	}
}
