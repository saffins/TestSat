package com.juicePlusTest.TS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.juicePlusTest.PO.ContactUsPO;
import com.juicePlusTest.PO.DriverMain;

public class ValidCompleteForm_Test extends DriverMain {

	@Test
	public void submitValidForm() {

		ContactUsPO contactUsPO = new ContactUsPO();
		Assert.assertEquals(contactUsPO.fillCompleteForm("satya", "swain", "satya@email.com", "91919191",
				"test address one", "texas", "test message", "3805"), true);

	}

	@Test
	public void verifyValidSuccessMsg() throws Exception {

		ContactUsPO contactUsPO = new ContactUsPO();

		contactUsPO.verifySucessMsg();

		System.out.println("success msg found is " + contactUsPO.verifySucessMsg());

		Assert.assertEquals(contactUsPO.verifySucessMsg(), "Thank you! We have received your message.");

	}

}
