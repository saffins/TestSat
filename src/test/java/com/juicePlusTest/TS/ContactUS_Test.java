package com.juicePlusTest.TS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.juicePlusTest.PO.AboutUsPO;
import com.juicePlusTest.PO.ContactUsPO;
import com.juicePlusTest.PO.DriverMain;

public class ContactUS_Test extends DriverMain{
	
	@Test
	public void tapAboutUS(){
		
		AboutUsPO aboutUsPO = new AboutUsPO();
		Assert.assertEquals(aboutUsPO.tapOnAboutUS(),true);
		
		   
	}
	
	
	public void tapContactUS(){
		
		ContactUsPO contactUsPO = new ContactUsPO();
		Assert.assertEquals(contactUsPO.clickContactUS(),true);
		
		   
	}
	

}
