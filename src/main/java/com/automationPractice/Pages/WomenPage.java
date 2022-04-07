package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Utils.Utils;

public class WomenPage extends TestBase {
	public WomenPage() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	// tshirt selection click
	@FindBy(css = ".product_img_link")
	WebElement fadedtshirt;

	// quantity
	@FindBy(css = "#quantity_wanted")
	WebElement addQuantity;

	// Size selction
	@FindBy(id = "group_1")
	WebElement selectSize;

	// add to cart
	@FindBy(css = "#add_to_cart")
	WebElement addToCart;

	// proceed to checkout
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	// a[@title='Proceed to checkout']
//FindBy(css = "a[class='btn btn-default button button-medium']")
	WebElement proceedCheckoutBtn;

	public void selectItem() {
		Utils.clickOnElement(fadedtshirt);

	}

	@FindBy(className = "fancybox-iframe")
	WebElement switchIframe;

	public void switchToIframe() {
		Utils.switchToFrame(switchIframe);
	}

	public void quantityAdd(String quantity) {
		addQuantity.clear();

		Utils.sendData(addQuantity, quantity);
	}

	public void sizeSelection(String size) {

		Utils.selectFromDropDownUsingVisibleText(selectSize, size);

	}

	public void addCart() {
		Utils.clickOnElement(addToCart);
	}

	public ShoppingOrderPage clickProceedToCheckout() {
		Utils.clickOnElement(proceedCheckoutBtn);
		return new ShoppingOrderPage();
	}

	public ShoppingOrderPage tshirtShop(String quantity, String size) {

		Utils.clickOnElement(fadedtshirt);
	
		Utils.switchToFrame(switchIframe);

		Utils.sendData(addQuantity, quantity);
		Utils.selectFromDropDownUsingVisibleText(selectSize, size);
		Utils.clickOnElement(addToCart);
		wd.switchTo().defaultContent();
		return clickProceedToCheckout();

	}
}
