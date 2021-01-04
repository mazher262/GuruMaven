package com.main.pages.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.pages.java.GuruHomePage;
import com.main.factory.java.TestBase;

public class LoginPage extends TestBase{

	//Page Factory or Object Repository
	@FindBy(name="email")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//input[@id='password' and @name='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//input[@name='submit']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//a[contains(text(), 'Register'])")
	@CacheLookup
	WebElement lnkRegister;
	
	//@FindBy(css ="img[@alt='Guru99 Demo Sites']")
	@FindBy(xpath ="//img[@role='presentation']")
	@CacheLookup
	WebElement imgGuruLogo;
	
	public LoginPage()
	{
		//current class objects
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateGuruLogo()
	{
		boolean blnImgPresentOrNot = imgGuruLogo.isDisplayed();
		return blnImgPresentOrNot;
		
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public GuruHomePage login(String em, String pwd)
	{
		email.sendKeys(em);
		password.sendKeys(pwd);
		btnLogin.click();
		return new GuruHomePage();
		
	}
	
}
