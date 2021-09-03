package com.advancedreports;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extReportTestNG {

	@Test
	public void test() throws IOException {

		System.out.println("Hanuman@55");
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./ExtReportsHere/extent.html");


		ExtentReports repos = new ExtentReports();
		repos.attachReporter(htmlReporter);
		ExtentTest logger = repos.createTest("Login Test");
		logger.log(Status.INFO, "Its about login class");
		logger.log(Status.PASS, "Its about login class");
		repos.flush();

		ExtentTest loggerlg = repos.createTest("Logout Test");
		loggerlg.log(Status.INFO, "Its about Logout test");
		loggerlg.log(Status.FAIL, "Its about Test");
		 loggerlg.fail("Lord", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\RamRaksha\\Downloads\\maxresdefault.jpeg").build());
	//	loggerlg.addScreenCaptureFromPath("C:\\Users\\RamRaksha\\Downloads\\maxresdefault.jpeg");
		 
		 
		 repos.flush();
		
		
	}

}
