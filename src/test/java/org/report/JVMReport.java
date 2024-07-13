package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JVMReport {

	public static void generateReport() {
		File reportOutputDirectory = new File(System.getProperty("user.dir")+"/target");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("target/cucumber-report.json");

		String projectName = "cucumberProject";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);

		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Chrome");

		ReportBuilder reportBuilder=new ReportBuilder(jsonFiles,configuration);
		Reportable result=reportBuilder.generateReports();

	}

}
