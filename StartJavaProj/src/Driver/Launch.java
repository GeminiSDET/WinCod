package Driver;

import driverLaunch.ChromeDriver;
import driverLaunch.WebDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

	}
	}

}
