package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class PageBase {
	
	static public WebDriver driver;
	WebElement registerLink=driver.findElement(By.linkText("Register"));
	
	// Create Constructor paramaterized "take web driver as parameter"
	public PageBase(WebDriver driver) {
	    this.driver=driver;
	    
	 //   PageFactory.initElements(driver, this);
	}; 

}
