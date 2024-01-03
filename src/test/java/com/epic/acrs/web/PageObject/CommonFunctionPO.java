package com.epic.acrs.web.PageObject;

import Utility.WebDriverHelper;
import com.epic.acrs.web.PageFactory.ACRSPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CommonFunctionPO {
	private static CommonFunctionPO commonFunction;

	private CommonFunctionPO() {
	}

	public static CommonFunctionPO getcommonFunctionPO() {
		if (commonFunction == null) {
			commonFunction = new CommonFunctionPO();
		}
		return commonFunction;
	}

//	/***
//	 * @author Isuru_j
//	 * @description Select the institute
//	 */
//	public void selectInstitute(String institute){
//		new Select(ACRSPageFactory.pf.instituteDropDown).selectByVisibleText(institute);
//	}
//
//	/***
//	 * @author Isuru_j
//	 * @description Enter the username
//	 */
//	public void enterUsername(String username){
//		ACRSPageFactory.pf.usernameTxt.clear();
//		ACRSPageFactory.pf.usernameTxt.sendKeys(username);
//	}
//
//	/***
//	 * @author Isuru_j
//	 * @description Enter the password
//	 */
//	public void enterPassword(String password){
//		ACRSPageFactory.pf.passwordTxt.clear();
//		ACRSPageFactory.pf.passwordTxt.sendKeys(password);
//	}
//
//	/***
//	 * @author Isuru_j
//	 * @description Click on the login button
//	 */
//	public void clickLoginBtn(){
//		ACRSPageFactory.pf.loginBtn.click();
//	}
//
//	/***
//	 * @author Isuru_j
//	 * @description Verify page title
//	 */
//	public boolean verifyPageTitle(String title){
//		return WebDriverHelper.getWebDriver().findElement(By.xpath("//li[@class='ng-star-inserted' and contains(text(),'"+title+"')]")).isDisplayed();
//	}
//
//	/***
//	 * @author Isuru_j
//	 * @description Click logout icon
//	 */
//	public void clickLogoutIcon(){
//		ACRSPageFactory.pf.logoutIcon.click();
//	}
//
//	/***
//	 * @author Isuru_j
//	 * @description Verify home icon
//	 */
//	public boolean verifyHomeIcon(){
//		return ACRSPageFactory.pf.homeIcon.isDisplayed();
//	}
//
//	/***
//	 * @author pasindu_k
//	 * @description Verify error message
//	 */
//	public boolean verifyErrorMessage(String arg1){
//		return WebDriverHelper.getWebDriver().findElement(By.xpath("//div[@class='message' and contains(text(),'"+arg1+"')]")).isDisplayed();
//	}
//
//	/***
//	 * @author pasindu_k
//	 * @description Verify the error msg
//	 */
//	public String verifyTheErrorMsg(){
//		return ACRSPageFactory.pf.errorMsg.getText();
//	}
//
}
