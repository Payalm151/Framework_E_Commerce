package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.AmazonPage;
import com.qa.testBase.TestBase;

public class AmazonPageTest extends TestBase {
	@Test
	public void verifyAmazonPage()
	{
		
	AmazonPage check = new AmazonPage();
	check.clickOnHelloSignIn();
	
	}
	}