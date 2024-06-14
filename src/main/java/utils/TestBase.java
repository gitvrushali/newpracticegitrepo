
package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebdriverManager()
	{

	    System.setProperty("webdriver.chrome.driver", "C:/Users/vrush/OneDrive/Documents/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    return  driver;
		 
	}

}
 
