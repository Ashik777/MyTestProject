package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectclasses.HomePage;
import pageobjectclasses.LoginPageClass;
import utilities.DataProviders;

public class LoginTestCase extends BaseTestClass {
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void loginTestCase(String uname, String pwd, String exp)
	{
		LoginPageClass login = new LoginPageClass(driver);
		login.enterUsername(uname);
		login.enterPassword(pwd);
		login.clickSubmit();
		HomePage hp= new HomePage(driver);
	boolean status1=hp.checkloginstatusText();
		if(exp.equalsIgnoreCase("Valid"))
				{
			     Assert.assertTrue(status1);
			if(status1==true)
			{
			hp.clickLogout();
			}
		}
		else if(exp.equalsIgnoreCase("Invalid"))
		{
			Assert.assertFalse(status1);
		}
	}

}