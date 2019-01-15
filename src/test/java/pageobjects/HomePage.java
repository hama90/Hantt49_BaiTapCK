package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver; 
	
	@FindBy(css="div.col-sm-9 input[type=email]")
	public WebElement txtemail;
	
	@FindBy(css="div.col-sm-3 button.next-btn-primary")
	public WebElement btnRegister;
	
	@FindBy(css="div.error span")
	public WebElement lbErrorMessage;
	
	@FindBy(css="div.popover-body")
	public WebElement lbMessage2;
	
	@FindBy(css=".form-control#fullname")
	public WebElement txtFullname;
	
	@FindBy(css="div.dropdown button#ddlGender")
	public WebElement sltboxGender;
	
	@FindBy(xpath="//ul[@class='dropdown-menu']//a[contains(text(),'Nam')]")
	public WebElement itemNam;
	
	@FindBy(css="div.dropdown button#ddlNewsType")
	public WebElement sltNewsType;
	
	@FindBy(css="div.popover-footer button#allow-button")
	public WebElement btnAgree;
	
	@FindBy(css="div.body-message")
	public WebElement lbSuccessRegisMess;
	
	// The Contructor to initialize  the page factory 
	
	public HomePage (WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	

}
