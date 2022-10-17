package org.stepdefinitionclass;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import org.pojoClasses.*;
import org.utilities.BaseClass;
public class Login extends BaseClass {
	
	@Given("user should click the login button and click travellor login")
	public void userShouldClickTheLoginButtonAndClickTravellorLogin() {
	    
		LoginSignUpTripBoards l = new LoginSignUpTripBoards();
		clicks(l.getLogin());
		clicks(l.getTravellorloin());
		
	}

	@When("user should pass the invalid username{string} and invalid password{string} in the textbox")
	public void userShouldPassTheInvalidUsernameAndInvalidPasswordInTheTextbox(String s1, String s2) {
	   LoginSignUpTripBoards l = new LoginSignUpTripBoards();
	   
	   sendkey(l.getTravelloremailid(),s1);
	   sendkey(l.getTravellorpassword(),s2);
		
		
		
	}

	@When("user should click signin button")
	public void userShouldClickSigninButton() throws InterruptedException {
		LoginSignUpTripBoards l = new LoginSignUpTripBoards();
		clicks(l.getTravellorsigninbtn());
		Thread.sleep(3000);
	}


	
	
	
	
	
	

@Given("user should click the login button and click owner login")
public void userShouldClickTheLoginButtonAndClickOwnerLogin() {
    
	implicitwaits();
	LoginSignUpTripBoards l = new LoginSignUpTripBoards();
	clicks(l.getLogin());
	clicks(l.getOwnerlogin());
	
}

@When("user should pass the invalid usernam{string} and invalid password{string} in the textbox")
public void userShouldPassTheInvalidUsernamAndInvalidPasswordInTheTextbox(String s1, String s2) {
    implicitwaits();
	LoginSignUpTripBoards l = new LoginSignUpTripBoards();
	sendkey(l.getOwneremailid(), s1);
	sendkey(l.getOwnerpassword(),s2);

}

@When("user should click login button")
public void userShouldClickLoginButton() {
	implicitwaits();
	LoginSignUpTripBoards l = new LoginSignUpTripBoards();
    clicks(l.getOwnersigninbtn());
}









@Given("user should click the login button and travellor login button")
public void userShouldClickTheLoginButtonAndTravellorLoginButton() {
   
	LoginSignUpTripBoards l = new LoginSignUpTripBoards();
	clicks(l.getLogin());
	clicks(l.getTravellorloin());
	
}

@When("user should pass the valid username{string} and valid password {string} in the textbox")
public void userShouldPassTheValidUsernameAndValidPasswordInTheTextbox(String s1, String s2) {
    
	LoginSignUpTripBoards l = new LoginSignUpTripBoards();
	   
	   sendkey(l.getTravelloremailid(),s1);
	   sendkey(l.getTravellorpassword(),s2);
}

@When("user should click the logib button")
public void userShouldClickTheLogibButton() throws Throwable {
    
	LoginSignUpTripBoards l = new LoginSignUpTripBoards();
	clicks(l.getTravellorsigninbtn());
	Thread.sleep(3000);
	
	
}


	
	
	
	
}
