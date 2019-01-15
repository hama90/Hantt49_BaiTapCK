package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.swing.text.Utilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;

public class StepsDangKyNhanTin {

	WebDriver driver;
	HomePage homepage;

	public StepsDangKyNhanTin() {
		// TODO Auto-generated constructor stub

		this.driver = Hooks.driver;
		this.homepage = new HomePage(Hooks.driver);

	}

	@Given("^I am staying at site \"([^\"]*)\"$")
	public void i_am_staying_at_site(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.driver.get("http://testmaster.vn/");

	}

	@When("^I fill email text with no data$")
	public void i_fill_email_text_with_no_data() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.homepage.txtemail.clear();
		this.homepage.txtemail.sendKeys("");

	}

	@When("^I click on Register button$")
	public void i_click_on_Register_button() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		this.homepage.btnRegister.click();

	}

	@Then("^I should see the error message : \"([^\"]*)\"$")
	public void i_should_see_the_error_message(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(this.homepage.lbErrorMessage.getText(), arg1);
	}

	@When("^I enter valid email$")
	public void i_enter_valid_email() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.homepage.txtemail.sendKeys("test111111" +  "@123.com");
		this.homepage.btnRegister.click();

	}

	@When("^I provide extra information$")
	public void i_provide_extra_information() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.homepage.txtFullname.sendKeys("ABC");
		this.homepage.sltboxGender.click();
		this.homepage.itemNam.click();
		this.homepage.btnAgree.click();
	}

	@Then("^I should see the success message : \"([^\"]*)\"$")
	public void i_should_see_the_success_message(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(this.homepage.lbSuccessRegisMess));
		assertEquals(this.homepage.lbSuccessRegisMess.getText(), arg1);
	}
	
	@When("^I provide a valid email$")
	public void i_provide_a_valid_email() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	 this.homepage.txtemail.sendKeys("abc12@4.com");
	 this.homepage.btnRegister.click();
	}

	@When("^I do not input Fullname and submit form$")
	public void i_do_not_input_Fullname_and_submit_form() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    this.homepage.txtFullname.clear();
	    this.homepage.btnAgree.click();
	}

	@Then("^I should see the required message: \"([^\"]*)\"$")
	public void i_should_see_the_required_message(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(this.homepage.errorNullFullNameMess));
	  assertEquals(this.homepage.errorNullFullNameMess.getText(), arg1);
	}

	@When("^I provide an existed email$")
	public void i_provide_an_existed_email() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    this.homepage.txtemail.sendKeys("abc@123.com");
	    this.homepage.btnRegister.click();
	}

	@Then("^I should see a popup with content: \"([^\"]*)\"$")
	public void i_should_see_a_popup_with_content(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(this.homepage.notifyExistedEmail));
	   assertEquals(this.homepage.notifyExistedEmail.getText(), arg1);
	   
	}


}