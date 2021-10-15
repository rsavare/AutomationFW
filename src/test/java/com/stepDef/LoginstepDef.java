package com.stepDef;

import org.junit.Assert;

import com.pomPages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginstepDef {
	
	LoginPage lp = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://www.arlparcelservice.com/#/login");
	    lp.clickSignInButton();
	    
	}

	@When("user enters the username {string}")
	public void user_enters_the_username(String username) {
	    lp.enteruserName(username);
	}

	@When("user enters the password {string}")
	public void user_enters_the_password(String password) {
	   lp.enterpassword(password);
	}

	@When("user clicks on the Login button")
	public void user_clicks_on_the_login_button() {
	   lp.clickLoginButton();
	}

	@Then("validate user is on Home page")
	public void validate_user_is_on_home_page() {
	    lp.verifyUserisOnHomePage();
	}


}
