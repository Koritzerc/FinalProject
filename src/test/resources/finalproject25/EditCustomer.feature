Feature: Edit customer Functionality
  I

  Scenario: User verify edits customer successful 
    Given User login with valid credentials
    And User Clicks edit customer Button
    When User verifies Edit Customer form Page
    And Enters Customer ID <Customer Id>
    And Verifys mandatory field 
    Then User enters <mandatory field>
    
    Examples: 
    |Customer Id| mandory field |
    |name       |mandatory field|

 
