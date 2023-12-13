package com.selenium.automation.pages;

import org.openqa.selenium.By;

import com.selenium.automation.base.Test_Base_Insta;

public class InstagramLogin_Page extends Test_Base_Insta {
	
	public void loginfunctionality() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Kandula Vijaya");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vijaya@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
	}
	
	

}

