package tests;

import org.testng.annotations.Test;

import data.LoadData;

import org.testng.Assert;

import pages.Home;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestwithDDAndFileProperties extends TestBase{
	Home homeObject;
	UserRegistrationPage RegisterObject;
	LoginPage loginObject;
	
	
	String fname=LoadData.userdata.getProperty("firstname");
	String lname=LoadData.userdata.getProperty("lastname");
	String email=LoadData.userdata.getProperty("email");
   String password=LoadData.userdata.getProperty("password");
	
	@Test(priority=1,alwaysRun=true)
	public void UserRegisterSuccessfully() throws InterruptedException
	{
		homeObject=new Home(driver);
		homeObject.openRegistrationPage();
		RegisterObject=new UserRegistrationPage(driver);
		RegisterObject.MandatoryFields(fname,lname,email,password,password);
		RegisterObject.Register();
		Assert.assertTrue(RegisterObject.successmessage.getText().contains("Your registration completed"));
		RegisterObject.logout();
		Thread.sleep(10000);
	}
	
}
