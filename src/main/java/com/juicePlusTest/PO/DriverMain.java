package com.juicePlusTest.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverMain {

	// Define web launch
	public static WebDriver driver;

	// @BeforeTest
	public void launch() {

		WebDriverManager.chromedriver().setup();

		// Not required to install chrome.exe
		driver = new ChromeDriver();
		driver.get("https://www.juiceplus.com");
	}

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.quit();
		driver.manage().window().maximize();
		driver.get("https://www.juiceplus.com");
		//driver.get("https://www.juiceplus.com/us/en/about-us/contact-us");

	}

	public void tearDown() {

		driver.quit();

	}

}
