package visionIt.Hrmmanagement.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import visionIt.Hrmmanagement.Utility.Helper;

public class AddUserPage {
	
	WebDriver driver;
	
	@FindBy(id="btnAdd")
    WebElement Addbtn;
    
    @FindBy(id="systemUser_userType")
    WebElement systemUserDD;
    
    @FindBy(id="systemUser_employeeName_empName")
    WebElement EmployeeName;
    
    @FindBy(id="systemUser_userName")
    WebElement systemUserName;
    
    @FindBy(id="systemUser_status")
    WebElement systemUserStatus;
    
    @FindBy(id="systemUser_password")
    WebElement systemPassword;
    
    @FindBy(id="systemUser_confirmPassword")
    WebElement ConfirmPassword;
    
    @FindBy(id="btnSave")
    WebElement SaveBtn;
    
    
   public AddUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    public void addNewUserTest(String selectRole,String employeName,String userName,String status,String password,String confirmPass) {
    	try {
    	Addbtn.click();
    	Helper.selectDropDownValue(systemUserDD, selectRole);
    	EmployeeName.sendKeys(employeName);
    	systemUserName.sendKeys(userName);
    	Helper.selectDropDownValue(systemUserStatus, status);
    	systemPassword.sendKeys(password);
    	ConfirmPassword.sendKeys(confirmPass);
    	SaveBtn.click();
    	
    	}
    	catch(Exception e) {
    		
    	}
    }

}
