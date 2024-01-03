package com.epic.acrs.web.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utility.WebDriverHelper;

public class ACRSPageFactory {
	public static com.epic.acrs.web.PageFactory.ACRSPageFactory pf = PageFactory.initElements(WebDriverHelper.getWebDriver(), com.epic.acrs.web.PageFactory.ACRSPageFactory.class);



	@FindBy(how = How.ID, using = "username")
	public WebElement Username;

	@FindBy(how = How.ID, using = "password")
	public WebElement Password;

	@FindBy(how = How.XPATH, using = "//button[contains (@class,'mat-focus-indicator sign-')]")
	public WebElement LoginBtn;

	@FindBy(how = How.XPATH, using = "//h3[contains (text(),'Welcome')]")
	public WebElement WelcomTxt;

	@FindBy(how = How.XPATH, using = "//h4[contains (text(),'Epic Digital Branchless')]")
	public WebElement Headertxt;

	//Other Bank Management


	@FindBy(how = How.XPATH, using = "//span[contains(@class,'mat-content') and text()=' Common Configuration ']")
	public WebElement CommonConfigurationicon;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),' Other Bank Management ')]")
	public WebElement OtherBankicon;

	@FindBy(how = How.XPATH, using = "//button[contains (@class,'mat-focus-indicator secondary-btn mat-raised-button')]")
	public WebElement BankAdd;


	@FindBy(how = How.XPATH, using = "(//input[@name='bankCode'])[2]")
	public WebElement BankCode;

	@FindBy(how = How.XPATH, using = "(//input[@id='bankName'])[2]")
	public WebElement BankName;

	@FindBy(how = How.ID, using = "remarks")
	public WebElement BankRemark;


	@FindBy(how = How.XPATH, using = "(//select[@class='user-input user-select ng-untouched ng-pristine ng-valid'])[2]")
	public WebElement AddBankStatus;


	@FindBy(how = How.XPATH, using = "//div[@class='swal2-html-container']")
	public WebElement AddSuccessmsg;

	@FindBy(how = How.XPATH, using = "//button[@class='swal2-confirm swal2-styled']")
	public WebElement AddSuccessmsgOkBtn;

	@FindBy(how = How.XPATH, using = "//input[contains (@name,'ceft')]")
	public WebElement BankCeft;

	@FindBy(how = How.XPATH, using = "(//button[@class='mat-focus-indicator mat-raised-button mat-button-base'])[2]")
	public WebElement BankSave;

	@FindBy(how = How.XPATH, using = "(//input[@name='bankCode'])[1]")
	public WebElement SearchBankCode;
	@FindBy(how = How.XPATH, using = "//button[@class = 'mat-focus-indicator mat-raised-button mat-button-base']")
	public WebElement SearchBtn;

	@FindBy(how = How.XPATH, using = "(//div[@class='datatable-body-cell-label' and text()=7834])[1]")
	public WebElement tablecell;


	@FindBy(how = How.XPATH, using = "(//mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'])[1]")
	public WebElement Editicon;

//	@FindBy(how = How.XPATH, using = "//input[@id=\"bankName\"and @class=\"user-input ng-pristine ng-valid ng-touched\"]")
//	public WebElement UpdateBankName;

	@FindBy(how = How.XPATH, using = "//div[@class='input-group']//div//input[@id='bankName']")
	public WebElement UpdateBankName;


	@FindBy(how = How.XPATH, using = "//body")
	public WebElement Update_BankName;
//input[@class='user-input ng-pristine ng-valid ng-touched']
//div[@class='input-group']//div//input[@id='bankName']
	@FindBy(how = How.XPATH, using = "//input[@id=\"remarks\"]")
	public WebElement UpdateRemark;

	@FindBy(how = How.XPATH, using = "(//select[@id=\"status\"])[2]")
	public WebElement UpdateStatus;

	@FindBy(how = How.XPATH, using = "//input[@name=\"ceft\"]")
	public WebElement UpdateCeft;

	@FindBy(how = How.XPATH, using = "//input[@name=\"slip\"]")
	public WebElement UpdateSlip;

	@FindBy(how = How.XPATH, using = "(//button[@class=\"mat-focus-indicator mat-raised-button mat-button-base\"])[2]")
	public WebElement UpdateBtn;

//Delete

	@FindBy(how = How.XPATH, using = "(//mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'])[2]")
	public WebElement DeleteBtn;

	@FindBy(how = How.XPATH, using = "(//button[@class=\"mat-focus-indicator mat-raised-button mat-button-base\"])[2]")
	public WebElement DeleteOkBtn;

	@FindBy(how = How.XPATH, using = "//div[@class=\"dialog-content\"]")
	public WebElement DeleteDialogP1;

//	@FindBy(how = How.XPATH, using = "//b[@class=\"bold-white\"]")
//	public WebElement DeleteDialogP2;


	@FindBy(how = How.XPATH, using = "//div[@class = \"empty-row ng-star-inserted\"]")
	public WebElement Emptyrow;

	//Search
	@FindBy(how = How.XPATH, using = "//button[@class=\"mat-focus-indicator ghost-btn mat-raised-button mat-button-base\"]")
	public WebElement SearchReset;

	@FindBy(how = How.XPATH, using = "//input[@id='bankName']")
	public WebElement SearchBankName;

	@FindBy(how = How.XPATH, using = "//select[@id='status']")
	public WebElement SearchStatus;
	//select[@class='user-input user-select ng-valid ng-touched ng-dirty']
	@FindBy(how = How.XPATH, using = "//option[@id=\"selectedOption\" and text()=' Active ']")
	public WebElement SearchActive;

	@FindBy(how = How.XPATH, using = "//option[@id=\"selectedOption\" and text()=' De-Active ']")
	public WebElement SearchDeActive;

	@FindBy(how = How.XPATH, using = "(//button[@class='mat-focus-indicator ghost-btn mat-raised-button mat-button-base'])[2]")
	public WebElement ResetAdd;

	@FindBy(how = How.XPATH, using = "(//button[@class='mat-focus-indicator ghost-btn mat-raised-button mat-button-base'])[2]")
	public WebElement ResetUpdate;

	@FindBy(how = How.XPATH, using = "(//input[@id = 'bankCode'])[2]")
	public WebElement BankCodeUpdate;


	//Add error message validation

	@FindBy(how = How.XPATH, using = "//button[@class = 'mat-focus-indicator mat-raised-button mat-button-base mat-button-disabled']")
	public WebElement AddDisable;

	@FindBy(how = How.XPATH, using = "//p[text()='Required numerical values']")
	public WebElement AddBankCodeErrormsg;

	@FindBy(how = How.XPATH, using = "//p[text()='Required character values']")
	public WebElement AddBankNameErrormsg;

	//p[text()='This field is required']
	@FindBy(how = How.XPATH, using = "//p[text()='This field is required']")
	public WebElement AddRemarksErrormsg;


	@FindBy(how = How.XPATH, using = "//p[text()='Required character values']")
	public WebElement UpdateBankNameErrormsg;

	@FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-button-disabled']")
	public WebElement UpdateDisable;

	@FindBy(how = How.XPATH, using = "//p[text()='This field is required']")
	public WebElement Update_Reset_Errormsg;


}
