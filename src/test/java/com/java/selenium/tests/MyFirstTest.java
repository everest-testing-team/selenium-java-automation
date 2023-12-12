package com.java.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTest {
	
	@Test
	public void testMethod1() {
		
		System.out.println("I'm in my testMethod1() method!!!");
		
	}
	
	@Test
	public void secondTestMethod() {
		Assert.assertFalse(false);
		System.out.println("I'm in my secondTestMethod() method!!!");
		
	}
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		Assert.assertFalse(false);
		System.out.println("I'm in my beforeSuiteMethod() method!!!");
		
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		Assert.assertFalse(false);
		System.out.println("I'm in my beforeTestMethod() method!!!");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Assert.assertFalse(false);
		System.out.println("I'm in my beforeMethod() method!!!");
		
	}
	
	@BeforeSuite
	public void beforeSuiteMethod2() {
		Assert.assertFalse(false);
		System.out.println("I'm in my beforeSuiteMethod2() method!!!");
		
	}
	
	// BeforeSuite
	// AfterSuite
	
	// BeforeTest
	// AfterTest
	
	//BeforeMethod
	//AfterMethod
	
	// Test
	// Test
	// Test

}
