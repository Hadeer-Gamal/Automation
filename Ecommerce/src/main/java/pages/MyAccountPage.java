package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(linkText="Change password")
	WebElement changePasswordLink;
	
	@FindBy(id="OldPassword")
	WebElement oldPassTxt;
	
	@FindBy(id="NewPassword")
	WebElement newPassTxt;
	
	@FindBy(id="ConfirmNewPassword")
	WebElement confnewPasstxt;
	
	@FindBy(css="input.button-1.change-password-button")
	WebElement changePasswordbtn;
	
	@FindBy(css="div.result")
	public WebElement changePassresult;
	
	public void changepassword(String opass, String newpass)
	{
		clickbtn(changePasswordLink);
		InputSendKey(oldPassTxt,opass);
		InputSendKey(newPassTxt, newpass);
		InputSendKey(confnewPasstxt,newpass);
		clickbtn(changePasswordbtn);
	}
	

}
