package Modules;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturedAuthor {
	private WebDriver driver;


	public void LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='ctl00_liRequestBook']")
	private WebElement clickFeaturedBook; 
	
	@FindBy(xpath = "//img[@src='https://d2g9wbak88g7ch.cloudfront.net/authorimages/robin-sharma1.jpg']")
	private WebElement click_author_image; 
	
	@FindBy(xpath = "//img[@src='https://d2g9wbak88g7ch.cloudfront.net/productimages/mainimages/623/9788179921623.jpg']")
	private WebElement click_book;
	
	@FindBy(xpath = "//a[@id='btnAddtocart']")
	private WebElement addding_to_cart;
	
	@FindBy(id = "btnGotocart")
	private WebElement go_to_cart;
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_BookCart_lvCart_imgPayment']")
	private WebElement click_on_Buy;
	
	
	public void FeaturedBooks() {
		
		this.clickFeaturedBook.click();
	}
	
	public void ClickAuthorImage() {
		
		this.click_author_image.click();
	}
	
	public void clickBookName() {
		
		this.click_book.click();
		
	}
	
public void Adding_in_cart() {
		
		this.addding_to_cart.click();
		
	}

public void Go_cart() {
	
	this.go_to_cart.click();
	
}

public void click_On_buy() {
	
	this.click_on_Buy.click();
	
}
	
	
}