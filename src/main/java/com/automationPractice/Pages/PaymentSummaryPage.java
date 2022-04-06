package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class PaymentSummaryPage extends TestBase {
	public PaymentSummaryPage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(css = "button.button.btn.btn-default.button-medium")
	WebElement confirmOrderSubmitBtn;

	public OrderConfirmationFinalPage clickConfirm() {
		confirmOrderSubmitBtn.click();
		return new OrderConfirmationFinalPage();
	}
}
