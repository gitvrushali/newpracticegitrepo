package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import utils.TestContexSetup;

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	TestContexSetup testContexSetup;

	
	public LandingPageStepDefinition(TestContexSetup testContexSetup)
	{
		this.testContexSetup=testContexSetup;
	}
	
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:/Users/vrush/OneDrive/Documents/chromedriver.exe");
	    testContexSetup.driver = new ChromeDriver();
	    testContexSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(4000);
		testContexSetup.driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
	 
	}
	
	@When("User Serach with Shortname {string} and extracted actual name of product")
	public void user_serach_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
          LandingPage  landingPage =new LandingPage(testContexSetup.driver);
          landingPage.searchiteam(shortName);
        Thread.sleep(8000);
        testContexSetup.landingPageproductName= landingPage.getProducttName(). split("-")[0].trim();
		System.out.println(landingPageproductName+"   Is Extracted from HomePage");
		
	}

		
	} 
	
