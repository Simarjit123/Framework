package com.automationPractice.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;


public class HomePageTest extends TestBase {
	HomePage homePage;

	@BeforeMethod
	public void setup() {
		intialsation();
		homePage = new HomePage();
	}

	@Test
	public void verifySignInTest() {
		homePage.clickSignInBtn();

	}

	@AfterMethod
	public void tearDown() {
//		wd.quit();
	}
}
