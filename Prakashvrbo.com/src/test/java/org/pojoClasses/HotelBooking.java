package org.pojoClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class HotelBooking extends BaseClass {

	
	public HotelBooking() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="(//h2[@class='HitInfo__headline hover-text'])[1]")
	private WebElement firstproduct;
	
	@FindBy(xpath="//span[@class='btn__label btn__label--truncate']")
	private WebElement booknowbtn;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement firstname;
	
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	private WebElement lastname;
	

	@FindBy(xpath="(//input[@class='form-control'])[5]")
	private WebElement emailid;
	
	
	@FindBy(xpath="(//input[@class='form-control'])[6]")
	private WebElement mobno;
	
	@FindBy(xpath="(//span[@class='btn__label'])[4]")
	private WebElement agreecnt;
	
	
	@FindBy(xpath="(//span[@class='btn__label'])[6]")
	private WebElement agreecnt2;


	public WebElement getFirstproduct() {
		return firstproduct;
	}


	public WebElement getBooknowbtn() {
		return booknowbtn;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getEmailid() {
		return emailid;
	}


	public WebElement getMobno() {
		return mobno;
	}


	public WebElement getAgreecnt() {
		return agreecnt;
	}


	public WebElement getAgreecnt2() {
		return agreecnt2;
	}


	
	
	
	
	
	
}
