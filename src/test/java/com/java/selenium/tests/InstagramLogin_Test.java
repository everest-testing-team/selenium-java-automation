package com.java.selenium.tests;

import org.testng.annotations.Test;
import com.selenium.automation.pages.InstagramLogin_Page;

public class InstagramLogin_Test extends InstagramLogin_Page {
	
	InstagramLogin_Page instagramlogin_page = new InstagramLogin_Page();
	
	@Test(priority=1)
	public void instagramlogin_test() throws InterruptedException
	{
	
		instagramlogin_page.loginfunctionality();
	}
	
}
