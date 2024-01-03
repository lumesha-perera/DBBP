Feature: Verify Other Bank Management Page of EPIC DBBP Web
  I want to verify Other Bank Management page
  So that I can perform the activities

  Background:
    Given I open URL as "url_QA"
    Then I enter the username as "ValidUsername"
    And I enter the password as "ValidPassword"
    And I click on the login button
    And I verify home icon
    And I click on Common Configuration icon
    And I click on Other Bank Management icon

  @otherbankregister
  Scenario: Verify successfuly add new bank detail
    Then I click on Common Configuration icon
    And I click on Other Bank Management icon
    And I click on Add button
    And I provide Bank Code as "Bank_Code"
    And I provide Bank Name as "Bank_Name"
    And I verify Status dropdown disable
    And I provide Remarks as "Remarks"
#    And I select Ceft
    And I click on Save button
    And I verify Success message as "Add_Bank_SuccessMsg"
    And I accept the Success message
#    And I search by Bank Code as "Bank_Code"
#    And I click on Search button
#    And I verify the search value as "Bank_Code"



#   @otherbankregister
  Scenario: Verify Reset function in Add interface
    And I click on Add button
    And I provide Bank Code as "Bank_Code"
    And I provide Bank Name as "Bank_Name"
    And I provide Remarks as "Remarks"
    And I select Ceft
    And I click on Reset button in Add
    And I verify Reset the BankCode
    And I verify Reset the BankName
    And I verify Reset the Remark
    And I verify Reset the Ceft

#  @otherbankregister
  Scenario: verify error message for Bank Code in add function
    Then I click on Add button
    And I provide Bank Name as "Bank_Name"
    And I provide Remarks as "Remarks"
    And I select Ceft
    And I verify add button
    And I provide Bank Code as "SpcCharacter"
    And I verify the error message as "Bank_Code_error_msg"
    And I verify add button
    And I provide Bank Code as "BlankValue"
    And I verify the error message as "Bank_Code_error_msg"
    And I verify add button
    And I provide Bank Code as "Character"
    And I verify the error message as "Bank_Code_error_msg"
    And I verify add button

#  @otherbankregister
Scenario: verify error message for Bank Name in add function
    Then I click on Add button
    And I provide Bank Code as "Bank_Code"
    And I provide Remarks as "Remarks"
    And I select Ceft
    And I verify add button
    And I provide blank values for Bank Name
    And I verify the error message for Bank Name as "Bank_Name_error_msg"
    And I verify add button


  #@otherbankregister
  Scenario: verify error message for Remark in add function
    Then I click on Add button
    And I provide Bank Code as "Bank_Code"
    And I provide Bank Name as "Bank_Name"
    And I select Ceft
    And I verify add button
    And I provide blank values for Remarks as
    And I verify the error message for Remarks as "Reset_error_msg"
    And I verify add button


#  @otherbankregister
    Scenario: verify successfuly update a bank detail
      Then I search by Bank Code as "Bank_Code"
      And I click on Search button
      And I verify the search value as "Bank_Code"
      And I click on Edit icon
      And I update Bank Name as "Update_Bank_Name"
      And I update Remarks as "Update_Remarks"
      And I change the Status as "status"
      And I untick Ceft
      And I tick on slip
      And I click on update button
      And I search by Bank Code as "Bank_Code"
      And I click on Search button
      And I verify the search value as "Bank_Code"
      And I verify the search value as "Update_Bank_Name"
      And I verify the search value as "Update_Remarks"
      And I verify the search value as "status"

#  @otherbankregister
  Scenario: verify Reset Function in Update
    Then I search by Bank Code as "Bank_Code"
    And I click on Search button
    And I verify the search value as "Bank_Code"
    And I click on Edit icon
    And I update Bank Name as "Update_Bank_Name"
    And I update Remarks as "Update_Remarks"
    And I change the Status as "status"
    And I untick Ceft
    And I tick on slip
    And I click on Reset button in Update
#    And I verify Reset the BankCode as "Bank_Code"
    And I verify Reset the BankName as "Bank_Name"
    And I verify Reset the Remark in update
    And I verify Reset Status as "status1"
    And I verify Reset the Ceft in update
    And I verify Reset the slip

#    @otherbankregister
  Scenario: verify error message for Bank Name in Update function
      Then I search by Bank Code as "Bank_Code"
      And I click on Search button
      And I verify the search value as "Bank_Code"
      And I click on Edit icon
      And I clear Bank Name
      And I update Remarks as "Update_Remarks"
      And I verify error message as "Bank_Name_error_msg"
      And I verify Update button

#  @otherbankregister
  Scenario: verify Select Status is disabled in Update function
    Then I search by Bank Code as "Bank_Code"
    And I click on Search button
    And I verify the search value as "Bank_Code"
    And I click on Edit icon
    And I verify Select Status is disabled

#        @otherbankregister
  Scenario: verify error message for Reset in Update function
    Then I search by Bank Code as "Bank_Code"
    And I click on Search button
    And I verify the search value as "Bank_Code"
    And I click on Edit icon
    And I pass empty value for Remarks
    And I verify Update Reset error message as "Update_Remarks_error_msg"
    And I verify Update button


#  @otherbankregister
  Scenario: verify successfuly Delete a bank detail
    Then I search by Bank Code as "Bank_Code"
    And I click on Search button
    And I verify the search value as "Bank_Code"
    And I click on Delete icon
    And I verify dialog "Dialog_text"
#    And I verify dialog "Bank_Code"
    And I click on Ok button
#    And I verify dialog "Delete_Message"
    And I search by Bank Code as "Bank_Code"
    And I click on Search button
    And I verify Empty Row


#  @otherbankregister
  Scenario: Search valid Bank Name
    Then I search by Bank_Name as "Bank_Name"
    And I click on Search button
    And I verify the search value as "Bank_Name"

#      @otherbankregister
  Scenario: Search invalid Bank Name
    Then I search by Bank_Name as "Bank_Name_invalid"
    And I click on Search button
    And I verify Empty Row

#  @otherbankregister
  Scenario: Search invalid Bank Code
    Then I search by Bank_Name as "Bank_Code_invalid"
    And I click on Search button
    And I verify Empty Row

#  @otherbankregister
  Scenario: verify Reset function in Search
    Then I search by Status as "status"
    And I click on Search button
    And I verify the Status search value as "status"
    Then I search by Status as "status1"
    And I click on Search button
    And I verify the Status search value as "status1"

#  @otherbankregister
  Scenario: Verify select Select Status in search
    Then I verify select Select Status in search as "Select_Status"

    #  @otherbankregister
  Scenario: Verify Reset function in Search
    Then I search by Bank Code as "Bank_Code"
    And I search by Bank_Name as "Bank_Name"
    And I search by Status as "status"
#    And I click on Search button
#    And I verify the search value as "Bank_Code"
    And I Click on Reset button
    And I verify the Reset Bank Code in Search
    And I verify the Reset Bank Name in Search
    And I verify the Reset Status in Search as "status2"