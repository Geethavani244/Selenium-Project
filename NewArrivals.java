package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArrivals {
	private WebDriver driver;


	public void LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//li[@id='ctl00_linewrelease']")
	private WebElement ClickNewArrivals; 
	
	@FindBy(xpath ="//a[@href='https://www.bookswagon.com/book/percy-jackson-olympians-rick-riordan/9780241691700']")
	private WebElement click_book; 
	
	@FindBy(xpath = "//a[@id='btnAddtocart']")
	private WebElement clickToCart;
	
	@FindBy(id = "btnGotocart")
	private WebElement GoTOCart; 
	
	
	public void ClickNewArrivals() {
		
		this.ClickNewArrivals.click();
	}
	
	public void ClickBookName() {
		
		this.click_book.click(); 
	}
	
	public void ClickAddToCart() {
		this.clickToCart.click(); 
	}
	
	public void Go_cart() {
		this.GoTOCart.click();
	}

}
