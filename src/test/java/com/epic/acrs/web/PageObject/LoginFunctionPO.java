package com.epic.acrs.web.PageObject;

import Utility.WebDriverHelper;
import com.epic.acrs.web.PageFactory.ACRSPageFactory;
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
        ACRSPageFactory.pf.Username.clear();
        ACRSPageFactory.pf.Username.sendKeys(username);
    }

    public void enterPassword(String password){
        ACRSPageFactory.pf.Password.clear();
        ACRSPageFactory.pf.Password.sendKeys(password);
    }

        public void clickLoginBtn(){
        ACRSPageFactory.pf.LoginBtn.click();
    }

        public boolean verifyWelcomeTxt(){
        return ACRSPageFactory.pf.WelcomTxt.isDisplayed();
    }

        public boolean verifyHeaderTxt(){
        return ACRSPageFactory.pf.Headertxt.isDisplayed();

    }



}
