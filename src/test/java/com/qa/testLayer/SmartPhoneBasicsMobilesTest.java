package com.qa.testLayer;

import org.testng.annotations.Test;
import com.qa.pageLayer.AmazonHomePage;
import com.qa.pageLayer.MobilePage;
import com.qa.pageLayer.SmartPhoneBasicsMobiles;
import com.qa.testBase.TestBase;

public class SmartPhoneBasicsMobilesTest extends TestBase{
	@Test
	public void verifySmartPhonesBasicsMobiles()
	{
	AmazonHomePage mobilecheck = new AmazonHomePage();
	mobilecheck.clickOnMobile();
	
	MobilePage mob = new MobilePage(); 
	mob.clickOnSmartphoneBasicMobiles();
	
	SmartPhoneBasicsMobiles spbm = new SmartPhoneBasicsMobiles();
	spbm.clickOnRedmiA1();
	}
}
