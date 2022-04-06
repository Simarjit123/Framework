package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.automationPractice.BasePackage.TestBase;

public class ShoppingOrderPage extends TestBase {

	public ShoppingOrderPage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(css = "i.icon-trash")
	WebElement productDeleteButton;

	@FindBy(css = "#total_price")
	WebElement totalPrice;

	@FindBy(css = "a.button.btn.btn-default.standard-checkout.button-medium")
	WebElement proceedToCheckOutButton;

	public String getTotalPrice() {
		return totalPrice.getText();
	}

	public ShoppingOrderPage deleteProductFromCart() {

		productDeleteButton.click();
		return new ShoppingOrderPage();
	}

	@FindBy(css = "p[class='alert alert-warning']")
	WebElement deletedMessage;

	public String getDeletedText() {
		return deletedMessage.getText();
	}

	public BillingAddressPage proceedToCheckOut() {
		proceedToCheckOutButton.click();
		return new BillingAddressPage();
	}
}
