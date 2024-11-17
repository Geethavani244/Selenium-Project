package com.training.sanity.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.NewArrivals;
import com.training.pom.SearchPom;
import com.training.utility.DriverNames;

public class SearchTest {
	private static final String DriverFactory = null;
	private WebDriver driver;
	private String baseUrl;
	private SearchPom searchpom;
	
	@BeforeTest
	public void setUp() {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		searchpom = new SearchPom(driver);
		NewArrivals newarrivals = new NewArrivals(driver);
		baseUrl = "https://www.bookswagon.com/";
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void searchtest1() {
		searchpom.Search("Alchemist");
		searchpom.clicking();
		searchpom.click_book();
		searchpom.add_cart();
	}	
		
	
}
