package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadData {
	public static Properties userdata=LoadData(System.getProperty("user.dir")+"\\src\\main\\java\\properties\\userdata.properties");

	public static Properties LoadData(String path) {
		Properties pro=new Properties();
		FileInputStream stream;
		try {
			stream = new FileInputStream(path);
			pro.load(stream);
		} 
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
		}
		
		return pro;
	}
	
	
}
