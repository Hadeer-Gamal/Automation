package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class jsonReader {
	String fname,lname,mail,pass;
	
	public void jsondataReader() throws FileNotFoundException, IOException, ParseException
	{
		String filepath=System.getProperty("user.dir")+"/src/test/java/data/userdata.json";
		File srcfile=new File(filepath);
		JSONParser parser=new JSONParser();
		JSONArray jsarr=(JSONArray)parser.parse(new FileReader(srcfile));
		for(Object jsobj:jsarr)
		{
			JSONObject person=(JSONObject) jsobj;
			fname=(String)person.get("firstname");
			System.out.println(fname);
			lname=(String)person.get("lastname");
			mail=(String)person.get("email");
			pass=(String)person.get("password");
			
		
	
		
		
	}
		
	

}}
