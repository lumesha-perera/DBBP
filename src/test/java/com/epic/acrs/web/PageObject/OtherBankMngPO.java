package com.epic.acrs.web.PageObject;

import Utility.WebDriverHelper;
import com.epic.acrs.web.PageFactory.DBBPPageFactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class OtherBankMngPO {
    private static OtherBankMngPO otherBankfunction;

    private OtherBankMngPO(){

    }

    public static OtherBankMngPO getotherBankfunctionPO(){
        if(otherBankfunction == null){
            otherBankfunction = new OtherBankMngPO();
        }
        return otherBankfunction;
    }

    public void clickCommonconfiguration(){
        DBBPPageFactory.pf.CommonConfigurationicon.click();
    }
    public void clickOtherBank(){
        DBBPPageFactory.pf.OtherBankicon.click();
    }

    public void clickAdd(){
        DBBPPageFactory.pf.BankAdd.click();

    }

    public void enterBankCode(String bankcode){
        DBBPPageFactory.pf.BankCode.clear();
        DBBPPageFactory.pf.BankCode.sendKeys(bankcode);
    }

    public void enterBankName(String bankname){
        DBBPPageFactory.pf.BankName.clear();
        DBBPPageFactory.pf.BankName.sendKeys(bankname);

    }

    public void enterBlankValueBankname(){
        DBBPPageFactory.pf.BankName.clear();
        DBBPPageFactory.pf.BankName.sendKeys(" ");
    }
    public void enterRemarks(String remark){
        DBBPPageFactory.pf.BankRemark.clear();
        DBBPPageFactory.pf.BankRemark.sendKeys(remark);

    }

    public boolean addDisablestatus(){
        return DBBPPageFactory.pf.AddBankStatus.isEnabled();
    }

    public void verifyAddSuccessMsg(String successMsg){

        assertEquals(successMsg,DBBPPageFactory.pf.AddSuccessmsg.getText());

    }

    public void addSuccessOKBtn(){
        DBBPPageFactory.pf.AddSuccessmsgOkBtn.click();
    }

    public void selectCeft(){
        DBBPPageFactory.pf.BankCeft.click();
    }

    public void clickSave(){
        DBBPPageFactory.pf.BankSave.click();
    }

    public void searchBankCode(String bankcode){
        DBBPPageFactory.pf.SearchBankCode.clear();
        DBBPPageFactory.pf.SearchBankCode.sendKeys(bankcode);
    }
    public void clickSearch(){
        DBBPPageFactory.pf.SearchBtn.click();
    }

    public boolean verifySearchValue(String searchValue) {
        boolean serchResults = false;
        List<WebElement> result = WebDriverHelper.getWebDriver().findElements(By.xpath("//datatable-body-cell[@role='cell' and contains(@class,'datatable-body-cell')]"));
        for (int i = 1; i <= result.size(); i++) {
            String value = WebDriverHelper.getWebDriver().findElement(By.xpath("//datatable-body-cell[@role='cell' and contains(@class,'datatable-body-cell')][" + i + "]")).getText();

            if (value.contains(searchValue)) {
                serchResults = true;
            }
        }
        return serchResults;
    }
    public void clickEditIcon(){
        DBBPPageFactory.pf.Editicon.click();
    }
    public void updateBankName(String bankname){
        DBBPPageFactory.pf.UpdateBankName.clear();
        DBBPPageFactory.pf.UpdateBankName.sendKeys(bankname);

    }

    public void updateRemarks(String remark){
        DBBPPageFactory.pf.UpdateRemark.clear();
        DBBPPageFactory.pf.UpdateRemark.sendKeys(remark);

    }

    public void updateStatus(String status){
        Select Statusdrp = new Select(DBBPPageFactory.pf.UpdateStatus);
        Statusdrp.selectByVisibleText(status);
    }

    public void clickUpdateCeft(){
        DBBPPageFactory.pf.UpdateCeft.click();
    }
    public void clickUpdateSlip(){
        DBBPPageFactory.pf.UpdateSlip.click();
    }
    public void clickUpdateBtn(){
        DBBPPageFactory.pf.UpdateBtn.click();
    }

    //Delete
    public void clickDelete(){
        DBBPPageFactory.pf.DeleteBtn.click();
    }

    public void clickDeleteOkBtn(){
      DBBPPageFactory.pf.DeleteOkBtn.click();

    }

    public void verifyDialog(String searchValue){

        assertEquals(searchValue,DBBPPageFactory.pf.DeleteDialogP1.getText());

    }

    public void clickOKBtn(){
        DBBPPageFactory.pf.DeleteOkBtn.click();
    }

    public boolean emptyRow(){
        return DBBPPageFactory.pf.Emptyrow.isDisplayed();
    }

    public void searchReset(){
        DBBPPageFactory.pf.SearchReset.click();
    }



    public void searchBankName(String Bank_Name){
        DBBPPageFactory.pf.SearchBankName.sendKeys(Bank_Name);
    }

    public void searchStatus(String Status){

            Select Statusdrp = new Select(DBBPPageFactory.pf.SearchStatus);
            Statusdrp.selectByVisibleText(Status);


    }

    public boolean verifySearcStatus(String searchValue) {
        boolean serchResults = false;
        //List<WebElement> result = WebDriverHelper.getWebDriver().findElements(By.xpath("//datatable-body-cell[@role='cell' and contains(@class,'datatable-body-cell')]"));

        String value = WebDriverHelper.getWebDriver().findElement(By.xpath("//datatable-body-cell[@role='cell' and contains(@class,'datatable-body-cell')][4]")).getText();

            if (value.contains(searchValue)) {
                serchResults = true;
            }

        return serchResults;
    }

    //Reset function in Add interface
    public void resetAdd(){
        DBBPPageFactory.pf.ResetAdd.click();

    }
    public boolean resetBankCode(){
        return DBBPPageFactory.pf.BankCode.getText().isEmpty();
    }

    public boolean resetBnakName(){
        return DBBPPageFactory.pf.BankName.getText().isEmpty();

    }

    public boolean resetRemark(){
        return DBBPPageFactory.pf.BankRemark.getText().isEmpty();

    }
    public boolean resetCeft(){
        return DBBPPageFactory.pf.BankCeft.isSelected();
    }

    public void updateReset(){
        DBBPPageFactory.pf.ResetUpdate.click();
    }

    public void resetBankCodeUpdate(String Bankcode){
         assertEquals(Bankcode,DBBPPageFactory.pf.BankCodeUpdate.getText());

    }

    public void resetBankNameUpdate(String Bankname){
        assertEquals(Bankname,DBBPPageFactory.pf.UpdateBankName.getText());
    }

    public void resetStatusUpdate(String status){
        Select Statusdrp = new Select(DBBPPageFactory.pf.UpdateStatus);
        List<WebElement> selectedOptions = Statusdrp.getAllSelectedOptions();
        WebElement element = selectedOptions.get(0);
        assertEquals(status,element.getText());
    }

    public boolean resetRemarkUpdate(){
        return DBBPPageFactory.pf.BankRemark.getText().isEmpty();

    }
    public boolean resetCeftUpdate(){
        return DBBPPageFactory.pf.UpdateCeft.isSelected();
    }

    public boolean resetSlipUpdate(){
        return DBBPPageFactory.pf.UpdateSlip.isSelected();

    }

    public boolean resetBanknameSearch(){
        return DBBPPageFactory.pf.SearchBankName.getText().isEmpty();

    }
    public void resetStatusSearch(String status){
        Select Statusdrp = new Select(DBBPPageFactory.pf.SearchStatus);
        List<WebElement> selectedOptions = Statusdrp.getAllSelectedOptions();
        WebElement element = selectedOptions.get(0);
        assertEquals(status,element.getText());

    }
    public boolean resetbankcodesearch(){
        return DBBPPageFactory.pf.SearchBankCode.getText().isEmpty();
    }

    public void addBankCodeErrorMsg(String errormsg){

        assertEquals(errormsg,DBBPPageFactory.pf.AddBankCodeErrormsg.getText());
    }

    public boolean addDisableButton(){
        return DBBPPageFactory.pf.AddDisable.isDisplayed();
    }

    public void addBankNameErrorMsg(String errormsg){

        assertEquals(errormsg,DBBPPageFactory.pf.AddBankNameErrormsg.getText());
    }

    public void addRemarksErrorMsg(String errormsg){
        assertEquals(errormsg,DBBPPageFactory.pf.AddRemarksErrormsg.getText());

    }

    public void addBlankValuesRemarks(){
        DBBPPageFactory.pf.BankRemark.sendKeys(" ");
    }

    public void updateBankNameClear(){
        DBBPPageFactory.pf.UpdateBankName.clear();
        //DBBPPageFactory.pf.UpdateBankName.sendKeys(" ");
        DBBPPageFactory.pf.UpdateBankName.sendKeys(" ");
    }

    public void updateBankNameErrorMsg(String errormsg){

        assertEquals(errormsg,DBBPPageFactory.pf.UpdateBankNameErrormsg.getText());
    }

    public boolean updateDisableButton(){
        return DBBPPageFactory.pf.UpdateDisable.isDisplayed();
    }

    public void searchStatusValidation(String status){
        Select Statusdrp = new Select(DBBPPageFactory.pf.SearchStatus);
        Statusdrp.selectByVisibleText(status);
        WebElement text= Statusdrp.getFirstSelectedOption();
        assertEquals(status,text.getText());
    }
    public void updateStatusValidation() {
        Select Statusdrp = new Select(DBBPPageFactory.pf.UpdateStatus);
        assertThat(Statusdrp.getOptions().get(0).isEnabled(), is(false));
    }


    public void updateEmptyReset(){
        DBBPPageFactory.pf.UpdateRemark. sendKeys(" ");
        //DBBPPageFactory.pf.UpdateRemark.clear();
    }

    public void updateReseterrorMsg(String msg){

        assertEquals(msg,DBBPPageFactory.pf.Update_Reset_Errormsg.getText());
    }
}
