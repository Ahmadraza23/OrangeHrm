package com.OrangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//1. define webdriver globally
	public WebDriver driver;
	
	//2. create Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;   // to assign the driver passed from test cases to local webdriver
		PageFactory.initElements(driver,this);		
	}
	
	//3. locators for all the elements
	@FindBy(id="txtUsername")
	@CacheLookup 	// this improves performance of locating elements
	WebElement txtUsername;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//a[@id='welcome']")
	 @CacheLookup
	 WebElement lnkLogoutArrow;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement lnkLogoutTxt;
	
	
 //4. Methods for each element
	
	public void setUsername(String uname) {
		txtUsername.clear();
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	
	public void clickLogoutLink() {
		lnkLogoutArrow.click();
		lnkLogoutTxt.click();
	}
	
	
	
	
	
	
	
	
}
