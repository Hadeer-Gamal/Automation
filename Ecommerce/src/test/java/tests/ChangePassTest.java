package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class ChangePassTest extends TestBase{
	
	Home homeObject;
	MyAccountPage MyAccountPageObject;
	UserRegistrationPage RegisterObject;
	LoginPage loginObject;
	String Email="bogy123@gmail.com";
	String oldpass="123456";
	String newpass="12345678" ;
	

	@Test(priority=1)
	public void UserRegisterSuccessfully()
	{
		homeObject=new Home(driver);
		homeObject.openRegistrationPage();
		RegisterObject=new UserRegistrationPage(driver);
		RegisterObject.MandatoryFields("Hadeer","Gamal",Email,oldpass,oldpass);
		RegisterObject.Register();
		Assert.assertTrue(RegisterObject.successmessage.getText().contains("completed"));
		
	}
	
	
	@Test (dependsOnMethods = ("UserRegisterSuccessfully"))
	public void changePass()
	{
		MyAccountPageObject=new MyAccountPage(driver);
		homeObject.OpenMyAccountPage();
		MyAccountPageObject.changepassword(oldpass,newpass);
	}
	
	@Test(dependsOnMethods = ("changePass"))
	public void RegisteredUserCanLogout()
	{
		RegisterObject=new UserRegistrationPage(driver);
		RegisterObject.logout();
		
	}
	
	@Test(dependsOnMethods = ("RegisteredUserCanLogout"))
	public void RegisteredUserCanLogin()
	{
		
		RegisterObject=new UserRegistrationPage(driver);
		loginObject=new LoginPage(driver);
		homeObject.openLoginPage();
		loginObject.userlogin(Email,newpass);
		Assert.assertTrue(RegisterObject.logoutlink.isDisplayed());
	}

}
