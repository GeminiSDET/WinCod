package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage{

	public Login(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement InputEmail;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement InputPassword;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SignIn;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement AccountLoginSuccess;
	
	@FindBy(xpath="")
	WebElement 
	
	public void LoginAmazon(String email)
	{
		InputEmail.sendKeys(email);
	}
	
	public void ContinueEmailButton()
	{
		btnContinue.click();
	}
	public void Password(String pass)
	{
		InputPassword.sendKeys(pass);
	}
	public void SignInSubmit()
	{
		SignIn.click();
	}
	public String LoginSuccess()
	{
		try {
			return (AccountLoginSuccess.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
}

//Actions act=new Actions(driver);
//act.moveToElement(SignIn).click().perform();

//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].click()",SignIn);

//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
//mywait.until(ExpectedConditions.elementToBeClickable(SignIn)).click();











