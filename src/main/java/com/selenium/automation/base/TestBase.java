package com.selenium.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver=null;
	
	@Parameters({"browser"})
	@BeforeMethod
	public static void setup(String browserType) {
		
		System.out.println("I'm in BaseTest");
		if (browserType.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browserType.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if(browserType.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		//

	}
	
	@AfterMethod
	public void closeDriver(){
		//driver.close();
	}
	
	 // public static void main(String[] args) { setup(); }
	 

}
