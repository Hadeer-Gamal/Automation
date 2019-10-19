package utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hepler {
	
	//method that take screenshot from the failed test case w bta5od 7agten webdriver and string screenshotname
	// screenshotname will be with the name of failed method
	
	public static void CaptureScreenshot(WebDriver driver, String screenshotName)
	{
		// h2olo l path l ht7ot foh l screenshot , w l name bta3 screenshot.png
		
		Path destination=Paths.get("./screenshots",screenshotName+".png");
		try {
			//h3ml directory ll path dh 
			Files.createDirectories(destination.getParent());
			// file output stream bl path bs b3mlo to string 34an bia5od l path string
			FileOutputStream out=new FileOutputStream(destination.toString());
			// b2ol ll driver 5od screenshot
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			out.close();
			
			
			
		} catch (IOException e) {
			System.out.println("exception while taking screenshot");
		}
	}

}
