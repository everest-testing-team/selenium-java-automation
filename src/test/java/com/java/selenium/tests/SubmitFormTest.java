package com.java.selenium.tests;

import org.testng.annotations.Test;

import com.selenium.automation.actions.ActionEngine;
import com.selenium.automation.pages.FormPage;


public class SubmitFormTest extends ActionEngine {
	
	FormPage formPage = new FormPage();
	 
	 @Test
	 public void selectValueFromDropdownByValue() throws Exception{
		 formPage.validSubmitFunctionality(); 
	 }
}
