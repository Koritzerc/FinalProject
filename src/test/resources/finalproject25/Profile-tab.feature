Feature: Profile tab
  @Profile
  Scenario Outline: USer is able to verify the information on the Profile tab is accurate
    Given the User is logged in 
    And the User entered the proper credentials
    When clicks on the Profile tab
    And the screen comes up 
    Then the User is able to see the Title
    And the User is able to see the <Firstname>
    And the User is able to see the <Surname>
    And the User is able to see the <Phone>
    And the User is able to see the <Dateofbirth>
    And the User is able to see the <License type>
    And the User is able to see the <License period>
    And the User is able to see the <Occupation>
    And the User is able to see the <Driver History>
    And the User is able to see the <ADDRESS>
    And checks for the <name> and <value> paris are entered
  Examples: 
      | name          | value            |
      | Firstname     | "John"           |
      | Surname       |   "Cena"         |
			| Phone         | 7037778948       |
      | Dateofbirth   |  04011990        |
      | License type  |"Drivers License "|
      | License period| 7                |
      | Occupation    |"SDET"            |
      | Driver History|7                 |
      | ADDRESS       |"dolly drive"     |
     
 #ouail
  #ouail
   #ouail
  