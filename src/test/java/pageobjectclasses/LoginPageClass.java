package pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageClass extends BasePage {

	public LoginPageClass(WebDriver driver) {
		super(driver);
		
	}
	
	//Web elements on the login page
	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[@id='submit']") WebElement submit;
	
	
	public void enterUsername(String userNme)
	{
		username.sendKeys(userNme);
	}
	
	public void enterPassword(String passwd)
	{
		password.sendKeys(passwd);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}

}