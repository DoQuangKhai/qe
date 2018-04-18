package com.tcbs.qe.iconnect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	@FindBy (id = "username UID")
	private WebElement txtUsername;
	
	@FindBy (id = "password")
	private WebElement txtPassword;
	
	@FindBy (name = "submit")
	private WebElement btnLogin;
	
	@FindBy (xpath = "//*[@id=\"custom-login\"]/div[3]/button")
	private WebElement btnRegister;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnRegister() {
		return btnRegister;
	}

}
