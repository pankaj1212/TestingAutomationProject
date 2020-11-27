package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class searchpageTest {
	
	WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://officedepot.com");
		
	}
	
	@Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Office Depot OfficeMax | Official Online Store";
        String actualTitle = driver.getTitle();
        
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
   }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
	
	
	
}


