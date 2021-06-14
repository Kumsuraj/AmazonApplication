package com.cyient.utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;

public class DataProviderUtiles extends WebDriverWrapper {
		
	
	
	@DataProvider(name="LoginData")
	public Object[][] getData()
	{
		Object[][] result =new Object[4][2];
		 
		result[0][0]="7582859175";
		result[0][1]="Sur@123456789";
		
		result[1][0]="7382859175";
		result[1][1]="Sur@123456789";
		
		result[2][0]="7582859175";
		result[2][1]="sur@123456789";
		
		result[3][0]="7382859175";
		result[3][1]="sur@123456789";
		
		return result;
		
		
	}
	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd)
	{
		System.out.println(user+" "+pwd);
		
	}
	

}
