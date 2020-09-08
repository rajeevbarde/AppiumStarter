package com.mystore.demo.testcase;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.demo.TestBase.TestBase;
import com.mystore.demo.qa.Pages.ErrorMessages;
import com.mystore.demo.qa.Pages.PageHome;
import com.mystore.demo.qa.Pages.PageRegistration;

public class Assignment extends TestBase{
	
	PageHome pageHome;
	PageRegistration pageRegistration;
	ErrorMessages errorMessage;
	
	/*
	 * Execute Test Case from Testng.xml which is present in TestRunner Folder
	 * Follow Page Object Pattern using pageFactory.
	 * 
	 */
			
	
	
	

	@BeforeClass(enabled=true,groups={"Scenario_One","Scenario_Two"})
	public void setupBeforeClass(){
		try{
		this.pageHome=new PageHome(super.driver);
		}catch(Exception ae){
			ae.printStackTrace();
		}}
	
	@BeforeGroups(groups={"Scenario_One"})
	public void setupBeforeGroup(){
		try{
			this.pageHome.clkLetsBegin();
		}catch(Exception ae){
			ae.printStackTrace();
		}
	}
	
	@Test(enabled=false,priority=0,groups={"Scenario_One"})
	public void TC_verifyAlertMessageOfDateOfBirth(){
		try{
			errorMessage=ErrorMessages.lblAlertOfDateOfBirth;
			if(this.driver.getCurrentUrl().equals("https://www.sangam.com/")){
				if(this.pageHome.lblAlertOfDateOfBirth().isDisplayed()){
					if(this.pageHome.lblAlertOfDateOfBirth().getText().equals(errorMessage.getAlertMessage())){
						assertTrue(true,"lblAlertOfDateOfBirth has been displayed correctly");
					}else{
						assertTrue(false,"lblAlertOfDateOfBirth has not been displayed correctly");}
				}else{
					assertTrue(false,"lblAlertOfDateOfBirth has been not displayed/Visible");}
			}else{
				assertTrue(false,"Page Url has not been matched and redirect into another page");}	
		}catch(Exception ae){
			ae.printStackTrace();}}
	
	@Test(enabled=false,priority=1,groups={"Scenario_One"})
	public void TC_verifyAlertMessageOfCommunity(){
		try{
			errorMessage=ErrorMessages.lblAlertOfCommunity;
			if(this.driver.getCurrentUrl().equals("https://www.sangam.com/")){
				if(this.pageHome.lblAlertOfCommunity().isDisplayed()){
					if(this.pageHome.lblAlertOfCommunity().getText().equals(errorMessage.getAlertMessage())){
						assertTrue(true,"lblAlertOfCommunity has been displayed correctly");
					}else{
						assertTrue(false,"lblAlertOfCommunity has not been displayed correctly");
					}
				}else{
					assertTrue(false,"lblAlertOfCommunity has been not displayed/Visible");
				}
			}else{
				assertTrue(false,"Page Url has not been matched and redirect into another page");
			}}catch(Exception ae){
			ae.printStackTrace();
		}}
	
	@Test(enabled=true,priority=0,groups={"Scenario_Two"},dataProvider="UserData")
	public void TC_VerifyRegistration(String profile,String gender,String dateOfBirth,String motherTouge,String community,String url ){
		try{
			this.pageHome.selectProfile(profile);
			this.pageHome.selectGender(gender);
			this.pageHome.selectDateOfBirth(dateOfBirth);
			this.pageHome.selectMotherTongue(motherTouge);
			this.pageHome.selectCommunity(community);
			this.pageHome.selectchkCommunity();
			this.pageRegistration=this.pageHome.clkLetsBegin();
			errorMessage=ErrorMessages.lblAlertOfEmail;
			
			
			if(this.driver.getCurrentUrl().equals(url)){
				assertTrue(false);
			}else{
				if(this.pageRegistration.lblEmail().isDisplayed()){
					this.pageRegistration.lblEmail().click();
				if(this.pageRegistration.lblAlertEmail().isDisplayed()){
					if(this.pageRegistration.lblAlertEmail().getText().equals(errorMessage)){
						assertTrue(true,"Email view has been displayed correctly");
					}else{
						assertTrue(false,"Email view has not been displayed correctly");}
				}else{
					assertTrue(false,"Email view has not been displayed");}}else {
						assertTrue(false,"Email view has not been displayed");
						}
					}
		}catch(Exception ae){
			ae.printStackTrace();}}
	
	@DataProvider(name="UserData")
	public void TestDataForScenarioTwo(){
		try{
			String [][]data=new String[1][6];
			data[0][1]="Friend";
			data[0][2]="Male";
			data[0][3]="22/02/1994";
			data[0][4]="Tulu";
			data[0][5]="Parsi";
			data[0][6]="https://www.sangam.com/";
			
		}catch(Exception ae){
			ae.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
