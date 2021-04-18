package visionIt.Hrmmanagement.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import visionIt.Hrmmanagement.TestBase.TestBase;
import visionIt.Hrmmanagement.pageObjects.AddUserPage;
import visionIt.Hrmmanagement.pageObjects.HomePage;
import visionIt.Hrmmanagement.pageObjects.LoginPage;

public class AddUser_TC extends TestBase {
	
	@Test(dataProvider="getExcelData")
	
	public void addNewUseTestr(	String user_Role, String empName, String username, String status, String password, String confirmPassword ){
 
		LoginPage login = new LoginPage(driver);
		login.setUsername("Admin");
		login.setPassword("admin123");
		login.clickOnLogin();
		
		 HomePage homepage = new HomePage(driver);
		 
		AddUserPage adduser = homepage.navigateToaddUserPage();
		adduser.addNewUserTest(user_Role, empName, username, status, password, confirmPassword);//belongs to above addUserNewTest
	}
	
	
	@DataProvider
	public Object[][] getExcelData(){
		
		Object[][] data = exceldata.getExcelData("AdduserTest");
		return data;
		
	}
}
