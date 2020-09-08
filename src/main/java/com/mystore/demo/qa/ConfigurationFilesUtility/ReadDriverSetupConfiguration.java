package com.mystore.demo.qa.ConfigurationFilesUtility;

public class ReadDriverSetupConfiguration extends ReadConfigurationFilesBase{

	public ReadDriverSetupConfiguration(String filepath) {
		super(filepath);
	}
	
	public String getDeviceName(){
		String deviceName="";
		try{
			deviceName=getProperties().getProperty("DeviceName");
		}catch(Exception ae){
			ae.printStackTrace();
		}return deviceName;}
	
	
	public String getAutomationName(){
		String AutomationName="";
		try{
			AutomationName=getProperties().getProperty("AutomationName");
		}catch(Exception ae){
			ae.printStackTrace();
		}return AutomationName;}
	
	
	public String getPlatformName(){
		String platformName="";
		try{
			platformName=getProperties().getProperty("PlatformName");
		}catch(Exception ae){
			ae.printStackTrace();
		}return platformName;}
	
	
	public String getDeviceVersion(){
		String deviceVersion="";
		try{
			deviceVersion=getProperties().getProperty("DeviceVersion");
		}catch(Exception ae){
			ae.printStackTrace();
		}return deviceVersion;}
	
	
	public String getAppLocation(){
		String appLocation="";
		try{
			appLocation=getProperties().getProperty("AppLocation");
		}catch(Exception ae){
			ae.printStackTrace();
		}return appLocation;}
	
	
	public String getConnectionUrl(){
		String connectionUrl="";
		try{
			connectionUrl=getProperties().getProperty("ConnectionUrl");
		}catch(Exception ae){
			ae.printStackTrace();
		}return connectionUrl;}
	
	public String getCommandTimeOut(){
		String commandTimeOut="";
		try{
			commandTimeOut=String.valueOf(getProperties().getProperty("CommandTimeOut"));
		}catch(Exception ae){
			ae.printStackTrace();
		}return commandTimeOut;}
	
	public String getAppliationUrl(){
		String ApplicationUrl="";
		try{
			ApplicationUrl=getProperties().getProperty("ApplictionUrl");
		}catch(Exception ae){
			ae.printStackTrace();
		}return ApplicationUrl;}
	
	
	
}
