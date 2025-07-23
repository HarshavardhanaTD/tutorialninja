package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span")
	WebElement buttonMyaccount;
	
	public void clickMyaccount()
	{
		Actions action=new Actions(driver);
		action.moveToElement(buttonMyaccount).build().perform();
	}
	
	@FindBy(xpath="//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[2]/a")
	WebElement buttonRegistration;
	public void clickRegistration()
	{
		buttonRegistration.click();
	}
	
	@FindBy(xpath="//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[1]/a")
	WebElement buttonLogin	;
	
	public void clickLogin()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(buttonLogin)).click();
		
	}
	
	@FindBy(xpath="//*[\"@id=search\"]/div/div/div[2]/input[1]")
	WebElement textsearch;
	
	public void searchProduct(String search)
	{
		textsearch.sendKeys(search);
	}

	
	
	@FindBy(xpath="//*[@id=\"entry_217832\"]/a")
	WebElement buttonShoByCategory;
	
	public void clickShopByCategory()
	{
		buttonShoByCategory.click();
	}

	@FindBy(xpath="//span[normalize-space()='Phone, Tablets & Ipod']")
	WebElement buttonPhoneiPad;
	
	public void clickPhoneiPad()
	{
		buttonPhoneiPad.click();
	}
	
	
}
