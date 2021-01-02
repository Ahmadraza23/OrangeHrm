package com.OrangeHRM.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.testBase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Login_Test extends BaseClass{
	

	@Test
	public void loginTest() {
		
	logger.info("*********Starting TC001_Login_Test*****");	
	driver.get(prop.getProperty("url"));
	logger.info("************App llaucnhed  successfully");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(prop.getProperty("username"));
		lp.setPassword(prop.getProperty("password"));
		lp.clickLoginButton();
	
	
	//Assertion to check that login happened successfully
	String expTitle = "OrangeHRM";
	String actTitle = driver.getTitle();
	
	if(expTitle.equalsIgnoreCase(actTitle)){
		Assert.assertTrue(true); 	
		System.out.println("login happend successfully");
		logger.info("*******logged in successfully********");
	} else{
		Assert.assertTrue(false);
		logger.error("**********login failed**********");
		
	}
	
	
	
	}

}
