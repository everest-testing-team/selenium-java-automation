package com.selenium.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.automation.actions.ActionEngine;
import com.selenium.automation.base.TestBase;

public class TextboxPage extends ActionEngine {
	private By un = By.xpath("//input[@placeholder='Full Name']");
	private By email = By.id("userEmail");
	private By address = By.id("currentAddress");
	private By pAddress = By.id("permanentAddress");
	private By submit = By.id("submit");

	public void validateSubmitFunctionality() throws Exception{
		
		//WebElement username = driver.findElement(un);
		//username.clear();
		//username.sendKeys("Hello World!");
		type(un, "Hello World!");
		
		//WebElement emailAddress = driver.findElement(email);
		//emailAddress.clear();
		//emailAddress.sendKeys("testmail@email.com");
		type(email, "testmail@email.com");
		
		//WebElement addressField = driver.findElement(address);
		//addressField.clear();
		//addressField.sendKeys("Address");
		type(address, "current address");
		
		//WebElement perAddress = driver.findElement(pAddress);
		//perAddress.clear();
		//perAddress.sendKeys("P Address");
		type(pAddress, "permanent address");
		
		//WebElement submitButton = driver.findElement(submit);
		//submitButton.click();
		submit(submit);
		
		
	}
}
