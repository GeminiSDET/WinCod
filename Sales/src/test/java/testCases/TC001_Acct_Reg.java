package testCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage1;
import pageObject.RegistrationPage2;
import pageObject.RegistrationPage3;

public class TC001_Acct_Reg {

	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void verify_acct_reg()
	{
		HomePage hp=new HomePage(driver);
		hp.createAccount();
		
		RegistrationPage1 regPage1=new RegistrationPage1(driver);
		regPage1.firstNameField("FirstName");
		regPage1.lastNameField("LastName");
		regPage1.JobTitleField("JobTitle");
		regPage1.NextButton();
		
		RegistrationPage2 regPage2=new RegistrationPage2(driver);
		regPage2.phoneNumberField("1231231232");
		regPage2.eMailField("aza@gmail.com");
		regPage2.nextButton();
		
		RegistrationPage3 regPage3 =new RegistrationPage3(driver);
		regPage3.CompanyField("CompanyName");
		regPage3.EmployeeCount("2");
		regPage3.CompanyLanguage("English");
		regPage3.RadioBtn();
		regPage3.SubmitButton();
		
		String confirmMsg=regPage3.getConfirmationMsg();
		Assert.assertEquals(confirmMsg, "Almost there! Check your email.");
}
}
