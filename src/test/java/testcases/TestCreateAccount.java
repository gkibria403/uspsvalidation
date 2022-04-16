package testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.LandingPageUsps;
import pages.LoginPage;
import pages.RegistrationPage;

public class TestCreateAccount {
	WebDriver driver;
	String driverPath=".\\src\\test\\resources\\drivers\\";
	
	@Test
	public void Registration() {
		driver.get(LandingPageUsps.url);
		
		LandingPageUsps landing=new LandingPageUsps(driver);
		landing.click_regis_signin();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.click_signUp();
		
		RegistrationPage regPage=new RegistrationPage(driver);
		regPage.createAccount();		
	}
	
	public void ManageProperties() {
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
