Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page
    And user clicks on project
    Then user is navigated to project page
    And user clicks on profile
    Then user is to navigated to profile
    And user clicks on Signout
    Then user is on signout page
    And user signout from GitHub 

    Examples: 
      | username                | password    |
      | sachinban5234@gmail.com | DecJan@2425 |
