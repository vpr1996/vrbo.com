package org.stepdefinitionclass;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoClasses.PlaceSearch;
import org.pojoClasses.TopDestination;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ValidatingSugesstions extends BaseClass {
	
	
	@Given("user should scrooll down to top destination")
	public void user_should_scrooll_down_to_top_destination() throws Throwable {
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

	@When("And print all the destination")
	public void and_print_all_the_destination() {
		

		List<WebElement> li = driver.findElements(By.xpath("//ul[@class='CollapsibleLinkpile__category-list list-inline']//following::li"));
		
		
		for (int i = 0; i <li.size(); i++) {
			
			WebElement x = li.get(i);
			String text = x.getText();
			System.out.println(text);
					
		}
	}
	

	
	@Given("user should search the places")
	public void user_should_search_the_places() throws Throwable {
		implicitwaits();
		PlaceSearch pc = new PlaceSearch();
		sendkey(pc.getPlacesearchbox(),"Los Angels");
		Enter();
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
		clicks(pc.getSearchbtn());
		
	    
	}

	@When("user should scrooll down to view the rooms\\/hotels")
	public void user_should_scrooll_down_to_view_the_rooms_hotels() throws Throwable {
		Thread.sleep(4000);
		for (int i = 0; i <30; i++) {
			down();
		}
		Thread.sleep(4000);
		for (int i = 0; i < 30; i++) {
			
			down();
		}
		Thread.sleep(4000);
		for (int i = 0; i <30; i++) {
			down();
		}
		
	}

	@When("print all the places")
	public void print_all_the_places() throws AWTException, InterruptedException {
	  
		implicitwaits();
		List<WebElement> li = driver.findElements(By.xpath("//h2[@class='HitInfo__headline hover-text']"));
		
		Thread.sleep(3000);
		for (int i = 0; i <7; i++) {
			
			minimizethescreen();
		}
		
		for (int i = 0; i <li.size(); i++) {
			
			WebElement wb = li.get(i);
			System.out.println(wb.getText());
			
		}
		
		
		
	}



}