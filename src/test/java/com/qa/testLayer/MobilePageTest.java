package com.qa.testLayer;

import org.testng.annotations.Test;
import com.qa.pageLayer.AmazonHomePage;
import com.qa.pageLayer.MobilePage;
import com.qa.testBase.TestBase;

public class MobilePageTest extends TestBase{
	
	@Test
	public void verifyMobilePage()
	{

	AmazonHomePage mobilecheck = new AmazonHomePage();
	mobilecheck.clickOnMobile();
	
	MobilePage mob = new MobilePage();
	mob.clickOnSmartphoneBasicMobiles();
	}
}
