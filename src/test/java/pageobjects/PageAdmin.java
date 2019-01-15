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
	
	@FindBy(css=".logot")
	public WebElement logoAdminpage;	
	
	// The constructor
	public PageAdmin(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
}
