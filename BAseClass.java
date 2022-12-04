
//BAse class
package POM_DDF_Testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BAseClass 
{
	WebDriver driver;
	public void InnitializeBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\velocity _testing course\\Selenium_Tool\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver =new ChromeDriver();
	//	driver.get("https://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(utilityclass.getpropertyfiledata("URL"));
	}
	

}

