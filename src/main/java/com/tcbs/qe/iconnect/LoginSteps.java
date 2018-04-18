package com.tcbs.qe.iconnect;

public class LoginSteps extends LoginPage {
	public void login () {
		txtUsername.sendKeys("105C300486");
		txtPassword.sendKeys("abc123");
		btnLogin.click();
	}
}
