package visionIt.Hrmmanagement.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigdataProvider {
   public WebDriver driver = null;
	public Properties prop=null;
	public ConfigdataProvider() {
	try {
		
		File fs = new File("./ConfigFile/config.properties");
		FileInputStream fins = new FileInputStream(fs);
		prop =new Properties();
		prop.load(fins);
	} 
	
	catch (Exception e) {
		e.printStackTrace();
	}
	
	}
	
	
	public String getkeyValue(String searchkey) {
		return prop.getProperty(searchkey);
		
	}
	
	public String getBrowser(String browsername) {
		return prop.getProperty(browsername);
		
	}
	public String getAppUrl() {
		return prop.getProperty("url");
	}
	
	
	public String getUsername() {
		return prop.getProperty("user");
	}
	
	public String getPassword() {
		return prop.getProperty("pass");
	}
	
	
}
