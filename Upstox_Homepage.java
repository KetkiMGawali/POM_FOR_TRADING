//homepage 

package POM_DDF_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Homepage
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement hp;
	public Upstox_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String upstox_homepage()
	{
		String actres=hp.getText();
		return actres;
	}
	

}
