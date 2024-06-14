package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManeger {

	public  LandingPage landingpage;
	public OffersPage offerPage;
	public WebDriver driver;
	
 public PageObjectManeger(WebDriver driver )
 {
	 this.driver = driver;
 }
		
	
	public LandingPage getLandingPage()
	{
		 landingpage = new LandingPage(driver);
		 return  landingpage;
			
	}
	public OffersPage OffersPage()
	{
		offerPage = new OffersPage(driver);
		return offerPage;
	}
}
