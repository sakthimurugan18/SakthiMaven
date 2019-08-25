package org.pom.TestRunner;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import org.pom.demo.AdctinProject.Base;
import org.pom.element.BookConfirm;
import org.pom.element.BookHotel;
import org.pom.element.LoginPage;
import org.pom.element.SearchHotel;
import org.pom.element.SelectHotel;

import junit.framework.Assert;

public class JunitTest extends Base {

	@BeforeClass
	public static void launchBrowser() {
		getBrowser();
		loadUrl("https://adactin.com/HotelApp/index.php");
		waitElement();
	}

	@Before
	public void startTime() {

		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void TC_001() {

		LoginPage login = new LoginPage();
		txtData(login.getUserName(), "Nelson1994");
		txtData(login.getPassWord(), "Nelson@123");
		btnclick(login.getLoginBtn());

		Assert.assertTrue(true);

	}

	@Test
	public void TC_002() {

		SearchHotel search = new SearchHotel();
		selByText(search.gethLocation(), "Sydney");
		selByText(search.getHotelName(), "Hotel Creek");
		selByText(search.getRoomType(), "Double");
		selByText(search.getNoOfRooms(), "2 - Two");
		selByText(search.getRoomAdult(), "1 - One");
		selByText(search.getRommChild(), "1 - One");
		btnclick(search.getBtnSubmit());

		Assert.assertTrue(true);
	}

	@Test

	public void TC_003() {
		SelectHotel selectHtl = new SelectHotel();
		btnclick(selectHtl.getRadionBtn());
		btnclick(selectHtl.getContiueBtn());
		Assert.assertTrue(true);
	}

	@Test
	public void TC_004() {
		BookHotel book = new BookHotel();
		txtData(book.getFirstName(), "Sakthi");
		txtData(book.getLastName(), "Murugan");
		txtData(book.getBillAddress(), "Sholinganullure,Chennai");
		txtData(book.getCardNo(), "4567890743565035");
		selByText(book.getCardType(), "Master Card");
		selByText(book.getCardExpMonth(), "March");
		selByText(book.getCardExpYear(), "2022");
		txtData(book.getCvvNo(), "657");
		btnclick(book.getBokNow());

		Assert.assertTrue(true);
		;
	}

	@Test
	public void TC_005() {

		BookConfirm confirm = new BookConfirm();
		attributeValue(confirm.getOrderNo());
		btnclick(confirm.getLogOut());
		Assert.assertTrue(true);
	}

	@After
	public void endTime() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterClass

	public static void tearDown() {
		drvQuit();

	}
}
