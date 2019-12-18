package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.Home;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestwithDD extends TestBase{
	Home homeObject;
	UserRegistrationPage RegisterObject;
	LoginPage loginObject;
	/*
	String email="hadeer0223@gmail.com";
	String password="123456";
	*/
	
	@DataProvider(name="testdata")
	public static Object[][] ReadData() 
	{
		
		return new Object[][]
		{
			{"Hadeer","Gamal","bogy@162.com","1267899"},
			{"Mohamed","Ahmed","dod@156.com","1123112322"}
			
		};
	}
	
	@Test(priority=1,alwaysRun=true,dataProvider="testdata")
	public void UserRegisterSuccessfully(String fname,String lname, String email, String password) throws InterruptedException
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
	
/*	
	@Test(dependsOnMethods = ("RegisteredUserCanLogout"))
	public void RegisteredUserCanLogin()
	{
		loginObject=new LoginPage(driver);
		homeObject.openLoginPage();
		loginObject.userlogin(email,password);
		AssertJUnit.assertTrue(RegisterObject.logoutlink.isDisplayed());
	}
*/
}
