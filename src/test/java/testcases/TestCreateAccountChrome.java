package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestCreateAccountChrome extends TestCreateAccount {
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
	    driver=new ChromeDriver();	    
	    ManageProperties();
	}
}
