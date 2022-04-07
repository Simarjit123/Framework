package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Utils.Utils;

public class BillingAddressPage extends TestBase {
	public BillingAddressPage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(css = "textarea[name='message']")
	WebElement sendMessageText;

	@FindBy(css = "button.btn.btn-default.button-medium")
	WebElement proceedToCheckOutButton;

	public ShippingPage enterMessage(String sendMessage) {
		Utils.sendData(sendMessageText, sendMessage);

		return null;
	}

	public ShippingPage proceedToCheckoutClick() {
		Utils.clickOnElement(proceedToCheckOutButton);
		
		return new ShippingPage();
	}
}
