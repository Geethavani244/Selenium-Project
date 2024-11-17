package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellers {
	
private WebDriver driver; 
	
	public void LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='ctl00_libestseller']")
	private WebElement clickBestSellers; 
	
	@FindBy(xpath = "//img[@src='https://www.bookswagon.com/productimages/images200/266/9789387779266.jpg']")
	private WebElement click_book; 
	
	@FindBy(xpath = "//a[@id='btnAddtocart']")
	private WebElement AddToCart;
	
	@FindBy(id = "btnGotocart")
	private WebElement GoTOCart; 
	
	
	public void ClickBestSellers() {
		
		this.clickBestSellers.click();
	}
	
	public void ClickBookName() {
		
		this.click_book.click();; 
	}
	
	public void ClickAddToCart() {
		this.AddToCart.click(); 
	}
	
	public void Go_cart() {
		this.GoTOCart.click();
	}

}
