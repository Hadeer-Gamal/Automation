package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageBase {
	
	
	public Home(WebDriver driver) 
	{
		super(driver);
	}
	//by pageFactory 
		@FindBy(linkText="Register")
		 WebElement registerLink;
		
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	
	@FindBy(linkText="My account")
	WebElement MyAccountLink;
		
	
	//method that click on link 
	public void openRegistrationPage()
	{
		clickbtn(registerLink);
	}
	
	public void openLoginPage()
	{
		clickbtn(LoginLink);
	}
	
	public void OpenMyAccountPage()
	{
		clickbtn(MyAccountLink);
	}
	
}
