package com.main.utils.java;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.main.factory.java.TestBase;
import com.sun.media.sound.InvalidFormatException;

public class TestUtil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=50;
	public static String TEST_DATA_SHEET ="path";
	
	//write here all switch to frames
	public static void switchToFrame()
	{
		driver.switchTo().frame("flow_close_btn_iframe");
	}
	/**
	public static Object[][] getTestData(String sheetname)
	{
		FileInputStream file = null;
		WorkbookFactory  book;
		try
		{
			file = new FileInputStream(prop.getProperty(TEST_DATA_SHEET));
		}catch (Exception e) {e.printStackTrace();}
		
		try {
			book = WorkbookFactory.create(file);
		}catch (Exception e) {e.printStackTrace();}
		
		sheet = book.getSheet(sheetname);
		Object[][] data =new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<getLastRowNum(); i++)
		{
			for(int k=0; k<getRow(0).getLastCellNum(); k++)
			{
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
			
		}
	}
		public static void takeScreenShotAtEndOfTest(){
			
			File srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			if(prop.osName.startsWith("Mac"))
			{
				FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() +".png"));
			}else {
				FileUtils.copyFile(srcFile, new File(currentDir + "\\screenshots\\" + System.currentTimeMillis() +".png"));
			}
		}**/
	}

