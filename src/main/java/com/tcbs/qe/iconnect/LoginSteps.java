package com.tcbs.qe.iconnect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.tcbs.qe.iconnect.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
	LoginPage objLoginPage = new LoginPage();
	
	
    public LoginSteps(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, objLoginPage);
    }

	
	public LoginSteps login () {
		objLoginPage.getTxtUsername().sendKeys("105C300486");
		objLoginPage.getTxtPassword().sendKeys("abc123");
		objLoginPage.getBtnLogin().click();
		return this;
	}
}
