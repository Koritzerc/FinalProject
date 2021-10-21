package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class NewCustomerPage {
		
		@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
		WebElement CustomerName;
		
		@FindBy(name = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
		WebElement GenderMale;
		
		@FindBy(name = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
		WebElement GenderFemale;
		
		@FindBy(name = "//*[@id=\"dob\"]")
		WebElement DOB;
		
		@FindBy(name = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
		WebElement Address;
		
		@FindBy(name = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
		WebElement City;
		
		@FindBy(name = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
		WebElement State;
		
		@FindBy(name = "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
		WebElement PIN;
		
		@FindBy(name = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
		WebElement PhoneNumber;
		
		@FindBy(name = "/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
		WebElement Email;	
		
		public NewCustomerPage() {
			PageFactory.initElements(CommonUI.driver, this);
		}
		public void CustName(String CustName) {
			CommonUI.enter(CustomerName, CustName);	
		}
		public void clickMale() {
			CommonUI.click(GenderMale);
		}
		public void clickFemale() {
			CommonUI.click(GenderFemale);
		}
		public void BirthDate(String BirthDate) {
			CommonUI.enter(DOB, BirthDate);
		}
		public void Addy(String Addy) {
			CommonUI.enter(Address, Addy);
		}
		public void Cityy(String cityy) {
			CommonUI.enter(City, cityy);
		}
		public void State1(String State1) {
			CommonUI.enter(State, State1);
		}
		public void Pin1(String Pin1) {
			CommonUI.enter(PIN, Pin1);
		}
		public void enterPhoneNumber(String enterPhoneNumber) {
			CommonUI.enter(PhoneNumber, enterPhoneNumber);
		}
		public void enterEmail(String enterEmail) {
			CommonUI.enter(Email, enterEmail);
		}
		//ouail
	
}
