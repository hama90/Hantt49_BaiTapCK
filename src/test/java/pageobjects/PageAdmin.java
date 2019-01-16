package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAdmin {
	
	WebDriver driver; 

	@FindBy(css="div.login-form div.row input[type=email]")
	public WebElement txtEmail;

	
	@FindBy(css="div.login-form div.row input[type=password]")
	public WebElement txtPassword;
	
	@FindBy(css="div.login-form div.row-command button[type=button]")
	public WebElement btnLogin;
	
	@FindBy(xpath="//ul[contains(@class,'sidebar-menu')]//a[@action='/subscription/sendnews']")
	public WebElement funcSoanVaGui;
	
	@FindBy(css="#txtName")
	public WebElement txtName;
	
	@FindBy(css="#txtSubject")
	public WebElement txtSubject;	
		
	@FindBy(xpath = "//div[contains(@class,'note-editable')]")
	public WebElement txtareaBody;
	
	@FindBy(css=".btn-next")
	public WebElement btnNext;	
	
	@FindBy(css=".logo")
	public WebElement logoAdminpage;	
	
	@FindBy(css=".content-header")
	public WebElement contentHeader;
	
	@FindBy(xpath="//input[@id='txtName']//following-sibling::div")
	public WebElement messErrortxtName;
	
	@FindBy(xpath="//input[@id='txtSubject']//following-sibling::div")
	public WebElement messErrortxtSubject;
	
	@FindBy(xpath="???")
	public WebElement messErrortxtBody;
	
	// The constructor
	public PageAdmin(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
}
