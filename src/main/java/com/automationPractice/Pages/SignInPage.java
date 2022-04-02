package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class SignInPage extends TestBase {

	public SignInPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "email")
	WebElement emailInput;

	@FindBy(id = "passwd")
	WebElement passwordInput;

	@FindBy(id = "SubmitLogin")
	WebElement signInBtn;

	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}


	public MyAccountPage clickSignInBtn() {
		signInBtn.click();
		return new MyAccountPage();
	}

}
