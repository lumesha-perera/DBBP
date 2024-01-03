package com.epic.acrs.web.StepDefinition;

import Utility.WebDriverHelper;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
	@After
	public static void teaDown(Scenario scenario) throws InterruptedException {

		if (scenario.isFailed()) {
			try {

				if (WebDriverHelper.getWebDriver()!=null) {
					// UtilityHelper.getscreenshot();
					byte[] screenshotweb = ((TakesScreenshot) WebDriverHelper.getWebDriver())
							.getScreenshotAs(OutputType.BYTES);
					// embed it in the report.
					scenario.attach(screenshotweb, "image/png","Web");
				}


			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



	}
}
