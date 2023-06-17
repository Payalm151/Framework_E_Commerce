package com.qa.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.pageLayer.SignInPageEnterPassword;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass 
	public void startLogger() {
		logger = Logger.getLogger("Amazon Framework");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Framework Started");
	}
	@BeforeMethod
	public void setUp()
	{
	String browser = "edge"; //ignore case
	if(browser.equalsIgnoreCase("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	logger.info("Chrome browser launched");
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	}
	else
	{
	System.out.println("Please enter an appropriate browser from the above list");
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	logger.info("window maximized,deleting cookies,website launched,wait used ");
	
	
	//AmazonPage check = new AmazonPage();
	//check.clickOnHelloSignIn();
	
	//SignInPageEnterEmail signIn = new SignInPageEnterEmail();
	//signIn.enterEmailAddress("8380823740");
	//signIn.clickOnContinueButton();
	
	//SignInPageEnterPassword pass = new SignInPageEnterPassword(); 
	//pass.enterSignInPassword("Payal@151"); 
	//pass.clickOnSignInButton();
	}
	
	@AfterMethod
		public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
			driver.quit();
			logger.info("Browser closed");
		}
	@AfterClass
	public void loggerEnd() {
		logger.info("Framework execution completed");
	}
	}
