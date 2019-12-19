package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;
import data.ExcelReader;
import pages.Home;

import pages.UserRegistrationPage;

public class UserRegistrationTestDDTAndExcelFile extends TestBase{
	Home homeObject;
	UserRegistrationPage RegisterObject;
	

	
	@DataProvider(name="UserData")
	public Object[][]getuserdata() throws IOException
	{
		ExcelReader er=new ExcelReader();
	
			return er.getExcelData();
	}
	
	@Test(priority=1,alwaysRun=true,dataProvider="UserData")
	public void UserRegisterSuccessfully(String fname,String lname,String email,String password) throws InterruptedException
	{
		homeObject=new Home(driver);
		homeObject.openRegistrationPage();
		RegisterObject=new UserRegistrationPage(driver);
		RegisterObject.MandatoryFields(fname,lname,email,password,password);
		RegisterObject.Register();
		AssertJUnit.assertTrue(RegisterObject.successmessage.getText().contains("completed"));
		Thread.sleep(1000);
		RegisterObject.logout();
		Thread.sleep(1000);
		
	}
	
	
	
}
