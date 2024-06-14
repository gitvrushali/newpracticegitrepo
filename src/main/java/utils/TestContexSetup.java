package utils;

import org.openqa.selenium.WebDriver;

public class TestContexSetup {

	public WebDriver driver;
	public String landingPageproductName;
	public PageObjectManeger pageObjectManeger ;
	public TestBase testBase;
	
	public TestContexSetup()
	{
		testBase= new TestBase();
		pageObjectManeger = new PageObjectManeger();
		
	}
}
