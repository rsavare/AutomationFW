package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resource/Features"},
		glue = {"com.stepDef", "com.hooks"},
		plugin = {"pretty"},
		monochrome = true
		) 

public class ScriptRunner {
	
	

}
