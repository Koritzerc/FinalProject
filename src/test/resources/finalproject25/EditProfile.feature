Feature: Insurance User Information

Scenario: User can Edit Profile information

Given User navigates to insurance website
When User logs into home page
And User clicks on Edit Profile tab
And User selects "Ms" from Title dropdown
And User enters "Grey" in Surname textfield
And User enters "Meredith" in Firstname textfield
And User enters "5556667777" in Phone textfield
And User selects "1978" as year from DOB dropdown
And User selects "October" as month from DOB dropdown
And User selects "25" as day from DOB dropdown
And User selects "Full" option as Licencetype 
And User selects "2" from Licenceperiod dropdown
And User selects "Doctor" from Occupation dropdown
And User enters "123 Sloan St" in Street textfield
And User enters "Seattle" in City textfield
And User enters "King" in County textfield
And User enters "12345" in Postcode textfield
Then User clicks Update User button to add profile


