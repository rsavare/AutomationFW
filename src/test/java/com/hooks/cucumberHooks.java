package com.hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.utility.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class cucumberHooks {
	
	private DriverFactory driverfact;
	private WebDriver driver;
	private ConfigReader conReader;
	Properties prop;
	
	@Before
	public void launchBrowser() {
		
		conReader = new ConfigReader();
		prop = conReader.init_prop();
		String browserName = prop.getProperty("browser");
		
		driverfact = new DriverFactory();
		driverfact.init_driver(browserName);
		
	}
	
	@After
	public void closeBrowser(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			String screenShotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenShotName);
		}
	}
	
	
	

}
