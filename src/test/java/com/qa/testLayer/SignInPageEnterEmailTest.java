package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.testBase.TestBase;

public class SignInPageEnterEmailTest extends TestBase {
	
	@Test
	public void verifySignInFunctionality()
	{
	AmazonPage check = new AmazonPage();
	check.clickOnHelloSignIn();
	
	SignInPageEnterEmail signIn = new SignInPageEnterEmail();
	signIn.enterEmailAddress("8380823740");
	signIn.clickOnContinueButton();
	}
	}
