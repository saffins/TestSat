package com.juicePlusTest.PO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutUsPO extends DriverMain {

	private final WebElement abtUs = driver
			.findElement(By.xpath("//li[@class=' noleaf  ']//*[contains(text(),'About Us')][1]"));

	WebDriverWait driverWait = new WebDriverWait(driver, 60);

	Actions actions = new Actions(driver);

	public static void waitFor() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public boolean tapOnAboutUS() {

		try {
			waitFor();
			Actions actions = new Actions(driver);
			WebElement AboutUsMenu = driver.findElement(By.xpath("//*[@id=\"desktop-topnav\"]/li[6]/a"));
			actions.moveToElement(AboutUsMenu).perform();
			WebElement ContactUsDropdown = driver.findElement(By.xpath("//*[@id=\"desktop-topnav\"]/li[6]/ul/li[6]/a"));
			ContactUsDropdown.click();
			return true;
		} catch (Exception e) {
			return false;

		}
	}

}
