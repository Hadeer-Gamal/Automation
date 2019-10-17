package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	static public WebDriver driver;
	
	// Create Constructor paramaterized "take web driver as parameter"
	public PageBase(WebDriver driver) {
	    this.driver=driver;
	    
	 //   PageFactory.initElements(driver, this);
	}; 

}
