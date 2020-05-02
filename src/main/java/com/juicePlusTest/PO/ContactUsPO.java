package com.juicePlusTest.PO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsPO extends DriverMain {

	// value will not change
	// private final WebElement firstName =
	// driver.findElement(By.xpath("//*[@id='firstName']"));

	private final WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
	private final WebElement LastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));

	private final WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));

	private final WebElement Phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));

	private final WebElement Address1 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));

	private final WebElement Address2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));

	private final WebElement CityField = driver.findElement(By.xpath("//*[@id=\"city\"]"));

	private final Select State = new Select(driver.findElement(By.xpath("//*[@id=\"st\"]")));

	private final WebElement ZipCode = driver.findElement(By.xpath("//*[@id=\"zip\"]"));

	private final WebElement ExstingCutomerradioBtn = driver
			.findElement(By.xpath("//*[@id=\"fields\"]/div[6]/div[2]/div[2]"));
	private final WebElement TextArea = driver.findElement(By.xpath("//*[@id=\"message\"]"));
	private final WebElement SendMessage = driver.findElement(By.xpath("//*[@id=\"send_btn\"]"));

	private final WebElement contactUsBtn = driver
			.findElement(By.xpath("//*[@id=\"desktop-topnav\"]/li[6]/ul/li[6]/a"));

	private final WebElement errorMsg = driver.findElement(By.xpath("//*[@class='error-message']/strong"));

	private final WebElement successMsg = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div[1]/div[4]/strong"));

	public void waitFor() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public boolean clickContactUS() {

		waitFor();
		try {
			WebElement ContactUsDropdown = driver.findElement(By.xpath("//*[@id=\"desktop-topnav\"]/li[6]/ul/li[6]/a"));
			ContactUsDropdown.click();

			return true;
		} catch (Exception e) {
			return false;

		}

	}

	public boolean contactUsLink() {

		try {
			waitFor();

			contactUsBtn.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}

	public boolean fillIncompleteForm(String fName, String lName, String email, String phone) {

		waitFor();

		try {

			FirstName.sendKeys(fName);
			LastName.sendKeys(lName);
			Email.sendKeys(email);
			Phone.sendKeys(phone);
			SendMessage.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}

	public String InvalidError() {

		waitFor();

		try {
			Thread.sleep(4000);

			String error = errorMsg.getText();
			return error;
		} catch (Exception e) {
			// TODO: handle exception

			return null;
		}

	}

	public boolean fillCompleteForm(String fName, String lName, String email, String phone, String address, String city,
			String textArea, String zip) {

		waitFor();

		try {

			FirstName.sendKeys(fName);
			LastName.sendKeys(lName);
			Email.sendKeys(email);
			Phone.sendKeys(phone);
			Address1.sendKeys(address);
			ZipCode.sendKeys(zip);
			CityField.sendKeys(city);
			TextArea.sendKeys(textArea);

			SendMessage.click();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception

			return false;
		}

	}

	public String verifySucessMsg() throws Exception {

		try {
			Thread.sleep(4000);
			String myMsg = successMsg.getText();
			System.out.println("msg is " + myMsg);
		    return myMsg;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

}