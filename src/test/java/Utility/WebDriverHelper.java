package Utility;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import edu.emory.mathcs.backport.java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;	

import java.util.ArrayList;


public class WebDriverHelper {
	static WebDriverHelper wHelper;
	public static WebDriver Wdriver, driver;

	


	/***
	 * @author isuru_j
	 * @description: This is private constructor. It is prevent creating the objects in out side.
	 */
	private WebDriverHelper() {
	}

	/***
	 * 
	 * @author isuru_j
	 * @param Browser
	 * @param Os
	 * @param paths
	 * @return
	 * @throws MalformedURLException
	 */
	public static WebDriver startUpWebDriver(String Browser,String paths)
			throws MalformedURLException {
		
		System.out.println("Startup Web Driver Method_______________");
		if (Browser.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", paths);
			
			//this method is use to remove "Chrome is being controlled by automated test software" message
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			Wdriver = new ChromeDriver(options);
			
			Wdriver.manage().window().maximize();
			Wdriver.manage().timeouts().implicitlyWait(ConfigUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		}
			return Wdriver;
	}

	public static WebDriverHelper getWebDriverHelper() {
		if (wHelper == null) {
			wHelper = new WebDriverHelper();
		}
		return wHelper;
	}

	public void enterUrl(String url) throws InterruptedException {
		Wdriver.navigate().to(url);
		Thread.sleep(3000);
	}

	public static WebDriver getWebDriver() {
		return Wdriver;
	}

	public void switchWindowByName(String windowName) {
		Wdriver.switchTo().window(windowName);
	}

	public void switchFrame(String frameName) {
		Wdriver.switchTo().frame(frameName);
	}

	public void switchAlert() {

		Alert alert = Wdriver.switchTo().alert();

	}

	public static void setDriver(WebDriver driver) {
		Wdriver = driver;
	}

	public static void teardown() {
		Wdriver.quit();
	}
	
	 /**
		 * @author isuru_j
		 * @description: this method use to switch web driver to newly open web tab
		 * 
		 */
	
	 public void switchTab()
	 {
		 String oldTab = Wdriver.getWindowHandle();
		 ArrayList<String> newTab = new ArrayList<String>(Wdriver.getWindowHandles());
		 newTab.remove(oldTab);
		 Wdriver.switchTo().window(newTab.get(0));
	 }
	 
	 /**
		 * @author isuru_j
		 * @description: this method use to wait till expected element is visible.
		 * 
		 */
	 
	 public void waitPageLoad(WebElement x)
	 {
		 WebDriverWait wait = new WebDriverWait(Wdriver, 30);
		 wait.until(ExpectedConditions.elementToBeClickable(x));
		
	 }
	 
	 /**
		 * @author isuru_j
		 * @description: this method use to wait till  every component in the web page is loaded.
		 * 
		 */
	 
	 public void waitForPageLoad() {

		    Wait<WebDriver> wait = new WebDriverWait(Wdriver, 30);
		    wait.until(new Function<WebDriver, Boolean>() {
		        public Boolean apply(WebDriver driver) {
		            return String
		                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
		                .equals("complete");
		        }
		    });
	 }

}
