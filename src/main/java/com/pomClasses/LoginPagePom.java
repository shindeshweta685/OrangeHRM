package com.pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePom {

	@FindBy(xpath ="//p[text()='Username : Admin']")
	private WebElement usernameText;
	
	@FindBy(xpath ="//p[text()='Password : admin123']")
	private WebElement passwordText;
	
	@FindBy(xpath ="//input[@name='username']")
	private WebElement usernameText2;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordText2;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitText;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-forgot']//child:p")
	private WebElement forgotText;
	
	
}
