package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage
{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement txtFirstname;
	
	public void setFirstName(String generatfname)
	{
		txtFirstname.sendKeys(generatfname);
	}
	
	
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement txtLastname;
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement txtEmail;
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}

	

	
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement txtphonenum;
	public void setPhonenum(String phonenum)
	{
		txtphonenum.sendKeys(phonenum);
	}
	
	
	
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement txtPassword;
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement txtCfmPassword;
	public void setCfmPassword(String cfmpassword)
	{
		txtCfmPassword.sendKeys(cfmpassword);
		
	}

	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/div[1]/label")
	WebElement buttonsubscribe;
	
	public void clickSubscribe()
	{
		buttonsubscribe.click();
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/div/label")
	WebElement buttonPrivacy;
	
	public void clickPrivacy()
	{
		buttonPrivacy.click();
	}
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	WebElement buttonregister;
	
	public void clickRegister()
	{
		buttonregister.click();
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/p[2]")
	WebElement msgConfirmation;
	
	public String getConfirmationMsg()
	{
		try {
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div/a")
	WebElement buttonContinue;
	
	public void clickContinue()
	{
		buttonContinue.click();
	}
	
	
	@FindBy(xpath="//*[@id=\"widget-navbar-217834\"]/ul/li[1]/a/div/span")
	WebElement buttonHome;
	
	public void clickHomeButton()
	{
		buttonHome.click();
	}
}

