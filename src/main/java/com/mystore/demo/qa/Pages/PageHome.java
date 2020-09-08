package com.mystore.demo.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mystore.demo.TestBase.TestBase;

public class PageHome extends TestBase{
	
	public WebDriver driver;
	public PageHome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(@id,'homeButton')]")
	WebElement btnLestBegin;
	public WebElement btnLetsBegin(){
		WebElement element=null;
		try{element=this.btnLestBegin;
		}catch(Exception ae){ae.printStackTrace();
		element=this.webdriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@id,'homeButton')]")));
		}return element;}
	public PageRegistration clkLetsBegin(){
		PageRegistration pageRegistration=null;
		try{
			this.actionUtil.get_Action().moveToElement(btnLestBegin).build().perform();
			this.webdriverWait.until(ExpectedConditions.elementToBeClickable(btnLestBegin)).click();
			pageRegistration=new PageRegistration(driver);
		}catch(Exception ae){
			ae.printStackTrace();
		}return pageRegistration;}
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Please specify Date of Birth')]")
	WebElement lblAlertOfDateOfBirth;
	public WebElement lblAlertOfDateOfBirth(){
		WebElement element=null;
		try{
			element=this.lblAlertOfDateOfBirth;
		}catch(Exception ae){
			ae.printStackTrace();
		}return element;}
	
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Please specify Caste / Community')]")
	WebElement lblAlertOfCommunity;
	public WebElement lblAlertOfCommunity(){
		WebElement element=null;
		try{
			element=this.lblAlertOfCommunity;
		}catch(Exception ae){
			ae.printStackTrace();
		}return element;}
	
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Create Profile for')]/ancestor::div[1]/descendant::div[2]")
	WebElement ddProfile;
	public WebElement ddProfile(){
		WebElement element=null;
		try{element=this.ddProfile;
		}catch(Exception ae){ae.printStackTrace();
		element=this.webdriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'Create Profile for')]/ancestor::div[1]/descendant::div[2]")));
		}return element;}
	public void clkddProfile(){
		WebElement element=null;
		try{
			this.actionUtil.get_Action().moveToElement(ddProfile()).build().perform();
			element=this.webdriverWait.until(ExpectedConditions.elementToBeClickable(ddProfile));
			element.click();
		}catch(Exception ae){
			ae.printStackTrace();}}
	
	public void selectProfile(String profile){
		try{
		boolean elementStatue=false;
		WebElement element=null;
		clkddProfile();
		List<WebElement>profiles=driver.findElements(By.tagName("li"));
		System.out.println(profiles.size());
		for(int i=0;i<profiles.size();i++){
			if(profiles.get(i).getText().trim().equals(profile.trim())){
				element=this.driver.findElement(By.xpath("//li[contains(text(),'"+profile+"')]"));
				this.actionUtil.get_Action().moveToElement(element).build().perform();
				this.webdriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
				elementStatue=true;
			}
		}	if(elementStatue==false){
			//logger.info("You have entered Wrong proile name, Please enter Correct profile name");
		}
		}catch(Exception ae){
			ae.printStackTrace();
		}
	}
	
	public void selectDateOfBirth(String dateOfBirth){
		String []Date=dateOfBirth.split("/");
		String day=Date[0];
		String month=Date[1];
		String year=Date[2];
		List<WebElement>txtDateOfBirth=driver.findElements(By.xpath("//input[contains(@id,'dob-input')]/ancestor::div[2]/descendant::input"));
		try{
			for(int i=1;i<txtDateOfBirth.size()+1;i++){
				switch(i){
				case 1:driver.findElement(By.xpath("//input[contains(@id,'dob-input')]/ancestor::div[2]/descendant::input["+i+"]")).sendKeys(String.valueOf(day.charAt(0)));
					break;
				case 2: driver.findElement(By.xpath("//input[contains(@id,'dob-input')]/ancestor::div[2]/descendant::input["+i+"]")).sendKeys(String.valueOf(day.charAt(1)));
					break;
				case 3:driver.findElement(By.xpath("//input[contains(@id,'dob-input')]/ancestor::div[2]/descendant::input["+i+"]")).sendKeys(String.valueOf(month.charAt(0)));
					break;
				case 4:driver.findElement(By.xpath("//input[contains(@id,'dob-input')]/ancestor::div[2]/descendant::input["+i+"]")).sendKeys(String.valueOf(month.charAt(0)));
					break;
				case 5:driver.findElement(By.xpath("//input[contains(@id,'dob-input')]/ancestor::div[2]/descendant::input["+i+"]")).sendKeys(String.valueOf(year.charAt(0)));
					break;
				case 6:driver.findElement(By.xpath("//input[contains(@id,'dob-input')]/ancestor::div[2]/descendant::input["+i+"]")).sendKeys(String.valueOf(year.charAt(1)));
					break;
				case 7:driver.findElement(By.xpath("//input[contains(@id,'dob-input')]/ancestor::div[2]/descendant::input["+i+"]")).sendKeys(String.valueOf(year.charAt(2)));
					break;
				case 8:driver.findElement(By.xpath("//input[contains(@id,'dob-input')]/ancestor::div[2]/descendant::input["+i+"]")).sendKeys(String.valueOf(year.charAt(3)));
					break;
				}
			}
		}catch(Exception ae){
			ae.printStackTrace();
		}
	}
	
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Mother Tongue')]/following-sibling::div[1]")
	WebElement ddMotherTongue;
	public WebElement ddMotherTongue(){
		WebElement element=null;
		try{element=this.ddMotherTongue;
		}catch(Exception ae){ae.printStackTrace();
		element=this.webdriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Mother Tongue')]/following-sibling::div[1]")));
		}return element;}
	public void clkddMotherTongue(){
		WebElement element=null;
		try{
			this.actionUtil.get_Action().moveToElement(ddMotherTongue()).build().perform();
			element=this.webdriverWait.until(ExpectedConditions.elementToBeClickable(ddMotherTongue));
			element.click();
		}catch(Exception ae){
			ae.printStackTrace();}}
	
	public void selectMotherTongue(String motherTongue){
		try{
		boolean elementStatue=false;
		WebElement element=null;
		clkddMotherTongue();
		List<WebElement>MotherTongue=driver.findElements(By.xpath("//div[contains(text(),'Frequently used')]/ancestor::div[2]/descendant::span/div"));
		for(int i=0;i<MotherTongue.size();i++){
			if(MotherTongue.get(i).getText().trim().equals(motherTongue.trim())){
				element=this.driver.findElement(By.xpath("//div[contains(text(),'Frequently used')]/ancestor::div[2]/descendant::span/div[contains(text(),'"+motherTongue+"')]"));
				this.actionUtil.get_Action().moveToElement(element).build().perform();
				this.webdriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
				elementStatue=true;
			}
		}	if(elementStatue==false){
			//logger.info("You have entered Wrong proile name, Please enter Correct profile name");
		}
		}catch(Exception ae){
			ae.printStackTrace();
		}
	
		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Community')]/following-sibling::div[1]")
	WebElement ddCommunity;
	public WebElement ddCommunity(){
		WebElement element=null;
		try{element=this.ddCommunity;
		}catch(Exception ae){ae.printStackTrace();
		element=this.webdriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Community')]/following-sibling::div[1]")));
		}return element;}
	public void clkddCommunity(){
		WebElement element=null;
		try{
			this.actionUtil.get_Action().moveToElement(ddCommunity()).build().perform();
			element=this.webdriverWait.until(ExpectedConditions.elementToBeClickable(ddCommunity));
			element.click();
		}catch(Exception ae){
			ae.printStackTrace();}}
	
	public void selectCommunity(String Community){
		try{
		boolean elementStatue=false;
		WebElement element=null;
		clkddMotherTongue();
		List<WebElement>MotherTongue=driver.findElements(By.xpath("//div[contains(text(),'Frequently used')]/ancestor::div[2]/descendant::span/div"));
		for(int i=0;i<MotherTongue.size();i++){
			if(MotherTongue.get(i).getText().trim().equals(Community.trim())){
				element=this.driver.findElement(By.xpath("//div[contains(text(),'Community')]/ancestor::div[1]/descendant::span/div[contains(text(),'"+Community+"')]"));
				this.actionUtil.get_Action().moveToElement(element).build().perform();
				this.webdriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
				elementStatue=true;
			}
		}	if(elementStatue==false){
			//logger.info("You have entered Wrong proile name, Please enter Correct profile name");
		}
		}catch(Exception ae){
			ae.printStackTrace();
		}}
	
	
	
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Community')]/ancestor::div[1]/following-sibling::div[1]/descendant::input[1]")
	WebElement chkCommunity;
	public WebElement chkCommunity(){
		WebElement element=null;
		try{element=this.ddProfile;
		}catch(Exception ae){ae.printStackTrace();
		element=this.webdriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Community')]/ancestor::div[1]/following-sibling::div[1]/descendant::input[1]")));
		}return element;}
	public void selectchkCommunity(){
		WebElement element=null;
		try{
			this.actionUtil.get_Action().moveToElement(ddProfile()).build().perform();
			element=this.webdriverWait.until(ExpectedConditions.elementToBeClickable(ddProfile));
			element.click();
		}catch(Exception ae){
			ae.printStackTrace();}}
	
	public void selectGender(String gender){
		try{
			if(gender.equals("Male")){
				this.driver.findElement(By.xpath("//span[contains(text(),'"+gender+"')]/ancestor::span/preceding-sibling::span/descendant::input[1]")).click();
			}else if(gender.equals("Female")){
				this.driver.findElement(By.xpath("//span[contains(text(),'"+gender+"')]/ancestor::span/preceding-sibling::span/descendant::input[1]")).click();
			}else{
				System.out.println("Invalid gender");
			}
		}catch(Exception ae){
			ae.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
