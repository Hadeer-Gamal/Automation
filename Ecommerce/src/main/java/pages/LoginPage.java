package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="Email")
	WebElement Emailtxt;
	
	@FindBy(id="Password")
	WebElement passtxt;
	
	@FindBy(css="input.button-1.login-button")
	 WebElement Loginbtn;
	
	public void userlogin(String mail,String pass)
	{
		InputSendKey(Emailtxt,mail);
		InputSendKey(passtxt,pass);
		clickbtn(Loginbtn);
	}
	
	
	

}
