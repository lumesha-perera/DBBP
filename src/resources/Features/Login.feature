Feature: Verify Login Page of EPIC DBBP Web
  I want to verify login page
  So that I can perform the activities

  Background:
    Given I open URL as "url_QA"
  @Login
  Scenario: Verify successful login enter valid username and password in DBBP web
    Then I enter the username as "ValidUsername"
    And I enter the password as "ValidPassword"
    And I click on the login button
    And I verify home icon

  @FailLogin
  Scenario: Verify invalid login enter invalid username and password in DBBP web
    Then I enter the username as "inValidUsername"
    And I enter the password as "inValidPassword"
    And I click on the login button
    And I verify header