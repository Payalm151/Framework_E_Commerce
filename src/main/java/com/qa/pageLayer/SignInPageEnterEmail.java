package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SignInPageEnterEmail  extends TestBase{
	
	public SignInPageEnterEmail() {
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@id='ap_email']")
		private WebElement txt_SignIn;
		@FindBy(xpath="//input[@id='continue']")
		private WebElement btn_Continue;
		public void enterEmailAddress(String Email)
		{
		txt_SignIn.sendKeys(Email);
		}
		public void clickOnContinueButton()
		{
		btn_Continue.click();
		}
		}