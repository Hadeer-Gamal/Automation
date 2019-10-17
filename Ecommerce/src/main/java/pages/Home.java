package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home extends PageBase {
	
	
	public Home(WebDriver driver) 
	{
		super(driver);
	}
	//by pageFactory 
		/*@FindBy(linkText="Register")
		 WebElement registerLink;
		 */
	
	
	//method that click on link 
	public void openRegistrationPage()
	{
		registerLink.click();
	}
	
}
