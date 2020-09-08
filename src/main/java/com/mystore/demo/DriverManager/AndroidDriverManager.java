package com.mystore.demo.DriverManager;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import com.mystore.demo.TestBase.TestBase;

public class AndroidDriverManager extends TestBase{

	private AndroidDriver<AndroidElement> driver;
	private DesiredCapabilities desiredCapabilities;
	
	public AndroidDriver<AndroidElement> initialiseAndroidDriver(){
		try{
			this.desiredCapabilities=configureDesiredCapabilities(readDriverSetupConfiguration.getDeviceName(), readDriverSetupConfiguration.getAutomationName(), readDriverSetupConfiguration.getCommandTimeOut(), readDriverSetupConfiguration.getAppLocation());
			this.driver=createConnection(readDriverSetupConfiguration.getConnectionUrl(), this.desiredCapabilities);
			this.driver.get(readDriverSetupConfiguration.getAppliationUrl());
		}catch(Exception ae){
			ae.printStackTrace();
		}return this.driver;}
	
	public DesiredCapabilities configureDesiredCapabilities(String deviceName,String AutomationName,String NewCommandTimeOut,String AppLocation){
		DesiredCapabilities desiredCapability=null;
		try{
			System.out.println("Device name is " +deviceName);
			
			desiredCapability=new DesiredCapabilities();
			desiredCapability.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			desiredCapability.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName);
			desiredCapability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, NewCommandTimeOut);
			desiredCapability.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			//desiredCapability.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+AppLocation);
		}catch(Exception ae){
			ae.printStackTrace();
		}return desiredCapability;}
	
	public AndroidDriver<AndroidElement> createConnection(String connectionUrl,DesiredCapabilities capabilities){
		AndroidDriver<AndroidElement> androidDriver=null;
		try{
			androidDriver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		}catch(MalformedURLException net){
			net.printStackTrace();
		}catch (Exception net) {
			net.printStackTrace();
			// TODO: handle exception
		}return androidDriver;}
	
	
	
	public AndroidDriver<AndroidElement> getAndroidDriver(){
		AndroidDriver<AndroidElement> driver=null;
		try{
			driver=this.driver;
		}catch(Exception ae){
			ae.printStackTrace();
		}return driver;}
	
	public DesiredCapabilities getDesiredCapabilities(){
		DesiredCapabilities desiredCapabilities=null;
		try{
			desiredCapabilities=this.desiredCapabilities;
		}catch(Exception ae){
			ae.printStackTrace();
		}return desiredCapabilities;}
	
	
	
	
	
	
	
	
	
	
}
