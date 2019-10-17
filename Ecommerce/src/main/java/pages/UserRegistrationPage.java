package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class UserRegistrationPage extends PageBase{
//when inherit from class , you must have constructor in child class
	
	public UserRegistrationPage(WebDriver driver)
	{
		//It is used inside a sub-class method definition to call a method defined in the super class
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="gender-male")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement FirstName;
	
	@FindBy(id="LastName")
	WebElement LastName;
	
	@FindBy(id="Email")
	WebElement Email;
	
	
	
	

}
