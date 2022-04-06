package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class OrderPaymentMethodPage extends TestBase {
	public OrderPaymentMethodPage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(css = ".bankwire")
	WebElement payByBank;

	public PaymentSummaryPage paymentMethod() {
		payByBank.click();
		return new PaymentSummaryPage();

	}
}
