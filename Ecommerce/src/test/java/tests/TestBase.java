package tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import utilities.Hepler;

public class TestBase {

	// Driver Set up
	public static WebDriver driver;
	String DriverDriectory = System.getProperty("user.dir") + "/Drivers/macdrivers/";

	@BeforeSuite
	
	// Till The code to run on browser that is coming vi parameters in testng.xml file  
	@Parameters({ "browser" }) 
	public void startDriver(@Optional("chrome")String browsername) {
		
		
		// In case of each browser run according its corresponding driver 
		if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", DriverDriectory + "chromedriver");
			driver = new ChromeDriver();
		} 
		else if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", DriverDriectory + "geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com");
	}

	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}
	
	//take screenshot when test fail and put it in folder
	// w bta5od parameter mn interface mwgod fl testng hwa l bib2a shail l resuly
	@AfterMethod
	public void ScreenShotOnFailure(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("failed");
			Hepler.CaptureScreenshot(driver,result.getName());
			
		}
	}
	

}
