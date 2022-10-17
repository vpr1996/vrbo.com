package org.stepdefinitionclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.pojoClasses.HotelBooking;
import org.pojoClasses.LoginSignUpTripBoards;
import org.pojoClasses.PlaceSearch;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SaveToTripBoards extends BaseClass {

	
	@Given("user should search for place where they want to save for tripboards")
	public void user_should_search_for_place_where_they_want_to_save_for_tripboards() throws Throwable {
	    
		    implicitwaits();
			PlaceSearch pc = new PlaceSearch();
			sendkey(pc.getPlacesearchbox(),getdataxlsheet(2, 0));
			for (int i = 0; i <4; i++) {
				down();	
			}
			Enter();	
	}

	@When("user should input checkin and checkout dates and select guest for tripboards")
	public void user_should_input_checkin_and_checkout_dates_and_select_guest_for_tripboards() {
		 implicitwaits();
			PlaceSearch pc = new PlaceSearch();
			clicks(pc.getCheckin());
			clicks(pc.getCheckindate());
			clicks(pc.getCheckout());
			clicks(pc.getCheckoutdate());
			clicks(pc.getGuest());
			for (int i = 0; i <6; i++) {
			clicks(pc.getGuestadultplus());
			}
			for (int i = 0; i <9; i++) {
				clicks(pc.getGuestchildplus());
			}
			clicks(pc.getPetsyes());
			clicks(pc.getPlacesearchbox());
				
		}

	@When("user should select the hotell or room to save in tripboards")
	public void user_should_select_the_hotell_or_room_to_save_in_tripboards() throws InterruptedException {
	  
		implicitwaits();
		HotelBooking hp = new HotelBooking();
		String parentid = driver.getWindowHandle();
		clicks(hp.getFirstproduct());
		Thread.sleep(3000);
	    Set<String> allid= driver.getWindowHandles();
	    List<String> li= new ArrayList<String>();
	    li.addAll(allid);
	    String child = li.get(1);
	    windowshandlingId(child);
	    
	}


	@When("user should  clik save and give tripname and click save")
	public void user_should_clik_save_and_give_tripname_and_click_save() {
		implicitwaits();
	    PlaceSearch s = new PlaceSearch();
	    clicks(s.getAddtotrips());
	    sendkey(s.getMessagebox(),"Birthday party treat");
	    clicks(s.getSave());
	  
	}

	@When("user should check in tripboards whether selected room was available or not")
	public void user_should_check_in_tripboards_whether_selected_room_was_available_or_not() {
	   
		String child = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		List<String> li= new ArrayList<String>();
		li.addAll(allid);
		String par = li.get(0);
		windowshandlingId(par);
		LoginSignUpTripBoards l = new LoginSignUpTripBoards();
		clicks(l.getTripboards());
		
	}

	
	
	
	
	
	
	
	
}
