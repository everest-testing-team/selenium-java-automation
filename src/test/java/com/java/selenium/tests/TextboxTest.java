package com.java.selenium.tests;

import org.testng.annotations.Test;

import com.selenium.automation.actions.ActionEngine;
import com.selenium.automation.pages.TextboxPage;

public class TextboxTest extends ActionEngine {
	TextboxPage textboxPage = new TextboxPage();

	@Test(priority = 1)
	public void textboxTest() throws Exception {
		textboxPage.validateSubmitFunctionality();

	}
}
