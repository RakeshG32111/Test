package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/tc1_Login.feature", glue = "org.step",
dryRun = false, plugin = "json:target/cucumber-report.json")
public class TestRunner {
	
	
	@AfterClass
	public static void report() {
		JVMReport.generateReport();
	}
	
}