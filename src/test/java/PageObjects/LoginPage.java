package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtEmail;
	
	public void setEmailId(String email)
	{
		
		txtEmail.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	public void setPassword(String password)
	{
		
		txtPassword.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement buttonLogin;
	
	public void clickLogin()
	{
		
		buttonLogin.click();
	}
	
}
