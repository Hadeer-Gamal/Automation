package tests;

import org.testng.Assert;
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
		RegisterObject.MandatoryFields("Hadeer","Gamal","hadeer23@gmail.com", "123456", "123456");
		RegisterObject.Register();
		Assert.assertTrue(RegisterObject.successmessage.getText().contains("completed"));
		
	}

}
