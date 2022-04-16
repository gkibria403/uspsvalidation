package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;
	
	//step 1
	public static final By selectLanguage=By.id("slanguage");
	public static final By usernameBox=By.id("tuserName");
	
	//step 2
	public static final By passwordBox=By.id("tPassword");
	public static final By passwordBoxRetype=By.id("tPasswordRetype");
	
	//choose first security question and answer
	public static final By selFirstSecurityQues=By.id("ssec1");
	public static final By ansFirstQuesBox=By.id("tsecAnswer1");
	public static final By ansFirstQuesBoxRetype=By.id("tsecAnswer1Match");
	
	//choose second security question and answer
	public static final By selSecondSecurityQues=By.id("ssec2");
	public static final By ansSecondQuesBox=By.id("tsecAnswer2");
	public static final By ansSecondQuesBoxRetype=By.id("tsecAnswer2Match");
	
	//step 3
	public static final By selPersonalTypeAccountRadio=By.id("for-rAccount1");
	public static final By selBusinessTypeAccountRadio=By.id("for-rAccount2");
	
	//step 4
	public static final By selTitle=By.id("stitle");
	public static final By firstNameBox=By.id("tfName");
	public static final By middleInitialBox=By.id("tmI");
	public static final By lastNameBox=By.id("tlName");
	public static final By suffixName=By.id("ssufix");
	public static final By emailBox=By.id("temail");
	public static final By emailBoxRetype=By.id("temailRetype");
	public static final By selPhoneType=By.id("sphoneType");
	public static final By phoneNumberBox=By.id("tphone");
	public static final By phoneExtBox=By.id("text");
	public static final By phoneMobileBox=By.id("tmobile");
	
	//can usps contact you?
	public static final By uspsCanContactCheck=By.xpath("//*[@id='contact-section']/div[3]/div[5]/label");
	public static final By uspsPartnerCanContactCheck=By.xpath("//*[@id='contact-section']/div[3]/div[6]/label");
	
	//step 5
	public static final By selCountry=By.id("scountry");
	public static final By streetAddressBox=By.id("taddress"); // for default, United States
	
	public static final By addressLineBox1=By.id("taddress1"); //
	public static final By addressLineBox2=By.id("taddress2"); // For other country, Canada
	public static final By addressLineBox3=By.id("taddress3"); //
	
	public static final By aptSuiteOtherBox=By.id("tapt");
	public static final By cityBox=By.id("tcity"); // for United States
	public static final By cityIntBox=By.id("tcityInt");
	
	public static final By selState=By.id("sstate"); //if country is default, United States
	public static final By provinceBox=By.id("tprovince"); //if country is Canada
	
	public static final By zipCodeBox=By.id("tzip");
	public static final By postalcode=By.id("tpostalCode");
	
	public static final By verifyAddressBtn=By.id("a-address-step1");
	
	public static final By createAccountBtn=By.id("btn-submit");
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createAccount() {
		
		//step 1
		Select lSelect=new Select(driver.findElement(selectLanguage));
		lSelect.selectByVisibleText("English");
		
		driver.findElement(usernameBox).sendKeys("user2000");
		
		//step 2
		driver.findElement(passwordBox).sendKeys("Password2000");
		driver.findElement(passwordBoxRetype).sendKeys("Password2000");
		
		Select fquestion=new Select(driver.findElement(selFirstSecurityQues));
		fquestion.selectByVisibleText("What is your favorite food to eat?");
		driver.findElement(ansFirstQuesBox).sendKeys("Rice");
		driver.findElement(ansFirstQuesBoxRetype).sendKeys("Rice");
				
		Select secquestion=new Select(driver.findElement(selSecondSecurityQues));
		secquestion.selectByVisibleText("What is your favorite sport?");
		driver.findElement(ansSecondQuesBox).sendKeys("Cricket");
		driver.findElement(ansSecondQuesBoxRetype).sendKeys("Cricket");
		
		//step 3
		driver.findElement(selPersonalTypeAccountRadio).click();
		
		//step 4
		Select selectTitle = new Select(driver.findElement(selTitle));
		selectTitle.selectByVisibleText("Mr");
		
		driver.findElement(firstNameBox).sendKeys("Golam");
		driver.findElement(lastNameBox).sendKeys("Kibria");
		
		driver.findElement(emailBox).sendKeys("gkibria403@gmail.com");
		driver.findElement(emailBoxRetype).sendKeys("gkibria403@gmail.com");
		
		Select phoneType=new Select(driver.findElement(selPhoneType));
		phoneType.selectByVisibleText("Intl.");
		driver.findElement(phoneNumberBox).sendKeys("4034024376");
		
		//step 5
		Select country=new Select(driver.findElement(selCountry));
		country.selectByVisibleText("CANADA");
		
		//driver.findElement(streetAddressBox).sendKeys("16 Auburn Bay Link SE"); //for United States
		driver.findElement(addressLineBox1).sendKeys("16 Auburn Bay Link SE");
				
		//driver.findElement(aptSuiteOtherBox).sendKeys("202"); // for United States
		
		//driver.findElement(cityBox).sendKeys("Calgary");
		driver.findElement(cityIntBox).sendKeys("Calgary");
		
		driver.findElement(provinceBox).sendKeys("Alberta");
		
		driver.findElement(postalcode).sendKeys("1X1 2X2");
		
		//driver.findElement(verifyAddressBtn).click();	
		
		//driver.findElement(createAccountBtn).click();
		
	}

}
