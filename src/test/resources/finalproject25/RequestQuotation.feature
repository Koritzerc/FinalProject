Feature: Request Quotation Functionalities

  Background: User is logged in Insurance Page

  Scenario: Verify User able to save quotation
    Given User navigates to Request Quotation Page
    Then User verify "Request a quotation" dislayed

  Scenario Outline: Verify User able to select Break Down Cover dropdown
    Given User clicks on <Breakdowncover>
    Then User verify options from dropdown

    Examples: 
      | Breakdowncover |
      | No cover       |
      | Roadside       |
      | At home        |
      | European       |

  Scenario: User clicks on Winscreenrepair checkbox functionality
    Given User clicks on yes button | click "YES"

  Scenario Outline: Verify User able to input data
    When User inputs data <incidents>, <Registration>, <Annual Mileage>, <Estimated Value>
      | incidents | Registration | Annual mileage | Estimated Value |
      |         0 | ABC123       |         50,000 |          10,000 |

  Scenario Outline: Verify User able to select Parking Location dropdown
    Given User clicks on <Parking Location>
    Then User verify options from dropdown

    Examples: 
      | Parking Location |
      | Select           |
      | Driveway/Carport |
      | Locked Garage    |
      | Public Place     |
      | Private Property |
      | Street/Road      |
      | Unlocked Garage  |

  Scenario Outline: Verify User able to select Start of policy dropdown
    Given User clicks on <year>, <month>, <day>
    Then User verify options from dropdown

    Examples: 
      | year | month     | day |
      | 2014 | January   |   1 |
      | 2015 | February  |   2 |
      | 2016 | March     |   3 |
      | 2017 | April     |   4 |
      | 2018 | May       |   5 |
      | 2019 | June      |   6 |
      | 2020 | July      |   7 |
      | 2021 | August    |   8 |
      | 2022 | September |   9 |
      | 2023 | October   |  10 |
      | 2024 | November  |  11 |
      | 2025 | December  |  12 |
      
      Scenario: User clicks on save quotation button
      When User clicks on save quotation button | clicks "Save Quotation"
      Then User verify success message "You have saved this quotation!"
