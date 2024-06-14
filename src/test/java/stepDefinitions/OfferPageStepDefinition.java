package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import pageObject.OffersPage;
import pageObject.PageObjectManeger;
import utils.TestContexSetup;

public class OfferPageStepDefinition {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	TestContexSetup testContexSetup;
	public PageObjectManeger pageObjectManeger;  

	public OfferPageStepDefinition(TestContexSetup testContexSetup) {
		this.testContexSetup = testContexSetup;
	}

	@Then("User Search for {string} Shortname in offerpage")
	public void User_Search_for_same_Shortname_in_offerpage(String shortName) throws InterruptedException {

		switchToOfferPage();
		OffersPage  offersPage  = new OffersPage(testContexSetup.driver);
		offersPage.searchiteam(shortName);
		Thread.sleep(8000);
		offerPageProductName = offersPage.getProducttName();
				}

	public void switchToOfferPage() {
		pageObjectManeger=new PageObjectManeger( testContexSetup.driver);
		LandingPage landingPage =  pageObjectManeger.getLandingPage();
		landingPage.selecttopDealsPage();

		Set<String> s1 = testContexSetup.driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String ParentWindow = i1.next();
		String ChildWindow = i1.next();
		testContexSetup.driver.switchTo().window(ChildWindow);
	}

	@Then("Validate product namae in offers page matches with LandingPage")
	public void Validate_product_namae_in_offers_page_matches_with_LandingPage() {
		Assert.assertEquals(offerPageProductName, testContexSetup.landingPageproductName);

	}
}
