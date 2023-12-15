package com.selenium.automation.pages;

import org.openqa.selenium.By;

import com.selenium.automation.actions.ActionEngine;

public class LinksPage extends ActionEngine{
	//private By homeLink = By.linkText("Home");
	private By homeLinkPL = By.partialLinkText("Bad");
	
	public void clickHomeLink() throws Exception{
		click(homeLinkPL, "Bad Request Link");
	}
	

}
