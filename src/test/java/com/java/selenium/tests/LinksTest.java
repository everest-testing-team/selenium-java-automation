package com.java.selenium.tests;

import org.testng.annotations.Test;

import com.selenium.automation.base.TestBase;
import com.selenium.automation.pages.LinksPage;

public class LinksTest extends TestBase{
	LinksPage linksPage = new LinksPage();
	
	@Test
	public void homeLinktest() throws Exception{
		
		linksPage.clickHomeLink();
	}

}
