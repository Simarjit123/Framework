package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class ShippingPage extends TestBase {
	public ShippingPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#cgv")
	WebElement selectCheckBox;

	@FindBy(css = "button.btn.btn-default.standard-checkout.button-medium")
	WebElement shippingProceedToCheckout;

	public void checkBoxSelection() {
		selectCheckBox.click();

	}

	public OrderPaymentMethodPage proceedToPaymentShipping() {
		shippingProceedToCheckout.click();
		return new OrderPaymentMethodPage();
	}

}
