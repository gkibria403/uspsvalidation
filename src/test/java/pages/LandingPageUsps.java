package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageUsps {
	WebDriver driver;
	public static final String url="https://www.usps.com/";
	
	public static final By registration_signin=By.xpath("//*[@id='login-register-header']");
	
	public LandingPageUsps(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click_regis_signin() {
		driver.findElement(registration_signin).click();
	}

}
