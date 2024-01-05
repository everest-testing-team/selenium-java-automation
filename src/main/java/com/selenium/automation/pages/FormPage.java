package com.selenium.automation.pages;

import org.openqa.selenium.By;

import com.selenium.automation.actions.ActionEngine;

public class FormPage extends ActionEngine {
	
	private By nameText = By.xpath("//input[@placeholder='First Name']");
	private By ln = By.id("lastName");
	private By email = By.id("userEmail");
	private By genderRdo = By.xpath("//label[@for='gender-radio-2']");
    private By mobile = By.xpath("//input[@placeholder='Mobile Number']");
    private By subjects = By.partialLinkText("subjects-auto");
    private By hobbiesRdo = By.xpath("//label[@for='hobbies-checkbox-1']");
    private By cAddress = By.id("currentAddress");
    private By state = By.partialLinkText("css");
    private By city = By.partialLinkText("control");
    private By submit = By.id("submit");
    
    
    public void validSubmitFunctionality() throws Exception{
    	
    	type (nameText, "kdhfjt");
    	type (ln, "SDS");
    	type (email, "kjf234@gmail.com");
    	click(genderRdo, "Gender");
    	type (mobile, "35567534624" );
    	type (subjects, "english");
    	click(hobbiesRdo, "sports");
    	type (cAddress, "hyd" );
    	type (state, "Telangana");
    	type (city, "DELHI");
    	submit(submit);
    	
    }
    
}
