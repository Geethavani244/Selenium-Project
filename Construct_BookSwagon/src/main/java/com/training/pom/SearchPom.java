package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPom {
	private WebDriver driver;
	
	public SearchPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "inputbar")
	private WebElement Inputbar;
	
	@FindBy(name = "btnTopSearch")
	private WebElement button;
	
	@FindBy(linkText = "Alchemist")
	private WebElement book;
	
	@FindBy(id ="btnAddtoCart")
	private WebElement cart;
	
	public void Search(String Inputbar) {
		this.Inputbar.sendKeys("Alchemist");
	}
	
	public void clicking() {
		this.button.click();
	}
	
	public void click_book() {
		this.book.click();
	}
	
	public void add_cart() {
		this.cart.click();
	}
	

}
