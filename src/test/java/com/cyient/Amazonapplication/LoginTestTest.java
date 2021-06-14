package com.cyient.Amazonapplication;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;

public class LoginTestTest extends WebDriverWrapper {

	@Test
	public void validTest() throws Exception {
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();

		// driver.findElement(By.xpath("//span[contans(text()='Sign in')]")).click();
		driver.findElement(By.id("continue")).click();
		String actualValue = driver
				.findElement(By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]")).getText();
		Assert.assertEquals(actualValue, "Enter your email or mobile phone number");

	}

	@Test
	public void validateCredentail() throws Exception {
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
			// driver.findElement(By.xpath("//span[contans(text()='Sign in')]")).click();
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("Suraj Kumar");
		
		driver.findElement(By.id("ap_phone_number")).sendKeys("78");
		//driver.findElement(By.id("ap_email")).sendKeys("surajkumar@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("ap_password")).sendKeys("Sur@123");
		//Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.xpath("//img[@alt='captcha']")).click();
		//driver.findElement(By.xpath("//input[@name='cvf_captcha_captcha_action']")).click();
		//String actualValue=driver.findElement(By.xpath("")).getText();
		//Assert.assertEquals(actualValue, "");
	}
}
