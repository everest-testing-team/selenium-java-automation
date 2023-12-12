package com.selenium.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Base_Insta {

	public static WebDriver driver = null;
	
	
    @Parameters({"browser"})
    @BeforeMethod
    public static void setup( String drivertype) {
		System.out.println("iam in Test_Base");

		if (drivertype.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (drivertype.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
	}
	
	@AfterMethod
	public void closedriver() throws InterruptedException
	{ 
		Thread.sleep(3000);
		driver.close();
	}
}
