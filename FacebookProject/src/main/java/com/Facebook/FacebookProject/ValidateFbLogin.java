package com.Facebook.FacebookProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateFbLogin {
	
	WebDriver driver ;
	@Test
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Practice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
driver.get("http://facebook.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("7032096482");
	driver.findElement(By.id("pass")).sendKeys("Sand@1234");
	driver.findElement(By.id("u_0_a")).click();
	driver.close();
}
}