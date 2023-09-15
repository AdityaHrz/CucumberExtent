package com.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {
	@CucumberOptions(tags = "",
			features = "src/test/resources/Features",
			glue = "com.stepDefination",
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
	}

}