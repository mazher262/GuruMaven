package com.main.pages.java;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Action;

import java.net.URL;
import java.util.StringTokenizer;

import com.main.pages.java.GuruHomePage;
import com.main.factory.java.TestBase;

public class LoginPage extends TestBase{

	StringTokenizer str= new StringTokenizer(null);
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
		Actions action = new Actions(driver);
		Action act = action.build();
		return blnImgPresentOrNot;
		
	}
	
	public String validateLoginPageTitle() throws Exception
	{
		Options opt = driver.manage();
		opt.window().maximize();
		Navigation nav = driver.navigate();
		nav.refresh();
		nav.back();
		nav.forward();
		nav.to("");
		URL url = new URL("http:\\ianfa.com");
		nav.to(url);
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
