package com.qa.com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyUrl {
  
	@Test
	public static void verifyUrl()
	{
		
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://officedepot.com");
		String actualUrl= driver.getCurrentUrl().trim();
		
		String expectedUrl = "https://www.officedepot.com/";
		Assert.assertEquals(expectedUrl, actualUrl);
		
		driver.close();
	}
}
