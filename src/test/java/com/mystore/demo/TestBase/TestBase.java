package com.mystore.demo.TestBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.mystore.demo.DriverManager.AndroidDriverManager;
import com.mystore.demo.TestUtility.ActionClassUtility;
import com.mystore.demo.qa.ConfigurationFilesUtility.ReadDriverSetupConfiguration;

public class TestBase {

	public static ReadDriverSetupConfiguration readDriverSetupConfiguration;
	public static Logger logger;
	public AndroidDriver<AndroidElement> driver;
	public static final String driverSetupDataFile=System.getProperty("user.dir")+"/ConfigurationFiles/DriverSetupData";
	public AndroidDriverManager androidDriverManager;
	public static ActionClassUtility actionUtil;
	public static WebDriverWait webdriverWait;
	
	@BeforeSuite(groups={"Scenario_One","Scenario_Two"})
	public void setupBeforeSuite(){
		this.readDriverSetupConfiguration=new ReadDriverSetupConfiguration(this.driverSetupDataFile);
		
	}
	
	@BeforeTest(groups={"Scenario_One","Scenario_Two"})
	public void setupBeforeTest(){
		this.androidDriverManager=new AndroidDriverManager();
		this.driver=this.androidDriverManager.initialiseAndroidDriver();
		this.actionUtil=new ActionClassUtility(this.driver);
		this.webdriverWait=new WebDriverWait(this.driver, 20);
	}
	
	
	
	@AfterTest
	public void setupAfterTest(){
		
	}
	
	@AfterSuite
	public void setupAfterSuite(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
