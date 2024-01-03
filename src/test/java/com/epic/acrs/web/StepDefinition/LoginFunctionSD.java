package com.epic.acrs.web.StepDefinition;
import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.epic.acrs.web.PageObject.LoginFunctionPO;
import static org.junit.Assert.assertTrue;
public class LoginFunctionSD {

    @Given("I open URL as {string}")
    public void i_open_url_as(String url) throws InterruptedException {
        WebDriverHelper.getWebDriverHelper().enterUrl(PropertyFileHandler.readProperty(url ));
    }

    @Then("I enter the username as {string}")
    public void i_enter_the_username_as(String username) throws InterruptedException{
        Thread.sleep(2000);
        LoginFunctionPO.getloginFunctionPO().enterUsername(PropertyFileHandler.readProperty(username));
        
    }
    @Then("I enter the password as {string}")
    public void i_enter_the_password_as(String password) throws InterruptedException{
        Thread.sleep(2000);
        LoginFunctionPO.getloginFunctionPO().enterPassword(PropertyFileHandler.readProperty(password));
    }
    @Then("I click on the login button")
    public void i_click_on_the_login_button() throws InterruptedException {
        Thread.sleep(2000);
        LoginFunctionPO.getloginFunctionPO().clickLoginBtn();
    }
    @Then("I verify home icon")
    public void i_verify_home_icon() throws InterruptedException{
        Thread.sleep(2000);
        assertTrue(LoginFunctionPO.getloginFunctionPO().verifyWelcomeTxt());
    }

    @Then("I verify header")
    public void i_verify_header() throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
       Thread.sleep(2000);
       assertTrue(LoginFunctionPO.getloginFunctionPO().verifyHeaderTxt());
    }

}
