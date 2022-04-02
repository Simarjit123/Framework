
package com.automationPractice.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
//import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.SignInPage;

public class SignInPageTest extends TestBase {
	SignInPage signInPage;
	MyAccountPage myAccountPage;
	HomePage homePage;

	@BeforeMethod
	public void setUp() {
		intialsation();
		signInPage = new SignInPage();
		homePage = new HomePage();
		myAccountPage = new MyAccountPage();
	}

	@Test
	public void verifySignIn() {
		signInPage = homePage.clickSignInBtn();
		signInPage.enterEmail(prop.getProperty("email"));
		signInPage.enterPassword(prop.getProperty("password"));

		signInPage.clickSignInBtn();
	}

	
}