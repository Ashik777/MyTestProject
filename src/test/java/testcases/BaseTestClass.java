package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class BaseTestClass {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setUP(String br)
	{
		if(br.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
