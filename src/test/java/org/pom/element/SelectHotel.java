package org.pom.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pom.demo.AdctinProject.Base;

public class SelectHotel extends Base {

	public SelectHotel() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement radionBtn;
	@FindBy(id = "continue")
	private WebElement contiueBtn;

	public WebElement getRadionBtn() {
		return radionBtn;
	}

	public WebElement getContiueBtn() {
		return contiueBtn;
	}

}
