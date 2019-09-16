
@regression @smoke
Feature: AddCustomer flow

 Background:
   # Given User should be in the telecom home page
    And user click on add customer button


  @smoke @karthi @sanity @test
  Scenario: 
   When user enters all the fields with valid data
   And user clicks on submit button
   Then user should be displayed customer id is generated
 

  Scenario: 
   
    When user enters all the field  with valid data
     | karthi | rajan | rajan@gmail.com | chennai | 1234567777 |
    And user clicks on submit button
   Then user should be displayed customer id is generated
 

  Scenario: 
    When user enters all the fieldsss  with valid data
      | fname    | lname | mail            | address | phno       |
      | karthi   | rajan | rajan@gmail.com | chennai | 1234567777 |
      | soundar  | rajan | sr@gmail.com    | trichy  | 1234567777 |
      | ajith    | rajan | ar@gmail.com    | madurai | 1234567777 |
      | vasantha | rajan | vr@gmail.com    | tanjore | 1234567777 |
    And user clicks on submit button
   Then user should be displayed customer id is generated

  Scenario Outline: 
    When user enters all the fieldsss  with valid data"<fname>","<lname>","<mail>","<address>","<phno>"
    And user clicks on submit button
    Then user should be displayed customer id is generated

    Examples: 
      | fname    | lname | mail            | address | phno       |
      | karthi   | rajan | rajan@gmail.com | chennai | 1234567777 |
      | soundar  | rajan | sr@gmail.com    | trichy  | 1234567777 |
      | ajith    | rajan | ar@gmail.com    | madurai | 1234567777 |
      | vasantha | rajan | vr@gmail.com    | tanjore | 1234567777 |
