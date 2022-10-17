package org.pojoClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class PlaceSearch extends BaseClass {

	
	public PlaceSearch() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	@FindBy(xpath="//input[@id='react-destination-typeahead']")
	private WebElement placesearchbox;
	
	@FindBy(xpath="(//div[@class='picker__overlay picker__overlay--selectable'])[1]")
	private WebElement checkin;
	
	@FindBy(xpath="(//dl[@class='search-form__day-content'])[25]")
	private WebElement checkindate;
	
	@FindBy(xpath="(//dl[@class='search-form__day-content'])[31]")
	private WebElement checkoutdate;
	
	@FindBy(xpath="(//div[@class='picker__overlay picker__overlay--selectable'])[2]")
	private WebElement checkout;
	
	@FindBy(xpath="(//div[@class='picker__overlay picker__overlay--selectable'])[3]")
	private WebElement guest;
	
	@FindBy(xpath="(//span[@class='SVGIcon SVGIcon--16px flex-center'])[1]")
	private WebElement guestadultminus;
	
	@FindBy(xpath="(//span[@class='SVGIcon SVGIcon--16px flex-center'])[2]")
	private WebElement guestadultplus;
	
	@FindBy(xpath="(//span[@class='SVGIcon SVGIcon--16px flex-center'])[3]")
	private WebElement guestchildminus;
	
	@FindBy(xpath="(//span[@class='SVGIcon SVGIcon--16px flex-center'])[4]")
	private WebElement guestchildplus;
	
	@FindBy(xpath="(//label[@class='CRB__label text-muted CRB__label--right'])[1]")
	private WebElement petsno;
	
	@FindBy(xpath="(//label[@class='CRB__label text-muted CRB__label--right'])[2]")
	private WebElement petsyes;
	
	@FindBy(xpath="(//span[@class='btn__label'])[1]")
	private WebElement guestapply;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//span[@class='btn__label'])[3]")
	private WebElement addtotrips;
	
	@FindBy(xpath="//input[@id='createBoardNameInput-inline']")
	private WebElement messagebox;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
	private WebElement save;

	public WebElement getPlacesearchbox() {
		return placesearchbox;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getGuest() {
		return guest;
	}

	public WebElement getGuestadultminus() {
		return guestadultminus;
	}

	public WebElement getGuestadultplus() {
		return guestadultplus;
	}

	public WebElement getGuestchildminus() {
		return guestchildminus;
	}

	public WebElement getGuestchildplus() {
		return guestchildplus;
	}

	public WebElement getPetsno() {
		return petsno;
	}

	public WebElement getPetsyes() {
		return petsyes;
	}

	public WebElement getGuestapply() {
		return guestapply;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getAddtotrips() {
		return addtotrips;
	}

	public WebElement getMessagebox() {
		return messagebox;
	}

	public WebElement getSave() {
		return save;
	}
	
	
	
	
	
	
	
	
	
	
}
