
package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Utils.Utils;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(css = "a[title='View my customer account']")
	WebElement customerName;

	@FindBy(css = ".sf-with-ul")

	WebElement womenBtnClick;

	@FindBy(css = ".logout")
	WebElement accountLogut;

	public String customerLoginName() {
		return Utils.getTextFromWebelement(customerName);
	}

	public WomenPage clickWomenbtn() {
		Utils.clickOnElement(womenBtnClick);
		return new WomenPage();
	}

	public void logoutBtnClick() {
		Utils.clickOnElement(accountLogut);

	}
}
