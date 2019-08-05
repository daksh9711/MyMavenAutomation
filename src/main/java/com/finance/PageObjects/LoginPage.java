package com.finance.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finance.BaseTest.TestBase;

public class LoginPage extends TestBase {
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}

	
	
	@FindBy(name="email") 
	WebElement EmailField;
	
	@FindBy(name="password") 
	WebElement PasswordField;
	@FindBy(xpath="//button[contains(text(),'Login')]") 
	WebElement LoginBtn;
	
	public String GetLoginPageURL() {
		
		return driver.getTitle();
	}
	
	public void LoginintoApp(String EmailField,String PasswordField) {
		
		this.EmailField.sendKeys(EmailField);
		this.PasswordField.sendKeys(PasswordField);
		LoginBtn.click();
		
	}
}
