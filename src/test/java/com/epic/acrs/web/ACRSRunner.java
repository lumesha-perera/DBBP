package com.epic.acrs.web;

import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.FileNotFoundException;
import java.io.IOException;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/resources/Features/" }, glue = {"com/epic/acrs/web/StepDefinition" },
		plugin = {"pretty","json:target/cucumber.json"}, tags = "@otherbankregister", dryRun = false)

public class ACRSRunner {
	@BeforeClass
	public static void setup() throws FileNotFoundException, IOException {
                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		PropertyFileHandler.getPropertyFileHandler();
		PropertyFileHandler.loadPropertyFile("src/resources/TestData/data.properties");
		WebDriverHelper.getWebDriverHelper();
		WebDriverHelper.startUpWebDriver(PropertyFileHandler.readProperty("Browser"),
			 PropertyFileHandler.readProperty("path"));

	}
	
	@AfterClass
	
	public static void teaDown() throws InterruptedException {
		WebDriverHelper.getWebDriver().quit();	
	}


}