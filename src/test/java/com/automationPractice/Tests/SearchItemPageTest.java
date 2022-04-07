package com.automationPractice.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.SearchItemPage;
import com.automationPractice.Pages.SignInPage;
import com.automationPractice.Pages.WomenPage;
import com.automationPractice.Utils.Utils;

public class SearchItemPageTest extends TestBase {
	HomePage homepage;

	SearchItemPage searchPage;
	SoftAssert sassert;

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();

	}

// click on search button and assert the message
	@Test
	public void verifySearchItemFunction() {
		searchPage = homepage.searchProduct(prop.getProperty("itemSearch"));

		sassert = new SoftAssert();
		sassert.assertEquals(searchPage.getSeachedItemText(), "itemSearch", "Item doesn't match");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
