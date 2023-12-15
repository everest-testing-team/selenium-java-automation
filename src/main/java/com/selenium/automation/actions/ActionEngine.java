package com.selenium.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.selenium.automation.base.TestBase;

public class ActionEngine extends TestBase {
	WebElement webElement;
	
	
	public WebElement getWebElement(By locator) throws Exception{
		webElement = driver.findElement(locator);
		return webElement;
		
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
	
	public void type(By locator, String data, String locatorName) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			we.clear();
			we.sendKeys(data);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}

}
