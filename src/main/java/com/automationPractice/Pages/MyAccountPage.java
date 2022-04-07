
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

	@FindBy(css = "a[title='Addresses']")
	WebElement addressBtn;

	@FindBy(css = ".address_address1")
	WebElement cityNameText;

	@FindBy(css = ".sf-with-ul")
	WebElement womenBtnClick;

	@FindBy(css = ".logout")
	WebElement accountLogut;

	public String customerLoginName() {
		return Utils.getTextFromWebelement(customerName);
	}

	public void clickAddress() {
		Utils.clickOnElement(addressBtn);
	}

	public String getCitytext() {
		return Utils.getTextFromWebelement(cityNameText);
	}

	public WomenPage clickWomenbtn() {
		Utils.clickOnElement(womenBtnClick);
		return new WomenPage();
	}

	public void logoutBtnClick() {
		Utils.clickOnElement(accountLogut);

	}

	@FindBy(css = "#social_block")
	WebElement followUsLink;

	public FollowUsSocialMediaPage moveTofollowUs() {
		Utils.scrollIntoViewUsingJavascript(followUsLink);
		return new FollowUsSocialMediaPage();
	}

}
