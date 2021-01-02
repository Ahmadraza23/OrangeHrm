package com.OrangeHRM.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.OrangeHRM.pageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	// For generating logs
	public Logger logger = LogManager.getLogger(this.getClass());
	
	
	@BeforeClass
	@Parameters("browser") // runs scripts  
	public void setup(String br) throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\resources\\congif.properties");
	    prop.load(fis);     
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
