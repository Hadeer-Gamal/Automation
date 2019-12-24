package tests;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.*;

import data.JasonDataReader;
import pages.Home;
import pages.UserRegistrationPage;

public class UserRegistrationTestDDTANDJason extends TestBase{
	Home homeObject;
	UserRegistrationPage RegisterObject;
	
	
	@Test(priority=1)
	public void UserRegisterSuccessfully() throws FileNotFoundException, IOException, ParseException
	{
		JasonDataReader jsonReader=new JasonDataReader();
		jsonReader.JasonReader();
		homeObject=new Home(driver);
		homeObject.openRegistrationPage();
		RegisterObject=new UserRegistrationPage(driver);
		RegisterObject.MandatoryFields(jsonReader.firstname,jsonReader.lastname,jsonReader.email,jsonReader.password,jsonReader.password);
		RegisterObject.Register();
		Assert.assertTrue(RegisterObject.successmessage.getText().contains("completed"));
		RegisterObject.logout();
	}
	
	
}
