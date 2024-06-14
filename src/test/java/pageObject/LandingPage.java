package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By search =By.xpath("//input[@type='search']");
	By productName =By.cssSelector("h4.product-name");
	By topDeals =By.linkText("Top Deals");
	
	 public void searchiteam(String name)
	 { 
		driver.findElement(search).sendKeys(name);
	 	
	 }
	 public void getSearchText()
	 {
		 driver.findElement(search).getText(); 
	 }
	 
	 public String getProducttName()
	 {
		 
		 return driver.findElement(productName).getText();
		 
	 }
	 public void selecttopDealsPage()
	 {
		 driver.findElement(topDeals).click();
	 }
	 
	 
	

}
 