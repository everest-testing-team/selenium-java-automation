package com.java.selenium.tests;

import org.testng.annotations.Test;

import com.selenium.automation.base.TestBase;
import com.selenium.automation.pages.TextboxPage;

public class TextboxTest extends TestBase {
	TextboxPage textboxPage = new TextboxPage();

	@Test(priority = 1)
	public void textboxTest() {
		textboxPage.validateSubmitFunctionality();

	}
	
	@Test(priority = 2)
	public void textboxTest2() {
		textboxPage.validateSubmitFunctionality();

	}
	
	@Test(priority = 3)
	public void textboxTest3() {
		textboxPage.validateSubmitFunctionality();

	}
	@Test(priority = 4)
	public void textboxTest4() {
		textboxPage.validateSubmitFunctionality();

	}

	@Test(priority = 6)
	public void textboxTest6() {
		textboxPage.validateSubmitFunctionality();

	}
	
	@Test(priority = 7)
	public void textboxTest7() {
		textboxPage.validateSubmitFunctionality();

	}
}
