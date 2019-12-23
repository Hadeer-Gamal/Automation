package tests;

import org.testng.annotations.Test;
import org.json.simple.parser.ParseException;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;


import data.jsonReader;


import pages.Home;

import pages.UserRegistrationPage;

public class UserRegistrationTestDDTAndJasonFiles extends TestBase{
	Home homeObject;
	UserRegistrationPage RegisterObject;
	jsonReader reader;
	
	
	@Test(priority=1)
	public void UserRegisterSuccessfully() throws FileNotFoundException, IOException, ParseException
	{
		reader=new jsonReader();
		reader.jsondataReader();
		homeObject=new Home(driver);
		homeObject.openRegistrationPage();
		RegisterObject=new UserRegistrationPage(driver);
	//	RegisterObject.MandatoryFields(reader.);
		RegisterObject.Register();
		AssertJUnit.assertTrue(RegisterObject.successmessage.getText().contains("completed"));
		RegisterObject.logout();
	}
	
	

}
;