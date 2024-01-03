package com.epic.acrs.web.StepDefinition;

import Utility.PropertyFileHandler;
import com.epic.acrs.web.PageObject.LoginFunctionPO;
import com.epic.acrs.web.PageObject.OtherBankMngPO;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OtherBankMngSD {

    @Then("I click on Common Configuration icon")
    public void i_click_on_common_configuration_icon() throws InterruptedException {
        Thread.sleep(2000);
        OtherBankMngPO.getotherBankfunctionPO().clickCommonconfiguration();

    }
    @Then("I click on Other Bank Management icon")
    public void i_click_on_other_bank_management_icon() throws InterruptedException{
        Thread.sleep(2000);
        OtherBankMngPO.getotherBankfunctionPO().clickOtherBank();
    }
    @Then("I click on Add button")
    public void i_click_on_add_button() throws InterruptedException{
        Thread.sleep(2000);
        OtherBankMngPO.getotherBankfunctionPO().clickAdd();
    }
    //(PropertyFileHandler.readProperty(username)
    @Then("I provide Bank Code as {string}")
    public void i_provide_bank_code_as(String Bank_Code) throws InterruptedException{
        Thread.sleep(2000);
        OtherBankMngPO.getotherBankfunctionPO().enterBankCode(PropertyFileHandler.readProperty(Bank_Code));
    }
    @Then("I provide Bank Name as {string}")
    public void i_provide_bank_name_as(String Bank_Name) throws InterruptedException{
        Thread.sleep(2000);
        OtherBankMngPO.getotherBankfunctionPO().enterBankName(PropertyFileHandler.readProperty(Bank_Name));
    }
    @Then("I provide Remarks as {string}")
    public void i_provide_remarks_as(String Remarks) throws InterruptedException{
        Thread.sleep(2000);
        OtherBankMngPO.getotherBankfunctionPO().enterRemarks(PropertyFileHandler.readProperty(Remarks));
    }
    @Then("I select Ceft")
    public void i_select_ceft() throws InterruptedException{
        Thread.sleep(2000);
        OtherBankMngPO.getotherBankfunctionPO().selectCeft();
    }
    @Then("I click on Save button")
    public void i_click_on_save_button() throws InterruptedException{
        Thread.sleep(1000);
        OtherBankMngPO.getotherBankfunctionPO().clickSave();
        Thread.sleep(10000);
    }

    @Then("I search by Bank Code as {string}")
    public void i_search_by_bank_code_as(String Bank_Code) throws InterruptedException {
        Thread.sleep(2000);
        OtherBankMngPO.getotherBankfunctionPO().searchBankCode(PropertyFileHandler.readProperty(Bank_Code));
    }

    @Then("I click on Search button")
    public void i_click_on_search_button() throws InterruptedException{
        Thread.sleep(1000);
        OtherBankMngPO.getotherBankfunctionPO().clickSearch();
    }

    @Then("I verify the search value as {string}")
    public void i_verify_the_search_value_as(String Searchvalue) throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().verifySearchValue(PropertyFileHandler.readProperty(Searchvalue));
    }

    //Update

    @Then("I click on Edit icon")
    public void i_click_on_edit_icon() throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().clickEditIcon();
    }

    @Then("I update Bank Name as {string}")
    public void i_update_bank_name_as(String Update_Bank_Name) throws InterruptedException{
        Thread.sleep(15000);
        OtherBankMngPO.getotherBankfunctionPO().updateBankName(PropertyFileHandler.readProperty(Update_Bank_Name));
    }

    @Then("I update Remarks as {string}")
    public void i_update_remarks_as(String Update_Remarks) throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().updateRemarks(PropertyFileHandler.readProperty(Update_Remarks));
    }


    @Then("I change the Status as {string}")
    public void i_change_the_status(String status) throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().updateStatus(PropertyFileHandler.readProperty(status));
    }

    @Then("I untick Ceft")
    public void i_untick_ceft() throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().clickUpdateCeft();
    }


    @Then("I tick on slip")
    public void i_tick_on_slip() throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().clickUpdateSlip();
    }

    @Then("I click on update button")
    public void i_click_on_update_button() throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().clickUpdateBtn();
        Thread.sleep(5000);
    }

    //Delete
    @Then("I click on Delete icon")
    public void i_click_on_delete_icon() throws InterruptedException {
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().clickDelete();
        Thread.sleep(2000);

    }
    @Then("I verify dialog {string}")
    public void i_verify_dialog(String Searchvalue) throws InterruptedException {
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().verifyDialog(PropertyFileHandler.readProperty(Searchvalue));

    }
    @Then("I click on Ok button")
    public void i_click_on_ok_button() throws InterruptedException {
        Thread.sleep(1000);
        OtherBankMngPO.getotherBankfunctionPO().clickDeleteOkBtn();
        Thread.sleep(3000);
    }
    @Then("I verify Empty Row")
    public void i_verify_empty_row() throws InterruptedException{
        Thread.sleep(10000);
        assertTrue(OtherBankMngPO.getotherBankfunctionPO().emptyRow());
    }
    @Then("I Click on Reset button")
    public void i_click_on_reset_button() throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().searchReset();

    }
    @Then("I verify the Reset")
    public void i_verify_the_reset() throws InterruptedException{
        Thread.sleep(10000);
        assertTrue(OtherBankMngPO.getotherBankfunctionPO().resetbankcodesearch());

    }

    @Then("I search by Bank_Name as {string}")
    public void i_search_by_bank_name_as(String Bank_Name) throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().searchBankName(PropertyFileHandler.readProperty(Bank_Name));

    }

    @Then("I search by Status as {string}")
    public void i_search_by_status_as(String status) throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().searchStatus(PropertyFileHandler.readProperty(status));

    }
    @Then("I verify the Status search value as {string}")
    public void i_verify_the_status_search_value_as(String status) throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().verifySearcStatus(PropertyFileHandler.readProperty(status));

    }
    @Then("I click on Reset button in Add")
    public void i_click_on_reset_button_in_add() throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().resetAdd();
    }

    @Then("I verify Reset the BankCode")
    public void i_verify_reset_the_bank_code() throws InterruptedException{
        Thread.sleep(10000);
        assertTrue(OtherBankMngPO.getotherBankfunctionPO().resetBankCode());

    }
    @Then("I verify Reset the BankName")
    public void i_verify_reset_the_bank_name() throws InterruptedException{
        Thread.sleep(10000);
        assertTrue(OtherBankMngPO.getotherBankfunctionPO().resetBnakName());
    }
    @Then("I verify Reset the Remark")
    public void i_verify_reset_the_remark() throws InterruptedException{
        Thread.sleep(10000);
        assertTrue(OtherBankMngPO.getotherBankfunctionPO().resetRemark());
    }
    @Then("I verify Reset the Ceft")
    public void i_verify_reset_the_ceft() throws InterruptedException{
        Thread.sleep(10000);
        assertFalse(OtherBankMngPO.getotherBankfunctionPO().resetCeft());
    }

    @Then("I click on Reset button in Update")
    public void i_click_on_reset_button_in_update() throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().updateReset();

    }
    @Then("I verify Reset the BankCode as {string}")
    public void i_verify_reset_the_bank_code_as(String Bankcode) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().resetBankCodeUpdate(PropertyFileHandler.readProperty(Bankcode));
    }
    @Then("I verify Reset the BankName as {string}")
    public void i_verify_reset_the_bank_name_as(String Bankname) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().resetBankNameUpdate(PropertyFileHandler.readProperty(Bankname));
    }
    @Then("I verify Reset the Remark in update")
    public void i_verify_reset_the_remark_in_update() throws InterruptedException{
        Thread.sleep(5000);
        assertTrue(OtherBankMngPO.getotherBankfunctionPO().resetRemarkUpdate());
    }
    @Then("I verify Reset Status as {string}")
    public void i_verify_reset_status_as(String status1) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().resetStatusUpdate(PropertyFileHandler.readProperty(status1));
    }
    @Then("I verify Reset the Ceft in update")
    public void i_verify_reset_the_ceft_in_update() throws InterruptedException{
        Thread.sleep(5000);
        assertTrue(OtherBankMngPO.getotherBankfunctionPO().resetCeftUpdate());
    }
    @Then("I verify Reset the slip")
    public void i_verify_reset_the_slip()throws InterruptedException{
        Thread.sleep(5000);
        assertFalse(OtherBankMngPO.getotherBankfunctionPO().resetSlipUpdate());
    }

    @Then("I verify the Reset Bank Code in Search")
    public void i_verify_the_reset_bank_code_in_search() throws InterruptedException{
        Thread.sleep(5000);
        assertTrue(OtherBankMngPO.getotherBankfunctionPO().resetbankcodesearch());
    }
    @Then("I verify the Reset Bank Name in Search")
    public void i_verify_the_reset_bank_name_in_search() throws InterruptedException{
        Thread.sleep(5000);
        assertTrue(OtherBankMngPO.getotherBankfunctionPO().resetBanknameSearch());
    }
    @Then("I verify the Reset Status in Search as {string}")
    public void i_verify_the_reset_status_in_search_as(String status2) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().resetStatusSearch(PropertyFileHandler.readProperty(status2));
    }

    @Then("I verify the error message as {string}")
    public void i_verify_the_error_message_as(String errormsg) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().addBankCodeErrorMsg(PropertyFileHandler.readProperty(errormsg));
    }
    @Then("I verify add button")
    public void i_verify_add_button() throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().addDisableButton();

    }

    @Then("I verify the error message for Bank Name as {string}")
    public void i_verify_the_error_message_for_bank_name_as(String Bank_Name_error_msg) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().addBankNameErrorMsg(PropertyFileHandler.readProperty(Bank_Name_error_msg));

    }

    @Then("I provide blank values for Bank Name")
    public void i_provide_blank_values_for_bank_name() throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().enterBlankValueBankname();
    }

    @Then("I provide blank values for Bank Name as {string}")
    public void i_provide_blank_values_for_bank_name_as(String blnakvalue) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().enterBankName(blnakvalue);

    }

    @Then("I provide blank values for Remarks as")
    public void i_provide_blank_values_for_remarks_as() throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().addBlankValuesRemarks();
    }

    @Then("I verify the error message for Remarks as {string}")
    public void i_verify_the_error_message_for_remarks_as(String errormsg) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().addRemarksErrorMsg(PropertyFileHandler.readProperty(errormsg));
    }

    @Then("I clear Bank Name")
    public void i_clear_bank_name() throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().updateBankNameClear();
    }
    @Then("I verify error message as {string}")
    public void i_verify_error_message_as(String errormsg) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().updateBankNameErrorMsg(PropertyFileHandler.readProperty(errormsg));

    }
    @Then("I verify Update button")
    public void i_verify_update_button() throws InterruptedException{
        Thread.sleep(10000);
        OtherBankMngPO.getotherBankfunctionPO().updateDisableButton();

    }

    @Then("I verify Select Status is disabled")
    public void i_verify_select_status_is_disabled() throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().updateStatusValidation();

    }


    @Then("I pass empty value for Remarks")
    public void i_pass_empty_value_for_remarks() throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().updateEmptyReset();
    }


    @Then("I verify Update Reset error message as {string}")
    public void i_verify_update_reset_error_message_as(String Update_Remarks_error_msg) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().updateReseterrorMsg(PropertyFileHandler.readProperty(Update_Remarks_error_msg));

    }

    @Then("I verify select Select Status in search as {string}")
    public void i_verify_select_select_status_in_search_as(String Select_Status) throws InterruptedException{
        Thread.sleep(5000);
        OtherBankMngPO.getotherBankfunctionPO().searchStatusValidation(PropertyFileHandler.readProperty(Select_Status));
    }
}
