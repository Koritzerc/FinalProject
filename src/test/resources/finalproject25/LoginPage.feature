Feature: Login Page Functionality

  Scenario: User verify login sucessfully with valid credentials
    Given User navigates to login page
    When User provides valid credential
    Then User clicks login button
    And User verify "Guru99 Bank" title is displayed
