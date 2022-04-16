package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public static final By user_link=By.id("anchor-login");
	
	public void logout() {
		driver.findElement(user_link).click();		
	}

}
