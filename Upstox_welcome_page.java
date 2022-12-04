//welcome page

package POM_DDF_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_welcome_page
{
	
	@FindBy(xpath="//div[text()='No, I’m good']") private WebElement welcomepage;
	
	public Upstox_welcome_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Upstoxwelcomepage()
	{
		welcomepage.click();
	}
	

}
