package com.stepDef;

import org.junit.Assert;

import com.pomPages.AlgoTradingPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlgoTradingDef {
	
	AlgoTradingPage lp = new AlgoTradingPage(DriverFactory.getDriver());
	
	@Given("User enters the URL in the browser")
	public void user_enters_the_url_in_the_browser() {
	   
	}

	@Given("User landson Algo Trading Home Page")
	public void user_landson_algo_trading_home_page() {
	   
	}

	@Then("Validate user is able to view the TWAP calculated values as per Data Feed")
	public void validate_user_is_able_to_view_the_twap_calculated_values_as_per_data_feed() {
	   
	}

	@Then("Validate user is able to view the VWAP calculated values as per the Data Feed")
	public void validate_user_is_able_to_view_the_vwap_calculated_values_as_per_the_data_feed() {
	   
	}


}
