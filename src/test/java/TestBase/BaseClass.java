package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;



import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
public class BaseClass {

	public WebDriver driver;
	public Properties p;
	
	public org.apache.logging.log4j.Logger logger;
	@BeforeClass()
	@Parameters({"os","browser"})
	public void setUp(String os, String br) throws IOException, InterruptedException
	{
		logger = LogManager.getLogger(this.getClass());
		p=new Properties();
		
		FileReader file=new FileReader("src/test/resources/config.properties");
		p.load(file);
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
		
			//os
			if(os.equalsIgnoreCase("linux"))
			{
				capabilities.setPlatform(Platform.LINUX);
			}
			else if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WIN11);
			}
			
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("No matching OS");
				return;
			}
			//browser
			
			switch(br.toLowerCase())
			{
			case "chrome" : capabilities.setBrowserName("chrome"); break;
			case "edge"   : capabilities.setBrowserName("MicrosoftEdge");break;
			default : System.out.println("Invalid Browser"); return;
			}
			
			 driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		}
		
	
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			switch(br)
			{
			case "chrome" : driver=new ChromeDriver(); break;
			case "edge"   : driver=new EdgeDriver(); break;
			default		  : System.out.println("No supporting browser");return;
			}
		}
		
		
	
		
		
		driver.get(p.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		
		
	}
	
	@AfterClass()
	public void tearDown()
	{
		driver.quit();
	}

	
	public String randomString()
	{
		String generatfname=RandomStringUtils.randomAlphabetic(8);
		return generatfname;
	}
	
	public String randomAlphaString()
	{
		String generateAlphaString=RandomStringUtils.randomAlphanumeric(8);
		return generateAlphaString;
	}
	
	public String randomAlphaStringEmail()
	{
		String generateAlphaStringPwd=RandomStringUtils.randomAlphabetic(9);
		return generateAlphaStringPwd;
	}
	
	public String randomAlphaStringPwd()
	{
		String generateAlphaStringPwd=RandomStringUtils.randomAlphabetic(9);
		return generateAlphaStringPwd;
	}
}
