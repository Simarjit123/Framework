package com.automationPractice.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.ShoppingPage;
import com.automationPractice.Pages.SignInPage;

public class ShoppingPageTest extends TestBase {

	HomePage homepage;
	SignInPage signInpage;
	MyAccountPage myAccountPage;
	ShoppingPage shoppingPage;

	@BeforeMethod
	public void setUp() {
		intialsation();

		homepage = new HomePage();
		homepage.clickSignInBtn();

		signInpage = new SignInPage();
		signInpage.clickSignInBtn();

		myAccountPage = new MyAccountPage();
		myAccountPage.clickWomenbtn();

		shoppingPage = new ShoppingPage();

	}

	@Test
	public void shopping() {
		shoppingPage.tshirtShop();
	}

	@AfterMethod
	public void closeBrowser() {
		// tearDown();
	}

}
