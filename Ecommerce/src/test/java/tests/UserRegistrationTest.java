package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.Home;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase{
	Home homeObject;
	UserRegistrationPage RegisterObject;
	LoginPage loginObject;
	String email="hadeer0223@gmail.com";
	String password="123456";
	
	
	@Test(priority=1)
	public void UserRegisterSuccessfully()
	{
		homeObject=new Home(driver);
		homeObject.openRegistrationPage();
		RegisterObject=new UserRegistrationPage(driver);
		RegisterObject.MandatoryFields("Hadeer","Gamal",email,password,password);
		RegisterObject.Register();
		Assert.assertTrue(RegisterObject.successmessage.getText().contains("completed"));
		RegisterObject.logout();
	}
	
	@Test(dependsOnMethods = ("UserRegisterSuccessfully"))
	public void RegisteredUserCanLogout()
	{
		
		
	}
	
	@Test(dependsOnMethods = ("RegisteredUserCanLogout"))
	public void RegisteredUserCanLogin()
	{
		loginObject=new LoginPage(driver);
		homeObject.openLoginPage();
		loginObject.userlogin(email,password);
		Assert.assertTrue(RegisterObject.logoutlink.isDisplayed());
	}

}
