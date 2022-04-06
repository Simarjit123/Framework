package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Utils.Utils;

public class SignInPage extends TestBase {

	public SignInPage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(id = "email")
	WebElement emailInput;

	@FindBy(id = "passwd")
	WebElement passwordInput;

	@FindBy(id = "SubmitLogin")
	WebElement signInBtn;

	public void enterEmail(String email) {
		Utils.sendData(emailInput, email);
	}

	public void enterPassword(String password) {
		Utils.sendData(passwordInput, password);
	}

	public MyAccountPage clickSignInBtn() {
		Utils.clickOnElement(signInBtn);
		return new MyAccountPage();
	}

}
