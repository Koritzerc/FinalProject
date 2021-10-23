package com.noorteck.qa.steps;

import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.utils.CommonUI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	LoginPage loginPage;
       
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	    String url = "http://demo.guru99.com/insurance/v1/index.php";
	    CommonUI.openBrowser("chrome");
	    CommonUI.navigate(url);
	    
	    loginPage = new LoginPage();
	}

	@When("User provides valid credential")
	public void user_provides_valid_credential() {
		loginPage.enterUserId(" jsjeh@gmail.com");
		loginPage.enterPassword(" dutrep-Zihwe7-goxvow");
	}
	   
	

	@Then("User clicks login button")
	public void user_clicks_login_button() {
		loginPage.click();
	}
	    

	@Then("User verify {string} title is displayed")
	public void user_verify_title_is_displayed(String string) {
	 
		System.out.println(CommonUI.getTitle());
	}

}
