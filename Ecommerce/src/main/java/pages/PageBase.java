package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;

public class PageBase {
	
	static public WebDriver driver;

	// Create Constructor paramaterized "take web driver as parameter"
	public PageBase(WebDriver driver) {
	  
	    
	  PageFactory.initElements(driver, this);
	}; 
//best practise is to refactor code by making methode for click and method for send keys
	
	static protected void clickbtn(WebElement button)
	{
		button.click();
	}
	
	static protected void InputSendKey(WebElement input, String value)
	{
		input.sendKeys(value);
	}
	
	
}
