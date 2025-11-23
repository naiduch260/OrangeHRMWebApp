package StepDefenitationFiles;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import OrangeHRMPages.OrangeHRMMethods;
import Utils.BrowserSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	public WebDriver driver;
	OrangeHRMMethods orangeHRMMethods;
	BrowserSetup browserSetup;
	
	public LoginPage() {
		this.driver= Hooks.driver;
		this.orangeHRMMethods = new OrangeHRMMethods(driver);
	}
	
	@Given("user navigate to Login page")
	public void user_navigate_to_login_page() throws IOException {
		orangeHRMMethods.loginPageTitle();
	   
	}
	@When("user enter username {string} field")
	public void user_enter_username_field(String userName) throws Exception {
		orangeHRMMethods.enterUserField(userName);
	    
	}
	@And("user enter password {string} field")
	public void user_enter_password_field(String password) {
		orangeHRMMethods.enterPasswordField(password);
	}
	@And("user click on login button")
	public void user_click_on_login_button() {
		orangeHRMMethods.clickOnLoginButton();
	   
	}
	@Then("user navigate Dasbord Page")
	public void user_navigate_Dashbord_page() {
		orangeHRMMethods.dashBoardMainPage();
		
	}
	@Then("user will get error message")
	public void user_will_get_error_message() {
		orangeHRMMethods.errorMessageTitle();
	}

	@Then("user will get error message under username field")
	public void user_will_get_error_message_under_username_field() throws InterruptedException {
//		Thread.sleep(5000);
		orangeHRMMethods.errorMessageUnderUserName();
	}
	@Then("user will get error message under password field")
	public void user_will_get_error_message_under_password_field() throws InterruptedException {
		Thread.sleep(5000);
		orangeHRMMethods.errorMessageUnderPassword();
	}


}
