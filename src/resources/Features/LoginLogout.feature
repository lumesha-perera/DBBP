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
#  @LoginLogoutPage @SuccessfulLogin
#  Scenario: Verify successful login enter valid username and password in acrs web portal
#    When I select the institute as "Institute"
#    Then I enter the username as "ValidUsername"
#    And I enter the password as "ValidPassword"
#    And I click on the login button
#    And I verify home icon
#    And I click on the logout icon
#
#    @LoginLogoutPage @UnsuccessfulLogin
#      Scenario: Verify unsuccessful login enter invalid username and password in acrs web portal
#      When I select the institute as "Institute"
#      Then I enter the username as "inValidUsername"
#      And I enter the password as "inValidPassword"
#      And I click on the login button
#      And I verify error message as "invalidCredentials"
#
#      @LoginLogoutPage @InvalidusernameandValidpassword
#        Scenario: Verify Unsuccesssful login enter invalid username and valid password in acrs web portal
#        When I select the institute as "Institute"
#        Then I enter the username as "inValidUsername"
#        And I enter the password as "ValidPassword"
#        And I click on the login button
#        And I verify error message as "invalidCredentials"
#
#        @LoginLogoutPage @ValidusernameandInvalidpassword
#          Scenario: Verify Unsuccessful login enter valid userame and invalid password in acrs web portal
#          When I select the institute as "Institute"
#          Then I enter the username as "ValidUsername"
#          And I enter the password as "inValidPassword"
#          And I click on the login button
#          And I verify error message as "invalidCredentials"
#
#        @LoginLogoutPage @emptyusernameandemptypassword
#         Scenario: Verify Unsuccessful login enter empty username and empty password in acrs web portal
#         When I select the institute as "Institute"
#         Then I enter the username as "emptyUsername"
#         And I enter the password as "emptyPassword"
#         And I click on the login button
#         And I verify the error message as "enterUsernameAndPasswordError"
#
#          @LoginLogoutPage @validusernameandemptypassword
#            Scenario: Verify Unsuccessful login enter valid username and empty password in acrs web portal
#            When I select the institute as "Institute"
#            Then I enter the username as "ValidUsername"
#            And I enter the password as "emptyPassword"
#            And I click on the login button
#            And I verify the error message as "entervalidpassword"
#
#  @LoginLogoutPage @emptyusernameandvalidpassword
#  Scenario: Verify Unsuccessful login enter empty username and valid password in acrs web portal
#    When I select the institute as "Institute"
#    Then I enter the username as "emptyUsername"
#    And I enter the password as "ValidPassword"
#    And I click on the login button
#    And I verify the error message as "entervalidusername"
#
