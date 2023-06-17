package com.qa.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.pageLayer.AddMobileToCart;
import com.qa.pageLayer.AmazonHomePage;
import com.qa.pageLayer.MobilePage;
import com.qa.pageLayer.SmartPhoneBasicsMobiles;
import com.qa.testBase.TestBase;

public class AddMobileToCartTest extends TestBase{
	
	@Test
	public void verifyAddToCartFunctionality() throws InterruptedException
	{
	
	AmazonHomePage mobilecheck = new AmazonHomePage();
	mobilecheck.clickOnMobile();
	
	MobilePage mob = new MobilePage();
	mob.clickOnSmartphoneBasicMobiles();
	
	SmartPhoneBasicsMobiles spbm = new SmartPhoneBasicsMobiles();
	spbm.clickOnRedmiA1();
	
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("scroll(0,600)");
	
	AddMobileToCart amc = new AddMobileToCart();
	amc.clickOnAddToCart();
	
	Thread.sleep(10000);
	String expected_result = "Added to Cart";
	String actual_result = amc.getStatusMessage();
	Assert.assertEquals(actual_result,expected_result);
	System.out.println("Expected result: " +expected_result);
	System.out.println("Actual result: " +actual_result);
	}
	}