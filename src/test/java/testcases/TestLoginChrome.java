package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import utilities.Log;

public class TestLoginChrome extends TestLogin{
	@BeforeMethod
	public void Setup() {
		Log.debug("Chrome browser is loading");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
	    driver=new ChromeDriver();	    
	    ManageProperties();
	}
}
