
package com.automationPractice.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.xml.dom.Tag;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.SignInPage;
import com.automationPractice.Utils.Utils;

public class MyAccountPageTest extends TestBase {
	HomePage homepage;
	SignInPage signinPage;
	MyAccountPage myAccountPage;
	SoftAssert sassert;

	@BeforeMethod
	public void setUp() {
		initialization();

		/*
		 * homepage = new HomePage(); signinPage = new SignInPage();
		 */
		homepage = new HomePage();
		signinPage = homepage.clickSignInBtn();
		signinPage.enterEmail(prop.getProperty("email"));
		signinPage.enterPassword(prop.getProperty("password"));
		myAccountPage = signinPage.clickSignInBtn();
	}

	@Test
	public void verifyAccountNameAndLogut() {
		// Asserting customer name at Account page
		sassert = new SoftAssert();
		sassert.assertEquals(myAccountPage.customerLoginName(), prop.getProperty("customerName"), "name doesn't match");
		// Logut button click
		myAccountPage.logoutBtnClick();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
