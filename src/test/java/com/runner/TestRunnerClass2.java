package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json: target/sample.json", features = "src\\test\\resources", glue = "com.stepfinition", tags = "@login1", dryRun = false, stepNotifications = false)
public class TestRunnerClass2 extends Reporting {

	@AfterClass
	public static void generateReport() {
		Reporting.generateReport("C:\\Users\\hp\\eclipse-workspace\\CucumberRamkumar\\ target\\sample.json");
	}

}
