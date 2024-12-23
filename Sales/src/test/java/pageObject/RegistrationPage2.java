package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage2 extends BasePage {

	public RegistrationPage2(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='UserPhone-twAg']")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@id='UserEmail-Cxnm']")
	WebElement eMail;
	
	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement btnNext2;
	
	public void phoneNumberField(String Num)
	{
		PhoneNumber.sendKeys(Num);
	}
	public void eMailField(String email)
	{
		eMail.sendKeys(email);
	}
	public void nextButton()
	{
		btnNext2.click();
	}
}
