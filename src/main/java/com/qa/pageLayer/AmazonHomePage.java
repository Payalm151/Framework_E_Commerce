package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class AmazonHomePage extends TestBase{
	public AmazonHomePage()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement mobile;
	public void clickOnMobile()
	{
	mobile.click();
	}
}
