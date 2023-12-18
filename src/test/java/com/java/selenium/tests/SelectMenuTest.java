package com.java.selenium.tests;

import org.testng.annotations.Test;
import com.selenium.automation.actions.ActionEngine;
import com.selenium.automation.pages.SelectMenuPage;

public class SelectMenuTest extends ActionEngine{
	
	SelectMenuPage selectMenuPage = new SelectMenuPage();
	
	//@Test
	public void selectValueFromDropdopdownByVisibleText() throws Exception{
		selectMenuPage.selectDropdownByVisibletext();
	}
	
	//@Test
	public void selectValueFromDropdopdownByIndex() throws Exception{
		selectMenuPage.selectDropdownByIndex();
	}
	
	@Test
	public void selectValueFromDropdopdownByValue() throws Exception{
		selectMenuPage.selectDropdownByValue();
	}
}
