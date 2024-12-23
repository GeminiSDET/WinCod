package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClassReUsuable {
public WebDriver driver;
public Properties pro;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src//test//resources//config.properties");
		pro=new Properties();
		pro.load(fis);
		
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver();break;
		case "edge" : driver=new EdgeDriver();break;
		case "firefox" : driver=new FirefoxDriver();break;
		default : System.out.println("Invalid browser name");return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pro.getProperty("appURL1"));
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	/*	public String randomString()
	{
		String generatestring = RandomStringUtils.randomAlphabetic(5);
				return generatestring;
	}
	public String randomNumber()
	{
		String generatenumber = RandomStringUtils.randomNumeric(10);
				return generatenumber;
	}
	
	public String randomAlphaNumberic()
	{
		String generatestring = RandomStringUtils.randomAlphabetic(5);
		String generatenumber = RandomStringUtils.randomNumeric(10);
				return (generatestring+"@"+generatenumber;
	}
	
	lg.LoginAmazon(randomeString()+"@gmail.com");
	*/
}
