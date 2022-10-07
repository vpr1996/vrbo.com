package org.pojoClasses;

import org.framework.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class LoginSignUpTripBoards  extends BaseClass {

	public LoginSignUpTripBoards() {
	
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="(//span[@class='site-header-nav__icon-label'])[2]")
	private WebElement login;
	
	@FindBy(xpath="(//span[@class='site-header-nav__icon-label'])[1]")
	private WebElement tripboards;
	
	@FindBy(xpath="(//a[text()='Traveler Login'])[1]")
	private WebElement travellorloin;
	
	@FindBy(xpath="(//a[text()='Owner Login'])[1]")
	private WebElement ownerlogin;
	
	@FindBy(xpath="(//span[text()='Sign up'])[1]")
	private WebElement signin;
	
	@FindBy(xpath="//input[@id='loginFormEmailInput']")
	private WebElement travelloremailid;
	
	@FindBy(xpath="//input[@id='loginFormPasswordInput']")
	private WebElement travellorpassword;
	
	@FindBy(id="loginFormSubmitButton")
	private WebElement travellorsigninbtn;
	
	@FindBy(id="loginFormForgoPwdLink")
	private WebElement travellorforgetpass;
	
	@FindBy(xpath="//input[@id='ForgotPasswordEmailInput']")
	private WebElement travellorforgotemailbox;
	
	@FindBy(id="forgotPasswordFormSubmitButton")
	private WebElement forgotsigninbtn;
	
	@FindBy(xpath="//input[@id='lex-emailAddress']")
	private WebElement owneremailid;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement ownerpassword;
	
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement ownersigninbtn;


	public WebElement getLogin() {
		return login;
	}


	public WebElement getTripboards() {
		return tripboards;
	}


	public WebElement getTravellorloin() {
		return travellorloin;
	}


	public WebElement getOwnerlogin() {
		return ownerlogin;
	}


	public WebElement getSignin() {
		return signin;
	}


	public WebElement getTravelloremailid() {
		return travelloremailid;
	}


	public WebElement getTravellorpassword() {
		return travellorpassword;
	}


	public WebElement getTravellorsigninbtn() {
		return travellorsigninbtn;
	}


	public WebElement getTravellorforgetpass() {
		return travellorforgetpass;
	}


	public WebElement getTravellorforgotemailbox() {
		return travellorforgotemailbox;
	}


	public WebElement getForgotsigninbtn() {
		return forgotsigninbtn;
	}


	public WebElement getOwneremailid() {
		return owneremailid;
	}


	public WebElement getOwnerpassword() {
		return ownerpassword;
	}


	public WebElement getOwnersigninbtn() {
		return ownersigninbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
