package com.juicePlusTest.TS;

import org.testng.annotations.Test;

import com.juicePlusTest.PO.ContactUsPO;
import com.juicePlusTest.PO.DriverMain;

import junit.framework.Assert;

public class InvalidIncompleteForm_Test extends DriverMain {

	@Test
	public void submitInvalidForm() {

		ContactUsPO contactUsPO = new ContactUsPO();

		Assert.assertEquals(contactUsPO.fillIncompleteForm("satya", "swain", "satya@email.com", "9191919191"),true);

	}

	@Test
	public void verifyInvalidFormError() {

		ContactUsPO contactUsPO = new ContactUsPO();
		String errorText = contactUsPO.InvalidError();
		System.out.println("errr text found is " + errorText);
		Assert.assertEquals(errorText, "Thank you! We have received your message.");

	}

}
