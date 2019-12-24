package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JasonDataReader {
	
	public String firstname,lastname,email,password;
	
	public void JasonReader() throws FileNotFoundException, IOException, ParseException
	{
		
		String filepath=System.getProperty("user.dir")+"/src/test/java/data/userdata.json";
		File srcfile=new File(filepath);
		JSONParser parser=new JSONParser();
		JSONArray jarray=(JSONArray)parser.parse(new FileReader(srcfile));
		
		for(Object jsonObj:jarray)
		{
			JSONObject person=(JSONObject)jsonObj;
			firstname=(String)person.get("firstname");
			lastname=(String)person.get("lastname");
			email=(String)person.get("email");
			password=(String)person.get("password");
			
			
		}
		
		
	}
}
