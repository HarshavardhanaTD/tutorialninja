package TestCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import TestBase.BaseClass;

public class TestCase_001 extends BaseClass {
	
	@Test()
	public void verify_accountRegistration() throws InterruptedException
	{
		try
		{
		logger.info("Testing Started");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		Thread.sleep(1000);
		
		hp.clickRegistration();
		Thread.sleep(1000);
		
		RegistrationPage rp=new RegistrationPage(driver);
		String fname=randomString();
		rp.setFirstName(fname);
		System.out.println(fname);
		rp.setLastName("TD");
		
		String email=randomAlphaStringEmail();
		System.out.println(email);
		rp.setEmail(email +"@gmail.com");
		rp.setPhonenum("9019868633");
		Thread.sleep(1000);
		
		String password=randomAlphaStringPwd();
		System.out.println(password);
		rp.setPassword(password);
		
		rp.setCfmPassword(password);
		
		rp.clickSubscribe();
		rp.clickPrivacy();
		
		rp.clickRegister();
		
		
		
		String cofmsg=rp.getConfirmationMsg();
		
		rp.clickContinue();
		
		rp.clickHomeButton();
		
		
		
		
		
		if(cofmsg.equals("Congratulations! Your new account has been successfully created!"))
				{
					Assert.assertTrue(true);
					
				}
		else
		{
			logger.error("Testing Failed");
			logger.debug("Debug logs");
			
		}
		}
		catch(Exception e)
		{
		logger.error("TestCase Completly failed");
		System.out.println(e.getMessage());
		
		}
		
	}
}

