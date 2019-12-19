package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	//laz aft7 streamm input 34an 22dr a deal m3 l file bta3i
	
	static FileInputStream fis=null;
	
	public FileInputStream getFileInputstream() 
	{
		
		String filepath=System.getProperty("user.dir")+"/src/test/java/data/UserData.xlsx";
		File srcfile=new File(filepath);
		try {
			fis=new FileInputStream(srcfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error in file");
			System.exit(0);
		}
		return fis;
	}

	public Object[][] getExcelData() throws IOException
	{
		
		
		fis=getFileInputstream();
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Sheet= wb.getSheetAt(0);
		int TotalNumberOfRows=(Sheet.getLastRowNum())+1;
		int TotalNumberOfCol=4;
		String arrUserData[][]=new String[TotalNumberOfRows][TotalNumberOfCol];
		for(int i=0; i<TotalNumberOfRows;i++)
		{
			for(int j=0; j<TotalNumberOfCol;j++)
			{
				XSSFRow rw=Sheet.getRow(i);
				arrUserData[i][j]=rw.getCell(j).toString();
				
				
				
			}
		}
		
		wb.close();
		return arrUserData;
		
		
	}
}
