
package com.automationPractice.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.SignInPage;

public class MyAccountPageTest extends TestBase {

	HomePage homepage;
	SignInPage signInpage;
	MyAccountPage myAccountPage;

	@BeforeMethod
	public void setUp() {
		intialsation();
		homepage = new HomePage();
		myAccountPage = new MyAccountPage();
		signInpage = new SignInPage();

	}

	@Test
	public void verifyUserCanLogin() {
		signInpage = homepage.clickSignInBtn();

		signInpage.enterEmail(prop.getProperty("email"));
		signInpage.enterPassword(prop.getProperty("password"));
		myAccountPage = signInpage.clickSignInBtn();

		String messageActual = myAccountPage.getTextFromMessage();
		Assert.assertEquals(messageActual, prop.getProperty("successMessageOnMyAccountPage"),
				"Message doesn't match!!!");

	}

	@Test
	public void shoppingPageClick() {
		homepage.clickSignInBtn();
		signInpage.clickSignInBtn();
		myAccountPage.clickWomenbtn();

	}

	@AfterMethod
	public void closeBrowser() {
		// tearDown();
	}

}
