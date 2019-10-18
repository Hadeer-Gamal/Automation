package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class TestBase {
	
	// Driver Set up
	public static WebDriver driver;
	
	@BeforeSuite
	public void startDriver()
	{
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/macdrivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com");
		
	}
	
	
	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}

}
