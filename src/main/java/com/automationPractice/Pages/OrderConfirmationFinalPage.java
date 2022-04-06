package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class OrderConfirmationFinalPage extends TestBase {
	public OrderConfirmationFinalPage() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(className = "cheque-indent")
	WebElement orderConfirmationSummary;

	public String getOrderConfirmation() {
		return orderConfirmationSummary.getText();
	}
}
