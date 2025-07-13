package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.Logout_Page;
import PageObjects.My_Account_Page;
import TestBase.BaseClass;
import Utilities.DataProviders;


public class Login_DDT_003 extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	
	public void verfiy_Login_DDT(String emailid, String pwd,String exp) throws InterruptedException
	{
		System.out.println(emailid + " | " + pwd + " | " + exp);
		
		
		HomePage hp=new HomePage(driver);
		
		hp.clickMyaccount();
		hp.clickLogin();
		logger.info("Entering userdetails");
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmailId(emailid);
		lp.setPassword(pwd);
		
		lp.clickLogin();
		Thread.sleep(1000);
		
		My_Account_Page mc=new My_Account_Page(driver);
		mc.clickLogout();
		Thread.sleep(1000);
		
		Logout_Page lop= new Logout_Page(driver);
		lop.clickContinue();
	}
}
