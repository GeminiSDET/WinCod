package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='signup_link']")
	WebElement btnNewAccount;
	
	public void createAccount()
	{
		btnNewAccount.click();
	}
	
	
	
	
	
	
	
	
	
	
}
