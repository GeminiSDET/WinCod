package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {

	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement EMail;
	@FindBy(xpath="//input[@id='continue']")
	WebElement btnContinue;
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement btnSignIn;
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement msgConfirmation;
	
	public void eMailInput(String eMailCredentials){EMail.sendKeys(eMailCredentials);}
	public void Continue(){btnContinue.click();}
	public void passwordfield(String pass){password.sendKeys(pass);}
	public void SignIn(){btnSignIn.click();}
	
	public String getConfirmationMsg()
	{
		try{return(msgConfirmation.getText());}
		catch(Exception e){return(e.getMessage());}
	}
}
