package org.stepdefinitionclass;

import org.junit.Assert;
import org.pojoClasses.TopDestination;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DestinationCheck extends BaseClass {

	@Given("user should scrooll dowm upto top destination")
	public void user_should_scrooll_dowm_upto_top_destination() throws Throwable {
	   
		implicitwaits();
		for (int i = 0; i <30; i++) {
			down();
		}
		Thread.sleep(5000);
		for (int i = 0; i <40; i++) {
			down();
		}
		Thread.sleep(2000);
		TopDestination t = new TopDestination();
		javascriptscrolltop(t.getScrooltop());
		
	}
	
	
	@Given("user should click Orange Beach vacationrentals destination")
	public void user_should_click_Orange_Beach_vacationrentals_destination() {
		implicitwaits();
		TopDestination t = new TopDestination();
		clicks(t.getOrangeBeachvacationrentals());
		
	}

	@When("It should navigate Orange Beach vacationrentals home page")
	public void it_should_navigate_Orange_Beach_vacationrentals_home_page() {
	    
		implicitwaits();
		String str = driver.getCurrentUrl();
		Assert.assertTrue(str.contains("orange-beach"));
		
	}

	@Given("user should click Marco Island vacation rentals destination")
	public void user_should_click_Marco_Island_vacation_rentals_destination() {
		implicitwaits();
		TopDestination t = new TopDestination();
		clicks(t.getMarcoIslandvacationrentals());
		
	}

	@When("It should navigate Marco Island vacation rentals home page")
	public void it_should_navigate_Marco_Island_vacation_rentals_home_page() {
	    
		implicitwaits();
		String str = driver.getTitle();
		Assert.assertTrue(str.startsWith("Marco"));
	}

	@Given("user should click Naples vacation rentals destination")
	public void user_should_click_Naples_vacation_rentals_destination() {
		
		implicitwaits();
		TopDestination t = new TopDestination();
		clicks(t.getNaplesvacationrentals());
	}

	@When("It should navigate Naples vacation rentals home page")
	public void it_should_navigate_Naples_vacation_rentals_home_page() {
	    implicitwaits();
		String str = driver.getTitle();
		Assert.assertTrue(str.contains("Naples"));
		
	}

	@Given("user should click Sedona vacation rentals destination")
	public void user_should_click_Sedona_vacation_rentals_destination() {
		implicitwaits();
		TopDestination t = new TopDestination();
		clicks(t.getSedonavacationrentals());
	}

	@When("It should navigate Sedona vacation rentals home page")
	public void it_should_navigate_Sedona_vacation_rentals_home_page() {
		implicitwaits();
		String str = driver.getTitle();
		Assert.assertTrue(str.contains("Sedona"));
	    
	}

	
	
}
