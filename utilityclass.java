//utility class


//utilityclass 
package POM_DDF_Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;


public class utilityclass 
{
	public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("E:\\velocity _testing course\\Data Driven framework\\POM_with_DDF.xlsx");
		org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	    String value=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
		
		
		//FileInputStream file=new FileInputStream("E:\\velocity _testing course\\data.xlsx");
		//Sheet sh=(Sheet) WorkbookFactory.create(file).getSheet("Sheet2");
		//String value=  ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		//return value;
		
	}
	
	public static String getpropertyfiledata(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_16th_july_ATCH\\propertyfile.properties");
		Properties p1=new Properties();
		p1.load(file);
		String value = p1.getProperty(key);
		return value;
	}
	
	
	public static String getTD(String string) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
