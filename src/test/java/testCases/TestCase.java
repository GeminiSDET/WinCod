package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.SearchPage;

public class TestCase extends BaseClassReUsuable{

	@Test
	public void verify_Login_To_Cart()
	{
		Login lg=new Login(driver);
		lg.LoginAmazon("azarriju@gmail.com");
		lg.ContinueEmailButton();
		lg.Password("Azar~!@#4");
		lg.SignInSubmit();
		String LandedHome=lg.LoginSuccess();
		Assert.assertEquals(LandedHome, "Hello, azar");
		
		SearchPage sp=new SearchPage(driver);
		sp.SearchProduct("iPhone");
		sp.SearchClick();
		sp.AddToCart();
		sp.goToCart();
		String SuccessfulyLandedCart=sp.landedInCart();
		Assert.assertEquals(SuccessfulyLandedCart, "Shopping Cart");
		
	}
}





















