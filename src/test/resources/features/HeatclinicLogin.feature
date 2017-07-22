Feature: Heatclinic e-commerce Login Functionality
  Background:
    Given As a not validated user
    When Browse to the url "http://heatclinic.shiftedtech.com/"
    Then Heatclinic home page should show
    When User click login button

  @debug
  @smoke
  Scenario: 1. Valid user valid password
    And Enter "iivaan@shiftedtech.com" as email address
    And Enter "shiftedtech" as password
    And Click login
    Then Welcome message shows "Iftekhar"

  @smoke
  Scenario: 2. InValid user valid password
    And Enter "iivaanXXX@shiftedtech.com" as email address
    And Enter "shiftedtech" as password
    And Click login
    Then Error Message should display

  @smoke
  Scenario: 3. InValid user invalid password
    And Login with user "iivaanXXX@shiftedtech.com" and password "invalid"
    Then Error Message should display

  Scenario Outline: 4. Valid user valid password
    And Enter "<emailaddress>" as email address
    And Enter "<password>" as password
    And Click login
    Then Welcome message shows "<username>"
    Examples:
      |emailaddress            |password        |username|
      |iivaan@shiftedtech.com  |shiftedtech     |Iftekhar|
      |shagor77@gmail.com      |shagor          |ben     |