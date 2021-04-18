package visionIt.Hrmmanagement.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import visionIt.Hrmmanagement.Utility.ConfigdataProvider;
import visionIt.Hrmmanagement.Utility.ExceldataDataProvider;

public class TestBase {
	public static WebDriver driver = null;
	public ConfigdataProvider configdata = null;
	public ExceldataDataProvider exceldata;
	
	@BeforeSuite
	public void setUp() {
		configdata=new ConfigdataProvider();
		exceldata = new ExceldataDataProvider();
		
	}
	
	@BeforeMethod
	@Parameters("browser") 
	public void setUp(@Optional("chrome") String browser) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
			else if(browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
		
			else if(browser.equals("ie")) {
				System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get(configdata.getAppUrl());
    }
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
	Thread.sleep(5000);	
		driver.quit();
		

}
}
