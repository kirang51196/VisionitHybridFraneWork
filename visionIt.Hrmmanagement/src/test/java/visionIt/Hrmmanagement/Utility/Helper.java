package visionIt.Hrmmanagement.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	
	public static void selectDropDownValue(WebElement ele,String VisibleText) {
	
		new Select(ele).selectByVisibleText(VisibleText);
		
	}
	
    public static void selectDropDownValue(WebElement ele,int index) {
		
		new Select(ele).selectByIndex(index);
		
	}

    public static void selectDropDownValue(String value,WebElement ele) {
	
	new Select(ele).selectByValue(value);
	
}

}
