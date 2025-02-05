package pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h1[text()='Logged In Successfully']") WebElement loginstatustxt;
	@FindBy(xpath="//a[text()='Log out']") WebElement logout;
	
	public boolean checkloginstatusText()
	{
		boolean status=loginstatustxt.isDisplayed();
		return status;
	}

	public void clickLogout()
	{
		logout.click();
	}
}
