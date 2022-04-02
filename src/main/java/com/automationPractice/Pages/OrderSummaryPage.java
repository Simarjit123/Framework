package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class OrderSummaryPage extends TestBase {

	public OrderSummaryPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "button[name='processAddress']")
	WebElement addressCheckout;

	public OrderSummaryPage clickAddressCheckout() {
		addressCheckout.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new OrderSummaryPage();

	}
	public OrderSummaryPage addressCheckout() {
		clickAddressCheckout();
		return clickAddressCheckout();
		
	}
}
