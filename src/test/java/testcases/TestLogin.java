package testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.LandingPageUsps;
import pages.LoginPage;
import utilities.ConstantValue;
import utilities.Log;

public class TestLogin {
	WebDriver driver;
	String driverPath=".\\src\\test\\resources\\drivers\\";
	
	LoginPage loginpage;
	LandingPageUsps landing;
	
	@Test
	public void Testlogin() throws InterruptedException {
		Log.debug("Going to USPS HomePage");
		driver.get(LandingPageUsps.url);
		
		Log.debug("clicking Registration/Sign In Link");
		landing=new LandingPageUsps(driver);
		landing.click_regis_signin();
		
		Log.debug("Loading Login Page");
		loginpage=new LoginPage(driver);
		
		Log.debug("Trying to login with username: "+ConstantValue.username+" and "+"password: "+ConstantValue.password);
		loginpage.signIn(ConstantValue.username, ConstantValue.password);
		Log.debug("Login Successful But actually it is not, need to check title or element for this home page");		
	}
	
	
	public void ManageProperties() {
		Log.debug("Setting browser properties");
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void TerminateBrowser() {
		//driver.quit();
	}
}
