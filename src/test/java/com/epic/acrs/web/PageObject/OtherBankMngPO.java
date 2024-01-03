package com.epic.acrs.web.PageObject;

import Utility.WebDriverHelper;
import com.epic.acrs.web.PageFactory.ACRSPageFactory;

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
        ACRSPageFactory.pf.CommonConfigurationicon.click();
    }
    public void clickOtherBank(){
        ACRSPageFactory.pf.OtherBankicon.click();
    }

    public void clickAdd(){
        ACRSPageFactory.pf.BankAdd.click();

    }

    public void enterBankCode(String bankcode){
        ACRSPageFactory.pf.BankCode.clear();
        ACRSPageFactory.pf.BankCode.sendKeys(bankcode);
    }

    public void enterBankName(String bankname){
        ACRSPageFactory.pf.BankName.clear();
        ACRSPageFactory.pf.BankName.sendKeys(bankname);

    }

    public void enterBlankValueBankname(){
        ACRSPageFactory.pf.BankName.clear();
        ACRSPageFactory.pf.BankName.sendKeys(" ");
    }
    public void enterRemarks(String remark){
        ACRSPageFactory.pf.BankRemark.clear();
        ACRSPageFactory.pf.BankRemark.sendKeys(remark);

    }

    public boolean addDisablestatus(){
        return ACRSPageFactory.pf.AddBankStatus.isEnabled();
    }

    public void verifyAddSuccessMsg(String successMsg){

        assertEquals(successMsg,ACRSPageFactory.pf.AddSuccessmsg.getText());

    }

    public void addSuccessOKBtn(){
        ACRSPageFactory.pf.AddSuccessmsgOkBtn.click();
    }

    public void selectCeft(){
        ACRSPageFactory.pf.BankCeft.click();
    }

    public void clickSave(){
        ACRSPageFactory.pf.BankSave.click();
    }

    public void searchBankCode(String bankcode){
        ACRSPageFactory.pf.SearchBankCode.clear();
        ACRSPageFactory.pf.SearchBankCode.sendKeys(bankcode);
    }
    public void clickSearch(){
        ACRSPageFactory.pf.SearchBtn.click();
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
        ACRSPageFactory.pf.Editicon.click();
    }
    public void updateBankName(String bankname){
        ACRSPageFactory.pf.UpdateBankName.clear();
        ACRSPageFactory.pf.UpdateBankName.sendKeys(bankname);

    }

    public void updateRemarks(String remark){
        ACRSPageFactory.pf.UpdateRemark.clear();
        ACRSPageFactory.pf.UpdateRemark.sendKeys(remark);

    }

    public void updateStatus(String status){
        Select Statusdrp = new Select(ACRSPageFactory.pf.UpdateStatus);
        Statusdrp.selectByVisibleText(status);
    }

    public void clickUpdateCeft(){
        ACRSPageFactory.pf.UpdateCeft.click();
    }
    public void clickUpdateSlip(){
        ACRSPageFactory.pf.UpdateSlip.click();
    }
    public void clickUpdateBtn(){
        ACRSPageFactory.pf.UpdateBtn.click();
    }

    //Delete
    public void clickDelete(){
        ACRSPageFactory.pf.DeleteBtn.click();
    }

    public void clickDeleteOkBtn(){
      ACRSPageFactory.pf.DeleteOkBtn.click();

    }

    public void verifyDialog(String searchValue){

        assertEquals(searchValue,ACRSPageFactory.pf.DeleteDialogP1.getText());

    }

    public void clickOKBtn(){
        ACRSPageFactory.pf.DeleteOkBtn.click();
    }

    public boolean emptyRow(){
        return ACRSPageFactory.pf.Emptyrow.isDisplayed();
    }

    public void searchReset(){
        ACRSPageFactory.pf.SearchReset.click();
    }



    public void searchBankName(String Bank_Name){
        ACRSPageFactory.pf.SearchBankName.sendKeys(Bank_Name);
    }

    public void searchStatus(String Status){

            Select Statusdrp = new Select(ACRSPageFactory.pf.SearchStatus);
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
        ACRSPageFactory.pf.ResetAdd.click();

    }
    public boolean resetBankCode(){
        return ACRSPageFactory.pf.BankCode.getText().isEmpty();
    }

    public boolean resetBnakName(){
        return ACRSPageFactory.pf.BankName.getText().isEmpty();

    }

    public boolean resetRemark(){
        return ACRSPageFactory.pf.BankRemark.getText().isEmpty();

    }
    public boolean resetCeft(){
        return ACRSPageFactory.pf.BankCeft.isSelected();
    }

    public void updateReset(){
        ACRSPageFactory.pf.ResetUpdate.click();
    }

    public void resetBankCodeUpdate(String Bankcode){
         assertEquals(Bankcode,ACRSPageFactory.pf.BankCodeUpdate.getText());

    }

    public void resetBankNameUpdate(String Bankname){
        assertEquals(Bankname,ACRSPageFactory.pf.UpdateBankName.getText());
    }

    public void resetStatusUpdate(String status){
        Select Statusdrp = new Select(ACRSPageFactory.pf.UpdateStatus);
        List<WebElement> selectedOptions = Statusdrp.getAllSelectedOptions();
        WebElement element = selectedOptions.get(0);
        assertEquals(status,element.getText());
    }

    public boolean resetRemarkUpdate(){
        return ACRSPageFactory.pf.BankRemark.getText().isEmpty();

    }
    public boolean resetCeftUpdate(){
        return ACRSPageFactory.pf.UpdateCeft.isSelected();
    }

    public boolean resetSlipUpdate(){
        return ACRSPageFactory.pf.UpdateSlip.isSelected();

    }

    public boolean resetBanknameSearch(){
        return ACRSPageFactory.pf.SearchBankName.getText().isEmpty();

    }
    public void resetStatusSearch(String status){
        Select Statusdrp = new Select(ACRSPageFactory.pf.SearchStatus);
        List<WebElement> selectedOptions = Statusdrp.getAllSelectedOptions();
        WebElement element = selectedOptions.get(0);
        assertEquals(status,element.getText());

    }
    public boolean resetbankcodesearch(){
        return ACRSPageFactory.pf.SearchBankCode.getText().isEmpty();
    }

    public void addBankCodeErrorMsg(String errormsg){

        assertEquals(errormsg,ACRSPageFactory.pf.AddBankCodeErrormsg.getText());
    }

    public boolean addDisableButton(){
        return ACRSPageFactory.pf.AddDisable.isDisplayed();
    }

    public void addBankNameErrorMsg(String errormsg){

        assertEquals(errormsg,ACRSPageFactory.pf.AddBankNameErrormsg.getText());
    }

    public void addRemarksErrorMsg(String errormsg){
        assertEquals(errormsg,ACRSPageFactory.pf.AddRemarksErrormsg.getText());

    }

    public void addBlankValuesRemarks(){
        ACRSPageFactory.pf.BankRemark.sendKeys(" ");
    }

    public void updateBankNameClear(){
        ACRSPageFactory.pf.UpdateBankName.clear();
        //ACRSPageFactory.pf.UpdateBankName.sendKeys(" ");
        ACRSPageFactory.pf.UpdateBankName.sendKeys(" ");
    }

    public void updateBankNameErrorMsg(String errormsg){

        assertEquals(errormsg,ACRSPageFactory.pf.UpdateBankNameErrormsg.getText());
    }

    public boolean updateDisableButton(){
        return ACRSPageFactory.pf.UpdateDisable.isDisplayed();
    }

    public void searchStatusValidation(String status){
        Select Statusdrp = new Select(ACRSPageFactory.pf.SearchStatus);
        Statusdrp.selectByVisibleText(status);
        WebElement text= Statusdrp.getFirstSelectedOption();
        assertEquals(status,text.getText());
    }
    public void updateStatusValidation() {
        Select Statusdrp = new Select(ACRSPageFactory.pf.UpdateStatus);
        assertThat(Statusdrp.getOptions().get(0).isEnabled(), is(false));
    }


    public void updateEmptyReset(){
        ACRSPageFactory.pf.UpdateRemark. sendKeys(" ");
        //ACRSPageFactory.pf.UpdateRemark.clear();
    }

    public void updateReseterrorMsg(String msg){

        assertEquals(msg,ACRSPageFactory.pf.Update_Reset_Errormsg.getText());
    }
}
