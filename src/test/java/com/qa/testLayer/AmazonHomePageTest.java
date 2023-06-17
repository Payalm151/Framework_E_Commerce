package com.qa.testLayer;

import org.testng.annotations.Test;
import com.qa.pageLayer.AmazonHomePage;
import com.qa.testBase.TestBase;

public class AmazonHomePageTest extends TestBase{
	@Test
	public void verifyAmazonHomePage()
	{ 
	
	
	AmazonHomePage mobilecheck = new AmazonHomePage();
	mobilecheck.clickOnMobile();
	}
	}

