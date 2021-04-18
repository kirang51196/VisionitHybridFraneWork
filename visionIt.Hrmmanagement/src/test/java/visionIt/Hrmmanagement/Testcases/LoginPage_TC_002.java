package visionIt.Hrmmanagement.Testcases;

import org.testng.annotations.Test;

import visionIt.Hrmmanagement.TestBase.TestBase;
import visionIt.Hrmmanagement.pageObjects.LoginPage;

public class LoginPage_TC_002 extends TestBase{
	

	  @Test(priority=1)
	  public void loginTest001() {
	   LoginPage login = new LoginPage(driver) ;
		  login.setUsername("Admin");
		  login.setPassword("admin123");
		  login.clickOnLogin();
	  }
	  
	  
	  @Test(priority=2)
	  public void loginTest002() {
	   LoginPage login = new LoginPage(driver) ;
		  login.setUsername("Admin12");
		  login.setPassword("admin123$");
		  login.clickOnLogin();
	  }
	  
}
