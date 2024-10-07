package com.qa.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\2162910\\OneDrive - Cognizant\\Desktop\\Automation\\CRMBDDFreamework\\src\\main\\java\\com\\qa\\features\\FreeCRM.feature",
		glue = {"com/qa/StepDefinitions"},
		plugin = {"pretty"},
		monochrome = true,
		dryRun = false,
		stepNotifications =  true
		)

public class TestRunner {

}
