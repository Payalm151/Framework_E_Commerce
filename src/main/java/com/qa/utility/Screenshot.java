package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Screenshot extends TestBase {
		public Screenshot()
		{
		PageFactory.initElements(driver, this);
		}
		public static void takeScreenshot(String filename)
		{
		String path ="C:\\Users\\Raj\\eclipse-workspace\\Project1\\Screenshots\\";
		try {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File(path+ filename+".png");
		FileHandler.copy(src, des);
		}
		catch(IOException e)
		{
		System.out.println("File path is wrong");
		}
	}
}
