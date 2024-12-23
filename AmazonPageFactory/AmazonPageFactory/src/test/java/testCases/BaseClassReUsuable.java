package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClassReUsuable {

	public WebDriver driver;
	public Logger logger;
	public Properties pro;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		FileInputStream fis=new FileInputStream(".//src//test//resources//config.properties");
		pro=new Properties();
		pro.load(fis);
		
		logger=LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase())
		{
		case "chrome" :driver=new ChromeDriver();break;
		case "edge"   :driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default       :System.out.println("Invalied browser name"); return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pro.getProperty("appURL1"));
		//driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
