package com.cyient.utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;

public class DataProviderUtiles extends WebDriverWrapper {
		
	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd, String exp)
	{
		System.out.println(user+" "+pwd+" "+exp);
		
	}
	
	@DataProvider(name="LoginData")
	public String[][] getData()
	{
		String loginData[][]= {
				{"7582859175","Kum@12345","Valid"},
				{"7882859175","Kum@12345","Invalid"},
				{"7582859175","Kum@1234", "Invalid"},
				{"7282859175","Kum@1234","Invalid"}
				
		};
		return loginData;
	}
	

}
