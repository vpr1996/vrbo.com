package org.pojoClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.utilities.BaseClass;

public class TopDestination extends BaseClass {

	
	public TopDestination() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h3[text()='Explore Vrbo']")
	private WebElement scroollast;
	
	@FindBy(xpath="//h2[text()='Here’s what makes a vacation rental perfect for you']")
	private WebElement scrooltop;
	
	
	@FindBy(xpath="//a[text()='Orange Beach vacation rentals']")
	private WebElement OrangeBeachvacationrentals;
	
	
	@FindBy(xpath="//a[text()='Marco Island vacation rentals']")
	private WebElement MarcoIslandvacationrentals;
	
	
	@FindBy(xpath="//a[text()='Naples vacation rentals']")
	private WebElement Naplesvacationrentals;
	
	@FindBy(xpath="//a[text()='Sedona vacation rentals']")
	private WebElement Sedonavacationrentals;

	

	public WebElement getScrooltop() {
		return scrooltop;
	}

	public WebElement getOrangeBeachvacationrentals() {
		return OrangeBeachvacationrentals;
	}

	public WebElement getMarcoIslandvacationrentals() {
		return MarcoIslandvacationrentals;
	}

	public WebElement getNaplesvacationrentals() {
		return Naplesvacationrentals;
	}

	public WebElement getSedonavacationrentals() {
		return Sedonavacationrentals;
	}

	public WebElement getScroollast() {
		return scroollast;
	}
	
	
	
	
	
	
	
}
