package TestCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Apple_Cinema_30_Page;
import PageObjects.HomePage;
import PageObjects.SearchProduct_Page;
import PageObjects.ShopingCart_Page;
import TestBase.BaseClass;

public class SearchProduct_004 extends BaseClass {

	@Test()
	public void OrderOneProduct() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		
		hp.searchProduct("Apple Cinema 30");
		
		SearchProduct_Page sp=new SearchProduct_Page(driver);
		sp.search_product();
		
		Apple_Cinema_30_Page pr=new Apple_Cinema_30_Page(driver);
		pr.setSize();
		Thread.sleep(1000);
		pr.setLargeSize();
		Thread.sleep(1000);
		pr.clickAddtoCart();
		Thread.sleep(1000);
		
		pr.clickViewCart();
		
		ShopingCart_Page sc=new ShopingCart_Page(driver);
		boolean targetpage=sc.isShopingCartExist();
		Assert.assertEquals(targetpage, true, "Shoping Cart Page Exists");
		Thread.sleep(1000);
		boolean productname=sc.isProductExist();
		Assert.assertTrue(productname);
		Thread.sleep(1000);
		sc.clickCheckOut();
	}
}
