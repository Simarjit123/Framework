package com.automationPractice.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.FollowUsSocialMediaPage;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;

public class FollowUsOnSocialMediaPageTest extends TestBase {
	HomePage homepage;
	MyAccountPage myAccountPage;

	FollowUsSocialMediaPage socialMedia;
	SoftAssert sassert;

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
		myAccountPage = new MyAccountPage();

	}

	@Test
	public void verifySocialMediaBlockFunction() {

		socialMedia = myAccountPage.moveTofollowUs();

		socialMedia.facebookIconClick();
		socialMedia.twitterIconClick();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
