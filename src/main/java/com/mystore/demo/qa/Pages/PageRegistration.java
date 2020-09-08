package com.mystore.demo.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mystore.demo.TestBase.TestBase;

public class PageRegistration extends TestBase{

	public WebDriver driver;
	public PageRegistration(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//p[contains(@id,'email-helper-text')]")
	WebElement lblAlertEmail;
	public WebElement lblAlertEmail(){
		WebElement element=null;
		try{element=this.lblAlertEmail;
		}catch(Exception ae){ae.printStackTrace();
		element=this.webdriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@id,'email-helper-text')]")));
		}return element;}
	
	
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Email')]")
	WebElement lblEmail;
	public WebElement lblEmail(){
		WebElement element=null;
		try{element=this.lblEmail;
		}catch(Exception ae){ae.printStackTrace();
		element=this.webdriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'Email')]")));
		}return element;}
	
	
	
	
	
	
	
}
