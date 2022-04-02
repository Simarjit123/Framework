package com.automationPractice.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.ShoppingCartSummaryPage;
import com.automationPractice.Pages.ShoppingPage;
import com.automationPractice.Pages.SignInPage;

public class ShoppingCartSummaryTest extends TestBase {
	HomePage homepage;

	SignInPage signInpage;
	MyAccountPage myAccountPage;
	ShoppingPage shoppingPage;
	ShoppingCartSummaryPage shoppingCartSummary;

	@BeforeMethod
	public void setUp() {
		intialsation();
		homepage = new HomePage();

		signInpage = homepage.clickSignInBtn();
		myAccountPage = signInpage.clickSignInBtn();
		shoppingPage = myAccountPage.clickWomenbtn();
		shoppingCartSummary = shoppingPage.tshirtShop();
	}

	@Test
	public void cartSummary() {
//Delete from cart
		shoppingCartSummary = new ShoppingCartSummaryPage();
		/*
		 * shoppingCartSummary.deleteItem();
		 * 
		 * String cartEmptyMessage = shoppingCartSummary.getAlertMessage();
		 * 
		 * Assert.assertEquals(cartEmptyMessage, "Your shopping cart is empty.",
		 * "Text not available");
		 * System.out.println("Your cart is empty assertion passed");
		 */
		shoppingCartSummary.summary();
		// go back to women page to shop again

		// shoppingCartSummary.clickAddressCheckout();
	}

}
