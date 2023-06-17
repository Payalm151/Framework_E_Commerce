package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {
	//Right click on ListenerSetup class --> Source --> Implement Methods --> Select check box for ITestListener
	// Click ok
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test Execution Started");
	// onTestStart()
	}
	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Test Execution completed successfully");
	//Screenshot.takeScreenshot(result.getName()+System.currentTimeMillis());
	//System.out.println("Screenshot captured successfully");
	}
	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Test Execution failed");
	Screenshot.takeScreenshot(result.getName()+System.currentTimeMillis());
	System.out.println("Screenshot captured successfully");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("Test Execution skipped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}
	@Override
	public void onStart(ITestContext context) {
	}
	@Override
	public void onFinish(ITestContext context) {
	}
	}