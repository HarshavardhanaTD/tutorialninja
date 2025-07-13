package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.Logout_Page;
import PageObjects.My_Account_Page;
import TestBase.BaseClass;

public class LoginTestCase__002 extends BaseClass{

	@Test()
	public void LoginAccount() throws InterruptedException
	{
		try {
		logger.info("Testing Started");
		HomePage hp=new HomePage(driver);
		
		hp.clickMyaccount();
		hp.clickLogin();
		logger.info("Entering userdetails");
		Thread.sleep(1000);
		
		LoginPage lp=new LoginPage(driver);
		String getemailid=p.getProperty("emailid");
		lp.setEmailId(getemailid);
		
		String getpassword=p.getProperty("password");
		lp.setPassword(getpassword);
		lp.clickLogin();
		logger.info("User Logged in");
		Thread.sleep(1000);
		
		
		My_Account_Page acpg= new My_Account_Page(driver);
		boolean targetpage =acpg.isMyaccountexist();
		
		Assert.assertTrue(targetpage);
		logger.info("Myaccount page exists");
		
		acpg.clickLogout();
		
		
		logger.info("Logout button exists");
		Logout_Page lgp=new Logout_Page(driver);
		boolean loggedout=lgp.isLoggedOutMsgExist();
		Assert.assertEquals(loggedout, true, "Account successfully got logged out");
		lgp.clickContinue();
		logger.info("User Successfully Loggged out from the page");
		}
		catch(Exception e)
		{
			logger.debug("Something went wrong");
		
		}
		
	}
}
