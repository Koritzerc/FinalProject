package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoginPage {
	
	@FindBy(name = "email")
	WebElement userIdField;
	
	@FindBy(name = "password")
	WebElement passwordField;
	
	@FindBy(name = "submit")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(CommonUI.driver, this);
	}
	public void enterUserId(String userId) {
		CommonUI.enter(userIdField, userId);
		
	}
	public void enterPassword(String password) {
		CommonUI.enter(passwordField, password);
	}
	public void click() {
		CommonUI.click(loginBtn);
	}
	
	}


