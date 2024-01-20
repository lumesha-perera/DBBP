package com.epic.acrs.web.PageObject;

import Utility.WebDriverHelper;
import com.epic.acrs.web.PageFactory.DBBPPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LoginFunctionPO {
    private static LoginFunctionPO loginFunction;

    private LoginFunctionPO() {
    }

    public static LoginFunctionPO getloginFunctionPO() {
        if (loginFunction == null) {
            loginFunction = new LoginFunctionPO();
        }
        return loginFunction;
    }
    public void enterUsername(String username){
        DBBPPageFactory.pf.Username.clear();
        DBBPPageFactory.pf.Username.sendKeys(username);
    }

    public void enterPassword(String password){
        DBBPPageFactory.pf.Password.clear();
        DBBPPageFactory.pf.Password.sendKeys(password);
    }

        public void clickLoginBtn(){
        DBBPPageFactory.pf.LoginBtn.click();
    }

        public boolean verifyWelcomeTxt(){
        return DBBPPageFactory.pf.WelcomTxt.isDisplayed();
    }

        public boolean verifyHeaderTxt(){
        return DBBPPageFactory.pf.Headertxt.isDisplayed();

    }



}
