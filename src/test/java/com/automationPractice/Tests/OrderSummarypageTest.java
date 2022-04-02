package com.automationPractice.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.OrderSummaryPage;
import com.automationPractice.Pages.ShoppingCartSummaryPage;
import com.automationPractice.Pages.ShoppingPage;
import com.automationPractice.Pages.SignInPage;

public class OrderSummarypageTest extends TestBase {
	HomePage homepage;

	SignInPage signInpage;
	MyAccountPage myAccountPage;
	ShoppingPage shoppingPage;
	ShoppingCartSummaryPage shoppingCartSummary;
	OrderSummaryPage osp;

	@BeforeMethod
	public void setUp() {
		intialsation();
		homepage = new HomePage();

		homepage.clickSignInBtn();
		signInpage = new SignInPage();
		myAccountPage = new MyAccountPage();
		myAccountPage.clickWomenbtn();
		shoppingPage = new ShoppingPage();
		shoppingPage.tshirtShop();

	}

	@Test
	public void checkoutOfOrder() {
		osp = new OrderSummaryPage();

		osp.clickAddressCheckout();
	}
}
