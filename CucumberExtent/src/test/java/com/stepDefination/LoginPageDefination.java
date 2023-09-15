package com.stepDefination;

import org.testng.Assert;

import com.cucumber.actions.HomePageActions;
import com.cucumber.actions.LoginPageActions;
import com.cucumber.utils.HelperUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefination {
	
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	
	@Given("login is on home page {string}")
	public void login_is_on_home_page(String URL) {
	    // Write code here that turns the phrase above into concrete actions
		HelperUtils.openPage(URL);
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		objLogin.fileOpen();
	}

	@Then("user should be on home page")
	public void user_should_be_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(objHome.getHomepageText().contains("Dashboard"));
	}
}


