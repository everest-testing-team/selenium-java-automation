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
	
	public void fullname(By locator, String data) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			we.clear();
			we.sendKeys(data);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public void email(By locator, String data) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			we.clear();
			we.sendKeys(data);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
   public void currentaddress(By locator, String data) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			we.clear();
			we.sendKeys(data);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}

  public void permanentaddress(By locator, String data) throws Exception{
	
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

}
