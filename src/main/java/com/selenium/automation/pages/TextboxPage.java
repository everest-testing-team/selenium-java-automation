package com.selenium.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.automation.base.TestBase;
//TextBoxPage Example
public class TextboxPage extends TestBase {
	private By un = By.xpath("//input[@placeholder='Full Name']");
	private By email = By.id("userEmail");
	private By address = By.id("currentAddress");
	private By pAddress = By.id("permanentAddress");
	private By submit = By.id("submit");

	public void validateSubmitFunctionality() {
		
		WebElement username = driver.findElement(un);
		username.clear();
		username.sendKeys("Hello World!");
		
		WebElement emailAddress = driver.findElement(email);
		emailAddress.clear();
		emailAddress.sendKeys("testmail@email.com");
		
		WebElement addressField = driver.findElement(address);
		addressField.clear();
		addressField.sendKeys("Address");
		
		WebElement perAddress = driver.findElement(pAddress);
		perAddress.clear();
		perAddress.sendKeys("P Address");
		
		WebElement submitButton = driver.findElement(submit);
		submitButton.click();
		
	
	}
}
