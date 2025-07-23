package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindProduct extends BasePage{

	public FindProduct(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//*[@id=\"entry_212408\"]/div/div[8]/div/div[1]/div[2]/button[2]/i")
	WebElement searchproduct;
	
	public void clickwishlist()
	{
	
		searchproduct.click();
		
	}
	
	@FindBy(xpath="//*[@id=\\\"notification-box-top\\\"]/div/div[2]/div[2]/div[1]/a")
	WebElement buttonViewCart;
	
	public void clickViewCart()
	{
		buttonViewCart.click();
	}
		

}
