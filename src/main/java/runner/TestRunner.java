package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features ="src/main/java/Features/Tags.feature" ,
			glue= {"TagsStepDefinition"}, //the path of the step definition files
			plugin = {"pretty"}, //"html:target/cucumber-reports.html", "json:json_output/cucumber.json", "junit:junit_xml/cucmber.xml"},
			monochrome = true,
			stepNotifications = true,
			publish = true,
			dryRun = true,
			//tags = ("@SmokeTest or @RegressionTest")
			//tags = ("@SmokeTest and @RegressionTest")
			 tags = ("@EndToEndTest")
)
public class TestRunner {
}
