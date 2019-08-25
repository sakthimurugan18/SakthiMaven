package org.pom.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pom.demo.AdctinProject.Base;

public class SearchHotel extends Base {

	public SearchHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement hLocation;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotelName;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement noOfRooms;
	@FindBy(id = "adult_room")
	private WebElement roomAdult;
	@FindBy(id = "child_room")
	private WebElement rommChild;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement btnSubmit;

	public WebElement gethLocation() {
		return hLocation;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getRoomAdult() {
		return roomAdult;
	}

	public WebElement getRommChild() {
		return rommChild;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
}
