package com.tcbs.qe.iconnect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	@FindBy (id = "username UID")
	WebElement txtUsername;
	
	@FindBy (id = "password")
	WebElement txtPassword;
	
	@FindBy (name = "submit")
	WebElement btnLogin;
	
	@FindBy (xpath = "//*[@id=\"custom-login\"]/div[3]/button")
	WebElement btnRegister;
}
