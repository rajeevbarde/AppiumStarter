package com.mystore.demo.qa.Pages;

public enum ErrorMessages {
	
	lblAlertOfDateOfBirth ("Please specify Date of Birth"), 
	lblAlertOfCommunity ("Please specify Caste / Community"), 
	lblAlertOfEmail("Please specify Email Id"),
	  ; 
	 
	  private final String shortCode;
		  
	  ErrorMessages(String code) {
	      this.shortCode = code;
	  }
		  
	  public String getAlertMessage() {
	      return this.shortCode;
	  }

}
