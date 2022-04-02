package com.automationPractice.Pages;

//page to click on SignIn Button

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class HomePage extends TestBase {

	public HomePage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(css = ".header_user_info")
	WebElement signInBtn;

	public SignInPage clickSignInBtn() {
		signInBtn.click();
		return new SignInPage();

	}
}
