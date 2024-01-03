package com.epic.acrs.web.StepDefinition;
import Utility.WebDriverHelper;
import Utility.PropertyFileHandler;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.epic.acrs.web.PageObject.CommonFunctionPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonFunctionStepDefinition {

//    @Given("^I open URL as \"([^\"]*)\"$")
//    public void I_open_URL_as(String url) throws Throwable {
//        WebDriverHelper.getWebDriverHelper().enterUrl(PropertyFileHandler.readProperty(url));
//    }
////
//    @When("^I select the institute as \"([^\"]*)\"$")
//    public void I_select_the_institute_as(String arg1) throws Throwable {
//        Thread.sleep(2000);
//        CommonFunctionPO.getcommonFunctionPO().selectInstitute(PropertyFileHandler.readProperty(arg1));
//    }
//
//    @Then("^I enter the username as \"([^\"]*)\"$")
//    public void I_enter_the_username_as(String username) throws Throwable {
//        Thread.sleep(2000);
//        CommonFunctionPO.getcommonFunctionPO().enterUsername(PropertyFileHandler.readProperty(username));
//    }
//
//    @Then("^I enter the password as \"([^\"]*)\"$")
//    public void I_enter_the_password_as(String password) throws Throwable {
//        Thread.sleep(2000);
//        CommonFunctionPO.getcommonFunctionPO().enterPassword(PropertyFileHandler.readProperty(password));
//    }
//
//    @Then("^I click on the login button$")
//    public void I_click_on_the_login_button() throws Throwable {
//        Thread.sleep(2000);
//        CommonFunctionPO.getcommonFunctionPO().clickLoginBtn();
//    }
//
//    @Then("^I verify page title as \"([^\"]*)\"$")
//    public void I_verify_page_title_as(String title) throws Throwable {
//        Thread.sleep(2000);
//        assertTrue(CommonFunctionPO.getcommonFunctionPO().verifyPageTitle(PropertyFileHandler.readProperty(title)));
//    }
//
//    @Then("^I click on the logout icon$")
//    public void I_click_on_the_logout_icon() throws Throwable {
//        Thread.sleep(2000);
//        CommonFunctionPO.getcommonFunctionPO().clickLogoutIcon();
//    }
//
//    @Then("^I verify home icon$")
//    public void I_verify_home_icon() throws Throwable {
//        Thread.sleep(3000);
//        assertTrue(CommonFunctionPO.getcommonFunctionPO().verifyHomeIcon());
//    }
//
//    @Then("I verify error message as {string}")
//    public void i_verify_error_message_as(String arg1) throws InterruptedException {
//        Thread.sleep(1000);
//        assertTrue(CommonFunctionPO.getcommonFunctionPO().verifyErrorMessage(PropertyFileHandler.readProperty(arg1)));
//    }
//
//    @Then("I verify the error message as {string}")
//    public void i_verify_the_error_message_as(String arg1) throws InterruptedException {
//        Thread.sleep(2000);
//        assertEquals(PropertyFileHandler.readProperty(arg1),CommonFunctionPO.getcommonFunctionPO().verifyTheErrorMsg());
//
//    }
//
}
