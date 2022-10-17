package org.runnerclass;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.stepdefinitionclass.HooksClass;
import org.utilities.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\",
glue= {"org.stepdefinitionclass"},
dryRun=false,plugin= {"html:target\\Reports","junit:target\\Reports\\vrbo.xml","json:target\\Reports\\vrbo.json","rerun:target\\Reports\\vrbo.txt"},
tags= {"@randy"})           

public class RunnerClas {
	
  
	@AfterClass
	public static void TestRunnerclass() {
		
		JvmReports.generateJvmReports(System.getProperty("user.dir")+"\\target\\Reports\\vrbo.json");

	}
	


}