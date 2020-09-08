package com.mystore.demo.ReportUtility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;






import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.mystore.demo.TestBase.TestBase;


public class TestReportUtility extends TestBase{

	private static ExtentHtmlReporter htmlReporter=null;
	private static ExtentReports extentReports=null;
	private static ExtentTest extentsTest=null;
	private File src=null;
	public WebDriver driver;
	public TestReportUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void configureHtmlReporter(){
		try{
				   this.htmlReporter=new ExtentHtmlReporter(src);
			       this.htmlReporter.config().setDocumentTitle("Msite Automation Report");
			       this.htmlReporter.config().setReportName(" Web Automation Report");
			       this.htmlReporter.config().setTheme(Theme.DARK);
		}catch(Exception ae){
			logger.error("Exception occure while configureHtmlReporter", ae);
			logger.trace(ae);
			ae.printStackTrace();
		}}
	public void configureExtentReports(){
		try{
			this.extentReports=new ExtentReports();
					this.extentReports.attachReporter(getHtmlReporter());
		}catch(Exception ae){
			logger.error("Exception occure while ExtentReports", ae);
			logger.trace(ae);
			ae.printStackTrace();	
		}}
	
	public void flushReport(){
		try{
			if(this.extentReports!=null){
				this.extentReports.flush();
				logger.info("===============================================Report flush successfully ===============================================");
			}else{
			}
		}catch(Exception ae){
			logger.error("Exception occure while flushReport", ae);
			logger.trace(ae);
			ae.printStackTrace();}}
	
	
	public ExtentHtmlReporter getHtmlReporter(){
		ExtentHtmlReporter htmlReporter=null;
		try{
			htmlReporter=this.htmlReporter;
		}catch(Exception ae){logger.error("Exception occure while retrun ExtentHtmlReporter", ae);
		logger.trace(ae);
		ae.printStackTrace();}return htmlReporter;
	}
	
	public ExtentReports getExtentReports(){
		ExtentReports extentReports=null;
		try{
			extentReports=this.extentReports;
		}catch(Exception ae){logger.error("Exception occure while return ExtentReports", ae);
		logger.trace(ae);
		ae.printStackTrace();}return extentReports;
	}
	public ExtentTest getExtentTest(){
		ExtentTest extentTest=null;
		try{
			extentTest=this.extentsTest;
		}catch(Exception ae){logger.error("Exception occure while return ExtentTest", ae);
		logger.trace(ae);
		ae.printStackTrace();}return extentTest;
	}
	public void configureTest(String testName){
		try{
			logger.info("=============================================== ConfigureTest has stated===============================================");

			if(testName.equals("") || testName.equals(null)){
				logger.fatal("=============================================== Test Name passed incorrectly as "+testName+"===============================================");		
			}else{
			this.extentsTest=this.extentReports.createTest(testName);
			logger.info("=============================================== extends Test has create successfully with name : "+testName+"===============================================");
			}
			logger.info("=============================================== ConfigureTest has Completed===============================================");

		}catch(Exception ae){logger.error("Exception occure while configureTest", ae);
		logger.trace(ae);
		ae.printStackTrace();}
	}
	
	public void configureResult(ITestResult result){
		try{
			logger.info("=============================================== Configure Test has started===============================================");
			logger.info("=============================================== Test Case Name is "+result.getName()+" Test Case Status is "+result.getStatus()+"===============================================");
			switch(result.getStatus()){
			case ITestResult.SUCCESS:
				System.out.println("driver is " +driver);
				System.out.println("extent is "+this.extentsTest);
				this.extentsTest.log(Status.PASS, " Test Case Passed"+result.getName());
				logger.info("==============================================="+Status.PASS+" has successfully log with Test Case : "+result.getName()+"===============================================");
				this.extentsTest.log(Status.PASS, " Test Case Passed"+result.getThrowable());
				logger.info("==============================================="+Status.PASS+" has successfully log with Test Case : "+result.getName()+"===============================================");
				logger.info("=============================================== Test Case Name is "+result.getTestName()+" Test Case Status is "+result.getStatus()+"===============================================");
				
				break;
			case ITestResult.FAILURE:
				logger.info("=============================================== Test Case Name is "+result.getTestName()+" Test Case Status is "+result.getStatus()+"===============================================");
				this.extentsTest.log(Status.FAIL, " Test Case Failed" + result.getName());
				logger.info("==============================================="+Status.FAIL+" has successfully log with Test Case : "+result.getName()+"===============================================");
				break;
			case ITestResult.SKIP:
				logger.info("=============================================== Test Case Name is "+result.getTestName()+" Test Case Status is "+result.getStatus()+"===============================================");
				this.extentsTest.log(Status.SKIP, "Test Case Skipped"+result.getName());
				logger.info("==============================================="+Status.SKIP+" has successfully log with Test Case : "+result.getName()+"===============================================");
				break;
			default:logger.info("=============================================== Invalid Test Result is "+result+"===============================================");

			}
			
		}catch(Exception ae){logger.error("Exception occure while configureTestResult", ae);
		logger.trace(ae);
		ae.printStackTrace();}
	}
	
	
	
	
	
	
	
	
	
	
	
}
