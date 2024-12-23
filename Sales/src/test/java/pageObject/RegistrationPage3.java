package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage3 extends BasePage {
	
	public RegistrationPage3(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='CompanyName-fDne']")
	WebElement CompanyName;
	
	@FindBy(xpath="//select[@id='CompanyEmployees-l4sF']")
	WebElement EmployeeDropdown;
	
	@FindBy(xpath="//select[@id='CompanyLanguage-D8cr']")
	WebElement CompanyLanguageDropdown;
	
	@FindBy(xpath="//div[@class='field error']//div[@class='checkbox-ui']")
	WebElement RadioAgreement;
	
	@FindBy(xpath="button[type='submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//span[normalize-space()='Almost there! Check your email.']")
	WebElement msgConfirmation;

	public void CompanyField(String ComName)
	{
		CompanyName.sendKeys(ComName);
	}
	public void EmployeeCount(String employees)
	{
		Select select=new Select(EmployeeDropdown);
		select.selectByVisibleText(employees);
	}
	public void CompanyLanguage(String language)
	{
		Select select=new Select(CompanyLanguageDropdown);
		select.selectByVisibleText(language);
	}
	public void RadioBtn()
	{
		RadioAgreement.click();
	}
	public void SubmitButton()
	{
		btnSubmit.click();
	}
	
	public String getConfirmationMsg()
	{
		try
		{
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}

}
