package visionIt.Hrmmanagement.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageDemo {

	WebDriver driver = null;
	//Webelement repository  at page level
	
		@FindBy(id="txtUsername")
	    WebElement username_txt;
		
		@FindBy(id="txtPassword")
		WebElement password_txt;
		
		
		@FindBy(id="btnLogin")
		WebElement loginbtn;
		
		//constructor
		public LoginPageDemo(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
//		public void loghinOrangeHrm() {
//			
//			username_txt.sendKeys("Admin");
//			password_txt.sendKeys("admin123");
//			loginbtn.click();
//			
			public  void loghinOrangeHrm(String uname,String upass) {
				
			username_txt.sendKeys(uname);
		    password_txt.sendKeys(upass);
			loginbtn.click();
			

}
}