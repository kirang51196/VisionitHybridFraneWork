package visionIt.Hrmmanagement.Testcases;

import org.testng.annotations.Test;

import visionIt.Hrmmanagement.TestBase.TestBase;
import visionIt.Hrmmanagement.pageObjects.LoginPage;
import visionIt.Hrmmanagement.pageObjects.LoginPageDemo;

public class config_TC_003 extends TestBase {
   @Test
   
   public void loginTest() {
   LoginPage login = new LoginPage(driver) ;
   login.setUsername(configdata.getUsername());
   login.setPassword(configdata.getPassword());
   login.clickOnLogin();
}
} 

