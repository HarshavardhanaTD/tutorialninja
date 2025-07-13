package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Apple_Cinema_30_Page extends BasePage {

	public Apple_Cinema_30_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"input-option240-216836\"]")
	WebElement selectSize;
	
	public void setSize()
	{
		selectSize.click();
	}
	
	@FindBy(xpath="//*[@id=\"input-option240-216836\"]/option[4]")
	WebElement selectLarge;
	
	public void setLargeSize()
	{
		selectLarge.click();
	}
	
	
	
	@FindBy(xpath="//*[@id=\"entry_216842\"]/button")
	
	WebElement buttonAddtoCart;
	
	public void clickAddtoCart()
	{
		buttonAddtoCart.click();
	}
	
	
	
	@FindBy(xpath="//*[@id=\"notification-box-top\"]/div/div[2]/div[2]/div[1]/a")
				   
	
	WebElement buttonViewCart;
	
	public void clickViewCart()
	{
		buttonViewCart.click();
	}
}
