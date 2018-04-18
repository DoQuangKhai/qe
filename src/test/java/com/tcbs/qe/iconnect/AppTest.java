package com.tcbs.qe.iconnect;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.tcbs.qe.iconnect.Base;
import com.tcbs.qe.iconnect.LoginSteps;

/**
 * Unit test for simple App.
 */
public class AppTest extends Base {
	LoginSteps loginPage;
	
	
	@BeforeMethod
	public void setupMethod() {
		loginPage = new LoginSteps(driver);
	}
	
	
	@Test
	public void testLogin() {
		loginPage.login();
	}
}
