package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features ="src/main/java/Features/DealsMap.feature" ,
			glue= {"DealStepDefinition"}, //the path of the step definition files
			plugin = {"pretty"}, //"html:target/cucumber-reports.html", "json:json_output/cucumber.json", "junit:junit_xml/cucmber.xml"},
			monochrome = true,
			stepNotifications = true,
			publish = true,
			dryRun = false
) 
public class TestRunner {

}
