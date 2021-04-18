package visionIt.Hrmmanagement.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
 public  WebDriver driver = null;
 
    @FindBy(id="menu_admin_viewAdminModule")
    @CacheLookup
    WebElement Admin;
    
    @FindBy(id="menu_admin_UserManagement")
    @CacheLookup
    WebElement UserMangement;
    
    @FindBy(id="menu_admin_viewSystemUsers")
    @CacheLookup
    WebElement User;
    
    
     public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
     
     
	public AddUserPage navigateToaddUserPage() {
    	 
    	Actions action = new Actions(driver);
    	//when more than one actions then perform build.perform
    	action.moveToElement(Admin).moveToElement(UserMangement).moveToElement(User).click().build().perform();
    	return new AddUserPage(driver);
     }

}
