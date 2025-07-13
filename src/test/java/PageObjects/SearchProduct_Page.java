package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct_Page extends BasePage
{

	public SearchProduct_Page(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/ul/li[5]/div[2]/h4/a")
	WebElement product;
	
	public void search_product()
	{
		product.click();
	}

}
