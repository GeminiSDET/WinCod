package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage1 extends BasePage {

	public RegistrationPage1(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='UserFirstName-n7pv']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='UserLastName-8LDZ']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='UserTitle-xW4g']")
	WebElement txtJobTitle;
	
	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement btnNext1;
	
	public void firstNameField(String Test1)
	{
		txtFirstName.sendKeys("Test1");
	}
	
	public void lastNameField(String LastName)
	{
		txtLastName.sendKeys("LastName");
	}
	public void JobTitleField(String TitleOne)
	{
		txtJobTitle.sendKeys("TitleOne");
	}
	public void NextButton()
	{
		btnNext1.click();
	}
}

