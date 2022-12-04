//Login1

package POM_DDF_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox_Login1
{
	WebDriver driver;
   @FindBy(xpath="//input[@id='userCode']") private WebElement UN;
   @FindBy(xpath="//input[@id='password']") private WebElement PW;
   @FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement Login;

   //constructor
    public upstox_Login1(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    //methods
    
    public void Input_username(String Uname)
    {
    	UN.sendKeys(Uname);
    }
    
    public void Input_Password(String Upassword)
    {
    	PW.sendKeys(Upassword);
    }
    
    public void Click_loginbutton()
    {
    	Login.click();
    }

}
