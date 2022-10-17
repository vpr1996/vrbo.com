package org.utilities;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target\\Reports\\vrbo.txt",
glue= {"org.stepdefinitionclass"},
dryRun=false,plugin= {"html:target\\Reports","junit:target\\Reports\\vrbo.xml","json:target\\Reports\\vrbo.json",
	     "rerun:target\\Reports\\vrbo.txt"})           

public class FailedTestReRunner {

	

	@AfterClass
	public static void TestRunnerclass() {
		
		JvmReports.generateJvmReports(System.getProperty("user.dir")+"\\target\\Reports\\vrbo.json");

	}
	


	
	
	
}
