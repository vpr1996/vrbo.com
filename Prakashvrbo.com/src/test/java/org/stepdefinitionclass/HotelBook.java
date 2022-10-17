package org.stepdefinitionclass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojoClasses.HotelBooking;
import org.pojoClasses.LoginSignUpTripBoards;
import org.pojoClasses.PlaceSearch;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelBook extends BaseClass{
	
	
	

	@When("user should search for place where they want to book a room")
	public void userShouldSearchForPlaceWhereTheyWantToBookARoom() throws Throwable {
	    implicitwaits();
		PlaceSearch pc = new PlaceSearch();
		sendkey(pc.getPlacesearchbox(),getdataxlsheet(1, 0));
		Enter();
	}

	@When("user should input checkin and checkout dates and select guest")
	public void userShouldInputCheckinAndCheckoutDatesAndSelectGuest() {
	    implicitwaits();
		PlaceSearch pc = new PlaceSearch();
		clicks(pc.getCheckin());
		clicks(pc.getCheckindate());
		clicks(pc.getCheckout());
		clicks(pc.getCheckoutdate());
		clicks(pc.getGuest());
		for (int i = 0; i <3; i++) {
		clicks(pc.getGuestadultplus());
		}
		for (int i = 0; i <2; i++) {
			clicks(pc.getGuestchildplus());
		}
		clicks(pc.getPetsyes());
		clicks(pc.getPlacesearchbox());
		
		
		
	}

	@When("user should click search button")
	public void userShouldClickSearchButton() throws InterruptedException {
	   implicitwaits();
		PlaceSearch pc = new PlaceSearch();
		clicks(pc.getSearchbtn());
		
	}

	@When("user should select the hotel or room")
	public void userShouldSelectTheHotelOrRoom() throws Throwable {
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
	    Thread.sleep(2000);
	    clicks(hp.getBooknowbtn());
	   
	}
	
	
	@When("user should fill the contact information")
	public void user_should_fill_the_contact_information() throws IOException {
	   
		implicitwaits();
		HotelBooking hp = new HotelBooking();
		javascriptscrolltop(hp.getFirstname());
		sendkey(hp.getFirstname(),"prakash");
		sendkey(hp.getLastname(),"radhakrishnan");
		sendkey(hp.getEmailid(),"prakashrandy211996@gmail.com");
		sendkey(hp.getMobno(),"9566903783");
		javascriptscrolldown(hp.getAgreecnt());
		clicks(hp.getAgreecnt());
		javascriptscrolldown(hp.getAgreecnt2());
		clicks(hp.getAgreecnt2());
		
	}



	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
