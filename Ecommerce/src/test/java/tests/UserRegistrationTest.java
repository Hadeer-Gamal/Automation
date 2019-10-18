package tests;

import org.testng.annotations.*;

import pages.Home;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase{
	Home homeObject;
	UserRegistrationPage RegisterObject;
	
	
	@Test
	public void UserRegisterSuccessfully()
	{
		homeObject=new Home(driver);
		homeObject.openRegistrationPage();
		RegisterObject=new UserRegistrationPage(driver);
		RegisterObject.MandatoryFields("Hadeer","Gamal","hadeer@gmail.com", "123", "123");
		RegisterObject.Register();
	}

}
