package com.automationPractice.Pages;

//page to click on SignIn Button

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Utils.Utils;

public class HomePage extends TestBase {

	public HomePage() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(css = ".header_user_info")
	WebElement signInBtn;

	@FindBy(css = "#search_query_top")
	WebElement searchBox;

	@FindBy(css = "button[name='submit_search']")
	WebElement searchBtn;

	public SignInPage clickSignInBtn() {
		Utils.clickOnElement(signInBtn);
		return new SignInPage();
	}

	public SearchItemPage searchProduct(String itemSearch) {
		Utils.sendData(searchBox, itemSearch);
		Utils.clickOnElement(searchBtn);
		return new SearchItemPage();
	}

}
