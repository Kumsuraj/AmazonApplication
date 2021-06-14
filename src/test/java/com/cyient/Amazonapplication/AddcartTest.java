package com.cyient.Amazonapplication;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;

public class AddcartTest extends WebDriverWrapper  {
	
	@Test
	public void addToProduct() 

	{
		System.out.println("Add product into cart!!!!!!!");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		 	
		 driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		 driver.findElement(By.id("ap_email")).sendKeys("7582859175");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.id("ap_password")).sendKeys("Kum@12345");
		 driver.findElement(By.id("signInSubmit")).click();
		 driver.findElement(By.id("twotabsearchtextbox")).clear();
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12 pro max+");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.findElement(By.xpath("//span[@class='a-truncate-cut']")).click();//may apply thread
		 driver.findElement(By.id("add-to-cart-button")).click();
		 driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		/* try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String actualValue=driver.findElement(By.xpath("//h1[text()='Shopping Cart']")).getText();
		 Assert.assertEquals(actualValue,"Shopping Cart");*/
		
		 driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		 
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 //Choose the Address newly added as the address to be delivered.
		 driver.findElement(By.linkText("//a[@class='a-declarative a-button-text']")).click();
		 
		 //Choose your Delivery Option.
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 //Validate and Review your order Page.
		 
		// driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")).click();
		 
		 
		 
	}
	
}
