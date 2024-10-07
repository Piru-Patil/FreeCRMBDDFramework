package com.qa.StepDefinitions;

import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class HomePageStepDefinitions extends TestBase{
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
		TestBase.initilization();    
	}
	
	@Then("user is on login page")
	public void user_is_on_login_page() {
		LoginPage loginpage = new LoginPage();
		String title = loginpage.validateLogingPageTitle();
		Assert.assertEquals("#1 Free CRM Software Power Up your Entire Business Free Forever", title);
	    
	}
	
	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	   
	}
	
	@Then("user enters username and password")
	public void user_enters_username_and_password() {
	    
	}
	
	@Then("user click on login")
	public void user_click_on_login() {
	    
	}
	
	@Then("home page is displayed")
	public void home_page_is_displayed() {
	   
	}
	
	@Then("validate home page title")
	public void validate_home_page_title() {

	}
	
	@Then("validate logged in user")
	public void validate_logged_in_user() {
	   
	}

}
