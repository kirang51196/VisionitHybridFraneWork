package visionIt.Hrmmanagement.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	public WebDriver driver = null;
	
	//Webelement repository  at page level
	
		@FindBy(id="txtUsername")
	    WebElement username_txt;
		
		@FindBy(id="txtPassword")
		WebElement password_txt;
		
		
		@FindBy(id="btnLogin")
		WebElement loginbtn;
		
		public LoginPage(WebDriver driver) {
			// this.localvar = clsvar
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		
		public void  setUsername(String username) {
			username_txt.clear();
			username_txt.sendKeys(username);	
		}
		
		public void setPassword(String password) {
			password_txt.clear();
			password_txt.sendKeys(password);	
		}
		
		public void  clickOnLogin() {
			loginbtn.click();	
			
			//boolean status = driver.getPageSource().contains("LOGIN Panel");
			//System.out.println(status);
		
		

//		if ( driver.getPageSource().contains("LOGIN Panel")) {
//			Assert.assertTrue(false, "Tc failed expected LOGIN Panel in the source page but not Found");
//		}
//		
//		else if(driver.findElement(By.xpath("//a[@id='menu__Performance']/b")).isDisplayed()) {
//		
//			Assert.assertTrue(true);
//		}
		
		
		}
		
	}
	


