package com.finance.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.finance.BaseTest.TestBase;
import com.finance.PageObjects.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginPage; 
	
	public LoginTest() {
		
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		
		initialization();
		loginPage=new LoginPage();
		
		
	}
	
	@Test
	
	public void VerifyPageURLTest() {
		
		String expected="Autoportal Finance";
		String actual=loginPage.GetLoginPageURL();
		Assert.assertEquals(actual, expected);
		
		
	}
	
	@Test
	public void SuccessfullLoginTest() {
		
		loginPage.LoginintoApp(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}

}
