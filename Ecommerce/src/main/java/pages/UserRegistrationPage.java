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
	/*
	@FindBy(name="DateOfBirthDay")
	WebElement DayOfBirth;
	Select Day=new Select(DayOfBirth);
	
	@FindBy(name="DateOfBirthMonth")
	WebElement MonOfBirth;
	Select Month=new Select(MonOfBirth);
	
	@FindBy(name="DateOfBirthYear")
	WebElement YearOfBirth;
	Select year=new Select(YearOfBirth);*/
	
	@FindBy(id="Email")
	WebElement Email;
/*	
	@FindBy(id="Company")
	WebElement Companyname;
	
	@FindBy(id="Newsletter")
	WebElement newsletter;*/
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id="register-button")
	WebElement Registerbtn;
	
	@FindBy(css="div.result")
	public WebElement successmessage;
	
	@FindBy(css="a.ico-logout")
	public WebElement logoutlink;
	
	
	
	public void MandatoryFields(String Fname,String Lname, String mail, String pass, String cpass) {
		
		clickbtn(gender);
		InputSendKey(FirstName, Fname);
	    InputSendKey(LastName, Lname);
		InputSendKey(Email, mail);
		InputSendKey(password, pass);
		InputSendKey(confirmPassword, cpass);
		
	}
	
	
	public void Register()
	{
		clickbtn(Registerbtn);
	}
	
	public void logout()
	{
		clickbtn(logoutlink);
	}
	
	

}
