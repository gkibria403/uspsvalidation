package testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class TestCreateAccountFirefox extends TestCreateAccount {
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
	    driver=new FirefoxDriver();	    
	    ManageProperties();
	}

}
