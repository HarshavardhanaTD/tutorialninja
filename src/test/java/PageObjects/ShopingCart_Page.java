package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopingCart_Page extends BasePage {

	public ShopingCart_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"checkout-cart\"]/div/div/h1")
	WebElement cnfShopingCartMsg;
	
	public boolean isShopingCartExist()
	{
		try {
		return(cnfShopingCartMsg.isDisplayed());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return false;
	}

	
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")
	WebElement cnfProducttMsg;
	
	public boolean isProductExist()
	{
		try {
		return(cnfProducttMsg.isDisplayed());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return false;
	}
	
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/a[2]")
	WebElement buttonCheckout;
	
	public void clickCheckOut()
	{
		buttonCheckout.click();
	}
}
