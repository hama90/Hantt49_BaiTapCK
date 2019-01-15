package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.PageAdmin;

public class StepsSoanVaGui {
	
	WebDriver driver;
	PageAdmin pageAdmin; 
	
	public StepsSoanVaGui() 
	{
		this.driver = Hooks.driver;
		this.pageAdmin = new PageAdmin(Hooks.driver);
	}
	
	@Given("^I navigate site \"([^\"]*)\"$")
	public void i_navigate_site(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    this.driver.get("http://www.testmaster.vn/admin");
	}

	@Given("^I enter valid information to login$")
	public void i_enter_valid_information_to_login() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    this.pageAdmin.txtEmail.sendKeys("khanh.tx@live.com");
	    this.pageAdmin.txtPassword.sendKeys("abc123");
	    this.pageAdmin.btnLogin.click();
	}

	@Given("^I click link \"([^\"]*)\" on menu$")
	public void i_click_link_on_menu(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(this.pageAdmin.logoAdminpage));
		this.pageAdmin.txtName.clear();
		this.pageAdmin.txtSubject.clear();
		this.pageAdmin.txtareaBody.clear();
		this.pageAdmin.btnNext.click();
	}

	@Then("^I should see form \"([^\"]*)\"$")
	public void i_should_see_form(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I choose \"([^\"]*)\"$")
	public void i_choose(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I provide nothing and click button Next$")
	public void i_provide_nothing_and_click_button_Next() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see error message \"([^\"]*)\" for each text$")
	public void i_should_see_error_message_for_each_text(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
