package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class BillingAddressPage extends TestBase {
	public BillingAddressPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "textarea[name='message']")
	WebElement sendMessageText;

	@FindBy(css = "button.btn.btn-default.button-medium")
	WebElement proceedToCheckOutButton;

	public void enterMessage(String sendMessage) {
		sendMessageText.sendKeys(sendMessage);
	}

	public ShippingPage proceedToCheckoutClick() {
		proceedToCheckOutButton.click();
		return new ShippingPage();
	}
}
