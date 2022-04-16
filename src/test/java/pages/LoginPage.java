package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ConstantValue;

public class LoginPage {
	WebDriver driver;
	
	public static final By usernameBox=By.id("username");
	public static final By passwordBox=By.id("password");
	public static final By signinBtn=By.id("btn-submit");
	
	public static final By signupBtn=By.id("sign-up-button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click_signUp() {
		driver.findElement(signupBtn).click();
	}
	
	public void signIn(String userName, String passWord) throws InterruptedException {
		driver.findElement(usernameBox).sendKeys(userName);
		driver.findElement(passwordBox).sendKeys(passWord);		
		driver.findElement(signinBtn).click();
	}

}
