package tests;



import org.testng.Assert;
import org.testng.annotations.*;

import com.github.javafaker.Faker;

import pages.Home;
import pages.UserRegistrationPage;

public class UserRegistrationTestDDTAndJavaDataFaker extends TestBase{
	Home homeObject;
	UserRegistrationPage RegisterObject;
	Faker FakeData=new Faker();
	String fname=FakeData.name().firstName();
	String lname=FakeData.name().lastName();
	String email=FakeData.internet().emailAddress();
	String password=FakeData.number().digits(8).toString();

	
	
	@Test(priority=1)
	public void UserRegisterSuccessfully()
	{
		homeObject=new Home(driver);
		homeObject.openRegistrationPage();
		RegisterObject=new UserRegistrationPage(driver);
		RegisterObject.MandatoryFields(fname,lname,email,password,password);
		RegisterObject.Register();
		Assert.assertTrue(RegisterObject.successmessage.getText().contains("completed"));
		RegisterObject.logout();
	}


}
