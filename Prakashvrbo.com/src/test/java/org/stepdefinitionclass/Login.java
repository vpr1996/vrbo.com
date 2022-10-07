package org.stepdefinitionclass;

import java.util.Date;

import org.framework.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class Login extends BaseClass {

	
	@Given("Launching the chrome browser and url")
	public void launchingTheChromeBrowserAndUrl() {
	   launchChrome();
	   gett("https://www.vrbo.com/");
	}

	@Given("Maximize the window")
	public void maximizeTheWindow() {
	    maximum();
	}

	@When("Entering the Invalid username {string} and password {string}")
	public void enteringTheInvalidUsernameAndPassword(String string, String string2) {
	    driver.findElement(By.xpath("//*[@id=\"site-header__login\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"site-header__login--container\"]/li[1]/a")).click();
		
	}

	@When("Clicking submit button")
	public void clickingSubmitButton() {
	   
	}

	@Then("It should navigate to error message")
	public void itShouldNavigateToErrorMessage() {
	   
	}

	
	
	
}
