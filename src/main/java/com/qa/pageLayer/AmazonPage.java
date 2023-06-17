package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class AmazonPage extends TestBase{
	
		public AmazonPage()
		{
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath ="//span[text()='Hello, sign in']")
		private WebElement lnk_SignIn;
		public void clickOnHelloSignIn()
		{
		lnk_SignIn.click();
		}
		}
