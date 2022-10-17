package org.stepdefinitionclass;

import java.io.IOException;

import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	

	@Before
	public  void beforeScenario() {
		
		launchChrome();
		gett("https://www.vrbo.com/");
		maximum();
	}
	
	
   @After
	public void afterScenario(Scenario s) throws IOException {
	
	   
	   driver.manage().deleteAllCookies();
		quite();
		

   }
	
	

}
