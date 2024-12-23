package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//div[@class='ac-input-container']")
	WebElement SearchField;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement SearchClick;
	
	@FindBy(xpath="//button[@id='a-autoid-1-announce']")
	WebElement addToCart;
	
	@FindBy(xpath="//a[normalize-space()='Go to Cart']")
	WebElement clickCart;
	
	@FindBy(xpath="//h2[normalize-space()='Shopping Cart']")
	WebElement msgConfirmation;
	
	public void SearchProduct(String bag)
	{
		SearchField.sendKeys(bag);
	}
	
	public void SearchClick()
	{
		SearchClick.click();
	}
	
	public void AddToCart()
	{
		addToCart.click();
	}
	public void goToCart()
	{
		clickCart.click();
	}
	public String landedInCart()
	{
		try
		{
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
}
