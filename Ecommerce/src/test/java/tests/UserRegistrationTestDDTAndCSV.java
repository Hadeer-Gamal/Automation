package tests;


import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.opencsv.CSVReader;

import pages.Home;
import pages.UserRegistrationPage;

public class UserRegistrationTestDDTAndCSV extends TestBase{
	Home homeObject;
	UserRegistrationPage RegisterObject;
	CSVReader reader;
	
	@Test(priority=1)
	public void UserRegisterSuccessfully() throws IOException
	{
		//get path of csv
		String csvpath=System.getProperty("user.dir")+"/src/test/java/data/userdata.csv";
		reader=new CSVReader(new FileReader(csvpath));
		String []csvcell;
		//whhile loop will be executed till the last value in the csv file
		while((csvcell=reader.readNext())!=null)
		{
 			String fname=csvcell[0];
 			String lname=csvcell[1];
 			String email=csvcell[2];
 			String password=csvcell[3];
		
		homeObject=new Home(driver);
		homeObject.openRegistrationPage();
		RegisterObject=new UserRegistrationPage(driver);
		RegisterObject.MandatoryFields(fname,lname,email,password,password);
		RegisterObject.Register();
		Assert.assertTrue(RegisterObject.successmessage.getText().contains("completed"));
		RegisterObject.logout();
		}
	}
	

		
		
	
	


}
