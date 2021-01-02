package com.OrangeHRM.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.testBase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_Verify_URL extends BaseClass{
	
	@Test
	public void verifyApplicationURL() {
		driver.get(prop.getProperty("url"));
		
		String expURL = prop.getProperty("url");
		String actURL = driver.getCurrentUrl();
		
		if(expURL.equalsIgnoreCase(actURL)) {
			System.out.println("URL is matching");
			Assert.assertTrue(true);
		} else{
			System.out.println("URL is not correct");
			Assert.assertTrue(false);
		}
			
}		
}
