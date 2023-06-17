package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.pageLayer.SignInPageEnterPassword;
import com.qa.testBase.TestBase;

public class SignInPageEnterPasswordTest extends TestBase{
	
	@Test
	public void verifyEnterPasswordFunctionality()
	{ 
	AmazonPage check = new AmazonPage();
	check.clickOnHelloSignIn();
	
	SignInPageEnterEmail signIn = new SignInPageEnterEmail();
	signIn.enterEmailAddress("8380823740");
	signIn.clickOnContinueButton();
	
	SignInPageEnterPassword pass = new SignInPageEnterPassword();
	pass.enterSignInPassword("Payal@151");
	pass.clickOnSignInButton();
	}
	}

