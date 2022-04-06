package com.automationPractice.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;

import com.automationPractice.Pages.ShoppingOrderPage;
import com.automationPractice.Pages.SignInPage;
import com.automationPractice.Pages.WomenPage;
import com.automationPractice.Utils.Utils;

public class ShoppingOrderPageTest extends TestBase {
	HomePage homepage;
	SignInPage signinPage;
	MyAccountPage myAccountPage;
	WomenPage womenPage;
	ShoppingOrderPage shoppingOrderPage;

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
		signinPage = homepage.clickSignInBtn();
		signinPage.enterEmail(prop.getProperty("email"));
		signinPage.enterPassword(prop.getProperty("password"));
		myAccountPage = signinPage.clickSignInBtn();
	}

	@Test
	public void verifyUsercanDeleteFromCart() {

		womenPage = myAccountPage.clickWomenbtn();
		shoppingOrderPage = womenPage.tshirtShop(prop.getProperty("quantity"), prop.getProperty("size"));

		shoppingOrderPage.deleteProductFromCart();

		Utils.staticWait(2000);

		String successfulDeletedMessage = shoppingOrderPage.getDeletedText();
		System.out.println("Deleted message: " + successfulDeletedMessage);
		Assert.assertEquals(successfulDeletedMessage, prop.getProperty("deletedCartMessage"),
				"item deleted message not available");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
