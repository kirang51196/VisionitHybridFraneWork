package visionIt.Hrmmanagement.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import visionIt.Hrmmanagement.TestBase.TestBase;
import visionIt.Hrmmanagement.pageObjects.LoginPage;

public class DataProvider_TC_005  extends TestBase{
	
	@DataProvider
	public Object[][] getExcelData(){
		Object[][] data = exceldata.getExcelData("DD_Login");
		return data;
	}
	
	@Test(dataProvider = "getExcelData") 
		public void loginDataDriven_TC_005(String user, String pass) {
		LoginPage login = new LoginPage(driver) ;
		  login.setUsername(user);
		  login.setPassword(pass);
		  login.clickOnLogin();
	  }
			
		}
	


