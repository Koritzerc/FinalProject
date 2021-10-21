
@NewCustomer
Feature: Adding new Customer 

  Scenario: inputting credentials 
    Given the User clicks on the New Customer Tab
    And the User is in the Add New Customer page
    When User inputs Customer Name
    And User Inputs Gender selaction
    And User Inputs Date of birth
    And User Inputs Address
    And User Inputs City
    And User Inputs State
    And User Inputs Pin
    And User Inputs Telephone Number
    And User Inputs Email
    Then User validates by clicking the submit button
    And check more outcomes

 