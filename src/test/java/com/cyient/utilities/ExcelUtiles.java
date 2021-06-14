package com.cyient.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtiles {

		public static Object[][] main(String[] args) throws IOException {
			FileInputStream file=new FileInputStream("C:\\Users\\sk59152\\Desktop\\Automation\\java_workspace\\AmazonApplication\\src\\test\\resources\\Data\\LoginData.xlsx");
			 
			XSSFWorkbook wb=new XSSFWorkbook(file);	
			XSSFSheet sheet = wb.getSheet("LoginTest");
			int rowCount=sheet.getPhysicalNumberOfRows();
			int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] main=new Object[rowCount-1][cellCount];
		    for(int r=1;r<rowCount;r++)
		    {
		        for(int c=0;c<cellCount;c++)
		        {
		            XSSFRow row = sheet.getRow(r);
		            XSSFCell cell = row.getCell(c);



		            DataFormatter format=new DataFormatter();
		            
		            String cellValue = format.formatCellValue(cell);
		            System.out.println(cellValue);
		            main[r-1][c]=cellValue;
		        }
		    }
			return main;
			
			
		}
}
