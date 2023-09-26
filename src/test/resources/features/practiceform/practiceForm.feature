Feature: fill out form in four steps to create user.
    as a choucair customer
    I need to fill out the form in four steps.
    to validate the creation of a user in my application

  Scenario Outline: Fill a user registration form using correct fields
    Given the user is on landing page of uTest
    When him browse to registration form
    And filled out the Tell us about yourself section on the form with the data provided
    |birthMonth|<birthMonth>|
    |birthDay|<birthDay>|
    |birthYear|<birthYear>|
    |city|<city>|
    |zip|<zip>|
    |country|<country>|
    |password|<password>|
    And filled out the Add your address section on the form with the data provided
    And filled out the Tell us about your devices section on the form
    And filled out the The last step section on the form with the data provided
    And browse the page and search for the user
    Then the user will see a registration information
  Examples:
   |birthMonth |birthDay |birthYear |city    |zip  |country |password    |
   |January    |3        |2005      |Medellín|1500 |Colombia|Juanda1234! |

