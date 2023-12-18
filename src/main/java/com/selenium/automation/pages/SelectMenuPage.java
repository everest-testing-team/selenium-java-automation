package com.selenium.automation.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.selenium.automation.actions.ActionEngine;

public class SelectMenuPage extends ActionEngine{
	private By oldStyleSelectMenu = By.id("oldSelectMenu");
	
	public void selectDropdownByVisibletext() throws Exception{
		selectByyDropdownVisibleText(oldStyleSelectMenu, "Old Style Select Menu", "Purple");
	}
	
	public void selectDropdownByIndex() throws Exception{
		selectByyDropdownIndex(oldStyleSelectMenu, "Old Style Select Menu", 5);
	}
	
	public void selectDropdownByValue() throws Exception{
		selectByDropdownValue(oldStyleSelectMenu, "Old Style Select Menu", "10");
		Assert.assertTrue(false);
	}
	
	

}
