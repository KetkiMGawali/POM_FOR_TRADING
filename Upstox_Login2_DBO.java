//Upstox DOB

package POM_DDF_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Login2_DBO 
{
	@FindBy(xpath="//input[@id='yob']") private WebElement DOB;
	
	public Upstox_Login2_DBO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void upstox_insert_DOB(String Date_of_birth)
	{
		DOB.sendKeys(Date_of_birth);
	}
	

}
