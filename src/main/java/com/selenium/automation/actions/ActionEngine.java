package com.selenium.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.automation.base.TestBase;

public class ActionEngine extends TestBase {
	WebElement webElement;
	
	
	public WebElement getWebElement(By locator) throws Exception{
		webElement = driver.findElement(locator);
		return webElement;
		
	}
	
	public String getText(By locator, String locatorName) throws Exception{
		String text = "";
		try {
			WebElement we = getWebElement(locator);
			we.getText();
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return text;
	}
	
	
	public void click(By locator, String locatorName) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			we.click();
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public void type(By locator, String data) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			we.clear();
			we.sendKeys(data);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}

  public void submit(By locator) throws Exception{
	
	try {
		WebElement we = getWebElement(locator);
		we.click();
	}catch(Exception e) {
		e.printStackTrace();
	} finally {
		
	}
	
}
  
	public void selectByyDropdownVisibleText(By locator, String locatorName, String visibleText) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			Select dropDown = new Select(we);
			dropDown.selectByVisibleText(visibleText);
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public void selectByyDropdownIndex(By locator, String locatorName, int index) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			Select dropDown = new Select(we);
			dropDown.selectByIndex(index);
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public void selectByDropdownValue(By locator, String locatorName, String value) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			Select dropDown = new Select(we);
			dropDown.selectByValue(value);
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}

}
