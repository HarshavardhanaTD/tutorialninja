package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_Page extends BasePage {

	public Logout_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[\"@id=content\"]/h1/i")
	WebElement cnfmsg;
	
	public boolean isLoggedOutMsgExist()
	{
		try {
		return(cnfmsg.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/div/a")
	WebElement buttonContinue;
	
	public void clickContinue()
	{
		buttonContinue.click();
	}
	

}
