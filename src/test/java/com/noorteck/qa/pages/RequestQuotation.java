package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RequestQuotation {
	
	@FindBy (xpath= "//*[@id=\"quotation_breakdowncover\"]")
	WebElement quotationDrop;
	
	@FindBy (xpath= "//*[@id=\"quotation_windscreenrepair_t\"]")
	WebElement windScreenField;
	
	@FindBy (xpath= "//*[@id=\"quotation_incidents\"]")
	WebElement incidentsField;
	
	@FindBy (xpath= "//*[@id=\"quotation_vehicle_attributes_registration\"]")
	WebElement registrationsField;
	
	@FindBy (xpath= "//*[@id=\"quotation_vehicle_attributes_mileage\"]")
	WebElement mileageField;
	
	@FindBy (xpath= "//*[@id=\"quotation_vehicle_attributes_value\"]")
	WebElement estimatedField;
	
	@FindBy (xpath= "//*[@id=\"quotation_vehicle_attributes_parkinglocation\"]")
	WebElement parkingField;
	
	@FindBy (xpath= "//*[@id=\"quotation_vehicle_attributes_policystart_1i\"]")
	WebElement yearField;
	
	@FindBy (xpath= "//*[@id=\"quotation_vehicle_attributes_policystart_2i\"]")
	WebElement monthField;
	
	@FindBy (xpath= "//*[@id=\"quotation_vehicle_attributes_policystart_3i\"]")
	WebElement dayField;
	
	@FindBy (xpath= "//*[@id=\"new_quotation\"]/div[8]/input[3]")
	WebElement saveButton;
	
	
	public RequestQuotation() {
		PageFactory.initElements(CommonUI.driver, this);
}
	
	public void clickBreakDownCover() {
		CommonUI.click(quotationDrop);
		
	}
	
	public void clickWindScreenRepair() {
		CommonUI.click(windScreenField);
		
	}
	public void enterIncidents(String enterIncidents) {
		CommonUI.enter(incidentsField, enterIncidents);
	}
	
	public void enterRegistration(String enterRegistration) {
		CommonUI.enter(registrationsField, enterRegistration);
		
}
	
	public void enterAnnualMileage(String enterAnnualMileage) {
		CommonUI.enter(mileageField, enterAnnualMileage);
		
	}
	
	public void enterEstimatedValue(String enterEstimatedValue) {
		CommonUI.enter(estimatedField, enterEstimatedValue);
	
	}
	public void clickParkingLocation() {
		CommonUI.click(parkingField);
		
	}
	public void clickYear() {
		CommonUI.click(yearField);
}
	public void clickMonth() {
		CommonUI.click(monthField);
	}
		public void clickDay() {
			CommonUI.click(dayField);
		
	}
		
		public void clickSaveQuotationbutton() {
			CommonUI.click(saveButton);
		}
}