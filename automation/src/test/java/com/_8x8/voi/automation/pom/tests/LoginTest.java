package com._8x8.voi.automation.pom.tests;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com._8x8.voi.automation.pom.driver.BaseClass;
import com._8x8.voi.automation.pom.pages.LoginPage;

 

public class LoginTest extends BaseClass {
	
	@BeforeTest(enabled=true)
	public void startWebdriverSession()
	{ 
		startSession();
	}
	
	@AfterTest(enabled=true)
	public void stopWebdriverSession()
	{ 
		stopSession();
	}
	
	
	
	@Test 
	  public void On_LoginPage_8X8Logo_Should_Present() throws Exception {  		
		LoginPage loginP = new LoginPage(driver);
		loginP.getCompanyLogoCount();		
		Assert.assertTrue(loginP.getCompanyLogoCount()>=1, "Multiple / No Logo Found");	 
	  }
	
}
