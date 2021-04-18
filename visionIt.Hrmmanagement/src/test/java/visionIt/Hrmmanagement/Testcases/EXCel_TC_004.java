package visionIt.Hrmmanagement.Testcases;

import org.testng.annotations.Test;

import visionIt.Hrmmanagement.TestBase.TestBase;
import visionIt.Hrmmanagement.pageObjects.LoginPage;

public class EXCel_TC_004 extends TestBase{
	@Test
	public void loginTC004() {
	LoginPage login = new LoginPage(driver) ;
	login.setUsername(exceldata.getStrinCellData("login", 1, 0));
	login.setPassword(exceldata.getStrinCellData("login", 1, 1));
     login.clickOnLogin();
}
	
	@Test
	public void loginTC005() {
	LoginPage login = new LoginPage(driver) ;
	login.setUsername(exceldata.getStrinCellData(0, 1, 0));
	login.setPassword(exceldata.getStrinCellData(1, 1, 1));
    login.clickOnLogin();

}
	}



