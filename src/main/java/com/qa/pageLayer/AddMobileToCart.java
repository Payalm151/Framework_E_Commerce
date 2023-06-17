package com.qa.pageLayer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class AddMobileToCart extends TestBase {
	public AddMobileToCart()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCart;
	@FindBy(xpath="//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
	private WebElement status_Message;
	public void clickOnAddToCart()
	{
	addToCart.click();
	}
	public String getStatusMessage()
	{
	String text = status_Message.getText();
	return text;
	}
	}