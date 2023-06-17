package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SignInPageEnterPassword extends TestBase {
	
	public SignInPageEnterPassword()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement txt_pass;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement btn_signIn;
	public void enterSignInPassword(String Password)
	{
	txt_pass.sendKeys(Password);
	}
	public void clickOnSignInButton()
	{
	btn_signIn.click();
	}
	}

