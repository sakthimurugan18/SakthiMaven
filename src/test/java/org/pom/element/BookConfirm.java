package org.pom.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pom.demo.AdctinProject.Base;

public class BookConfirm extends Base {

	public BookConfirm() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderNo;
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logOut;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getLogOut() {
		return logOut;
	}
}
