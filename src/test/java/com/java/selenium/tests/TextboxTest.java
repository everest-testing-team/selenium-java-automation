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
}
