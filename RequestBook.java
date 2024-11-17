package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestBook {
	
	private WebDriver driver;


	public void LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//li[@id='ctl00_li1']")
	private WebElement RequestaBook; 
	
	@FindBy(xpath ="//input[@id='ctl00_phBody_RequestBook_txtISBN']")
	private WebElement ISBN; 
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_txtTitle']")
	private WebElement BookTitle; 
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_txtAuthor']")
	private WebElement AuthorName;
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_txtEmailReq']")
	private WebElement MailId;
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_RequestBook_txtPhone']")
	private WebElement MobileNumber;
	
	@FindBy(xpath = "//img[@id='ctl00_imglogo']")
	private WebElement logo;
	
	
	public void RequestBooks() {
		
		this.RequestaBook.click();
	}
	
	public void ISBN(String ISBN) {
		
		this.ISBN.sendKeys("152969695X");
	}
	
	public void BookTitle(String BookTitle) {
		
		this.BookTitle.sendKeys("Early Years Foundation Stage");
	}

	public void AuthorName(String Author) {
	
	this.BookTitle.sendKeys("Sage Publications");
}
	
	public void MailId(String MailId) {
		
	this.MailId.sendKeys("geethavani244@@gmail.com");
}


	public void MobileNumber(String MobileNumber) {
		
	this.MobileNumber.sendKeys("9505972695");
}
	
	public void clicking_on_logo() {
		
	this.logo.click();
}

}
