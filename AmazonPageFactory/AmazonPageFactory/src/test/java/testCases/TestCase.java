package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.SearchPage;

public class TestCase extends BaseClassReUsuable{

	@Test
	public void Login_Acct()
	{
		logger.info("****Starting Login****");
		
		try
		{
		Login lg=new Login(driver);
		lg.eMailInput("azarriju@gmail.com");
		lg.Continue();
		lg.passwordfield("Azar~!@#4");
		lg.SignIn();
		
		logger.info("****Login Sucess & landed in HomeScreen****");
		String LoginSucess=lg.getConfirmationMsg();
		Assert.assertEquals(LoginSucess, "Hello, azar");
		}
		catch(Exception e)
		{
			logger.error("**Test Failed**");
			logger.debug("**Debug Logs**");
			Assert.fail();
		}
		logger.info("**Finished**");
	
		SearchPage sp=new SearchPage(driver);
		sp.searchProductAmazon(null);
	}
}
