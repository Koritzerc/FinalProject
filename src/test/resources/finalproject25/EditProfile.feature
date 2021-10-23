Feature: Edit Profile Functionality

  Scenario Outline: User verify successfully update Edit Profile
    Given User Logins in with valid credential
    And User clicks on Edit Profile tab
    #And User selects "Ms" from Title dropdown
    When User input data <firstName><lastName> <phoneNumber> <streetAddress> <City> <County> <ZipCode>
    #And User selects "1978" as year from DOB dropdown
    #And User selects "October" as month from DOB dropdown
    #And User selects "25" as day from DOB dropdown
    #And User selects "Full" option as Licencetype
    #And User selects "2" from Licenceperiod dropdown
    #And User selects "Doctor" from Occupation dropdown
    Then User clicks "Update User" button to add profile
    And User verify success Message

    Examples: 
      | First Name | Last Name  | Phone Number | Street Address | City      | County | Zipcode |
      | "Grey"     | "Meredith" |   5556667777 | "123 Sloan St" | "Seattle" | "King" |   12345 |

  Scenario: User verify successful update edit profile
    Given User logins in with valid credentials
    And User clicks edit profile tab
    When user input data
      | First Name | Last Name | Phone Number | Street Address | City      | County | ZipCode |
      | "Grey"     | "Mereith" |   5556667777 | "123 Sloan St" | "Seattle" | "King" |   12345 |
    Then User clicks "Update User" button
    And User verify success message
