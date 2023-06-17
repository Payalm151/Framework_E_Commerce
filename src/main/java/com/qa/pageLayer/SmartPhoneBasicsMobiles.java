package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SmartPhoneBasicsMobiles {
	public class SmartPhoneBasicsMobilesTest extends TestBase{
		
		public void SmartPhonesBasicsMobiles ()
		{
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//span[text()='Smartphones & Basic Mobiles']")
		private WebElement Smartphones;
		@FindBy(xpath="(//div[@class='a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3'])[3]")
		private WebElement redmiA1;
		public void clickOnSmartphoneBasicMobiles ()
		{
		Smartphones.click();
		}
		public void clickOnRedmiA1()
		{
		redmiA1.click();
		}
	}

	public void clickOnRedmiA1() {

		
	}
}