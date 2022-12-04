
//Test Class
package POM_DDF_Testng;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_class extends BAseClass
{
	upstox_Login1 log1;
	Upstox_Login2_DBO log2;
	Upstox_welcome_page log3;
	Upstox_Homepage log4;
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		InnitializeBrowser();
		log1=new upstox_Login1(driver);
		log2=new Upstox_Login2_DBO(driver);
		log3=new Upstox_welcome_page(driver);
		log4=new Upstox_Homepage(driver);
	}
	
	@BeforeMethod
	public void loginintoapp() throws EncryptedDocumentException, IOException
	{
		log1.Input_username(utilityclass.getpropertyfiledata("UN"));
		log1.Input_Password(utilityclass.getpropertyfiledata("PW"));
		log1.Click_loginbutton();
		log2.upstox_insert_DOB(utilityclass.getpropertyfiledata("YOB"));
		//log2.upstox_insert_DOB(utilityclass.getTD(0, 2));
		log3.Upstoxwelcomepage();
		//log1.Input_username(utilityclass.getTD(0, 0));
		//log1.Input_Password(utilityclass.getTD(0, 1));
		//log1.Click_loginbutton();
		//log2.upstox_insert_DOB(utilityclass.getTD(0, 2));
		//log3.Upstoxwelcomepage();
	}
	
	@Test
	public void verifyid() throws EncryptedDocumentException, IOException
	{
		String actpn=log4.upstox_homepage();
		String expres=utilityclass.getTD(0, 3);
		Assert.assertEquals(actpn,expres,"Failed");
	}

	@AfterMethod
	public void logoutfromapp(ITestResult I1)
	{
		if(I1.getStatus()==ITestResult.FAILURE)
		{
		//	POM_DDF_Testng_with_common_path.utilityclass.
		}
	}

	@AfterClass
	public void CloseBrowser() {
		//driver.quit();
	}}


