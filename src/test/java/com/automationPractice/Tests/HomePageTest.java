package com.automationPractice.Tests;

import org.testng.annotations.BeforeMethod;

import org.testng.asserts.SoftAssert;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;

public class HomePageTest extends TestBase {
	HomePage homepage;;

	SoftAssert sassert;

	@BeforeMethod
	public void setUp() {
		homepage = new HomePage();
		initialization();
	}

}
