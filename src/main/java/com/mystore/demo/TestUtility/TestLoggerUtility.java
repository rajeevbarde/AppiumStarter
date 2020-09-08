package com.mystore.demo.TestUtility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;


public class TestLoggerUtility {

	public static Logger logger;
	String loggetPathFile;
	public TestLoggerUtility() {
		try{
		logger = Logger.getLogger("ipartner");
		loggetPathFile=System.getProperty("user.dir")+"/log file/log4j.properties";
		PropertyConfigurator.configure(loggetPathFile);
		logger.info("=============================================== test logger has initialised successfully ===============================================");

		}catch(Exception ae){
			ae.printStackTrace();
		}	
	}
	
	public Logger get_Instance() {
		return this.logger;
	}
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

