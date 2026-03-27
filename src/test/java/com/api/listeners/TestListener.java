package com.api.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TestListener implements ITestListener {
	private static final Logger logger = LogManager.getLogger(TestListener.class);

	public void onStart(ITestContext context) {
		logger.info("Test suite started...");
	}
	
	public void onTestStart(ITestResult result) {
	    logger.info("Test Started: {}", result.getMethod().getMethodName());
	    logger.info("Test Description: {}", result.getMethod().getDescription());
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Passed!!!!" + result.getMethod().getMethodName());
		logger.info("Description!!" + result.getMethod().getDescription());
	}

	public void onTestFailure(ITestResult result) {
		logger.error("Failed!!!!" + result.getMethod().getMethodName());
		logger.error("Description!!" + result.getMethod().getDescription());
	}

	public void onTestSkipped(ITestResult result) {
		logger.info("Skipped!!!!" + result.getMethod().getMethodName());
		logger.info("Description!!" + result.getMethod().getDescription());
	}

	public void onFinish(ITestContext context) {
		logger.info("Test suite completed...");
	}
}
