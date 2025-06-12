package com.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateReport(String jsonpath) {
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\CucumberRamkumar\\ target");
		Configuration configuration = new Configuration(file, "Adact in Hotel");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Selenium Version", "24");
		List<String> jsonFile = new ArrayList<String>();
		jsonFile.add(jsonpath);
		ReportBuilder builder = new ReportBuilder(jsonFile, configuration);
		builder.generateReports();
	}

}
