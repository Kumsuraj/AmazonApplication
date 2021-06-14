package com.cyient.Amazonapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;

public class SignInTest extends WebDriverWrapper  {
    
	
     @Test
	 public void validCredentail() throws Exception
	 {
		System.out.println("validCredentails!!!!!!");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		 
		 driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		 driver.findElement(By.id("ap_email")).sendKeys("7582859175");
		 
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.id("ap_password")).sendKeys("Kum@12345");
		 driver.findElement(By.id("signInSubmit")).click();
		 //Thread.sleep(5000);
		 String actualValue=driver.findElement(By.linkText("//a[contans(text()='Customer Service')]")).getText();
		Assert.assertEquals(actualValue,"Customer Service");
		 
	 }
     @Test
     public void searchProduct() throws InterruptedException
     {
    	 System.out.println("validCredentails!!!!!!");
 		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
 		
 		 driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
 		 driver.findElement(By.id("ap_email")).sendKeys("7582859175");
 		 driver.findElement(By.xpath("//input[@type='submit']")).click();
 		 driver.findElement(By.id("ap_password")).sendKeys("Kum@12345");
 		 driver.findElement(By.id("signInSubmit")).click();
 		 //Thread.sleep(3000);
 		 driver.findElement(By.id("twotabsearchtextbox")).clear();
 		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12 pro max+");
 		 driver.findElement(By.id("nav-search-submit-button")).click();
 		String actualValue= driver.findElement(By.xpath("//span[@class='a-size-medium'][normalize-space()='iPhone 12 Pro Max. The ultimate Pro camera system.']")).getText();
 		Assert.assertEquals(actualValue, "iPhone 12 Pro Max. The ultimate Pro camera system.");
 		 
 		 
     }
	
}
