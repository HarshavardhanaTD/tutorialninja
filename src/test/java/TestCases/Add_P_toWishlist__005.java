package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.FindProduct;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import TestBase.BaseClass;

public class Add_P_toWishlist__005 extends BaseClass
{

	@Test()
	
	public void verifY_itemOn_Cart()
	{
		HomePage hp=new HomePage(driver);
		
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		String getemailid=p.getProperty("emailid");
		lp.setEmailId(getemailid);
		
		String getpassword=p.getProperty("password");
		lp.setPassword(getpassword);
		lp.clickLogin();
		
		
		hp.clickShopByCategory();
		hp.clickPhoneiPad();
		
		FindProduct fp=new FindProduct(driver);
		
		
		fp.clickwishlist();
			
		
		
		
		
		
	}
	
}
