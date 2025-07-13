package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Account_Page extends BasePage
{

	public My_Account_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[\"@id=content\"]/div/h2[1]")
	WebElement cofmsg;
	
	public boolean isMyaccountexist()
	{
		try {
		return (cofmsg.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	@FindBy(xpath="//*[@id='column-right']/div/a[14]")
	WebElement buttonLogout;
	
	public void clickLogout()
	{
		buttonLogout.click();
	}
	
	
	

}
