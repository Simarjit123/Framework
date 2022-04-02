package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class OrderConfirmationSummaryPage extends TestBase {
	public OrderConfirmationSummaryPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(className = "cheque-indent")
	WebElement orderConfirmationSummary;

	public String getOrderConfirmation() {
		return orderConfirmationSummary.getText();
	}
}
