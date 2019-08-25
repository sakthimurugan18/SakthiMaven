package org.pom.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pom.demo.AdctinProject.Base;

public class BookHotel extends Base {

	public BookHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billAddress;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardNo;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardType;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement cardExpMonth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement cardExpYear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvNo;
	@FindBy(id = "book_now")
	private WebElement bokNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillAddress() {
		return billAddress;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExpMonth() {
		return cardExpMonth;
	}

	public WebElement getCardExpYear() {
		return cardExpYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBokNow() {
		return bokNow;
	}
}
