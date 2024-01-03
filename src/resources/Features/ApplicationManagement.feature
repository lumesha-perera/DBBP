##Author: isuru_j
##Feature : Verify Login Page of EPIC ACRS Web Portal
##Scenario: Verify Login Page of EPIC ACRS Web Portal
#Feature: Verify Login Page of EPIC ACRS Web Portal
#  I want to verify login page
#  So that I can perform the activities
#
#  Background:
#    Given I open URL as "url_QA"
#
#  @ApplicationManagementPage @SuccessfulLogin
#  Scenario: Verify successful login enter valid username and password in acrs web portal
#    When I select the institute as "Institute"
#    Then I enter the username as "ValidUsername"
#    And I enter the password as "ValidPassword"
#    And I click on the login button
#    And I verify home icon
#
#    @ApplicationManagementPage @Createapplication
#      Scenario: Verify successful create application enter valid details
#      When I click the create application button
#      Then I enter Application Code as "Validcode"
#      And  I enter Description as "Validdescription"
#      And I enter Sort Key as "Validsortkey"
#      And I select Status as "Active"
#      And I enter icon as "Validicon"
#      And I click the add button
#      And I verify Successful message as "validmessage"
#
