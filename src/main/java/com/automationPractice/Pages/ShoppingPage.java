package com.automationPractice.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.BasePackage.TestBase;

public class ShoppingPage extends TestBase {
	Select select;

	public ShoppingPage() {

		PageFactory.initElements(wd, this);
	}

	// tshirt selection click
	@FindBy(css = ".product_img_link")
	WebElement fadedtshirt;

	// quantity
	@FindBy(css = "#quantity_wanted")
	WebElement addQuantity;

//Size selction
	@FindBy(id = "group_1")
	WebElement selectSize;

	// add to cart
	@FindBy(css = "#add_to_cart")
	WebElement addToCart;

	// proceed to checkout
	@FindBy(css = "a[class='btn btn-default button button-medium']")
	WebElement proceedCheckoutBtn;

	public void clickOnItem() {
		fadedtshirt.click();

	}

	public void quantityAdd() {
		addQuantity.clear();
		addQuantity.sendKeys("2");
		// addQuantity.click();
	}

	public void sizeSelection() {
		Select sizeSelect = new Select(selectSize);
		sizeSelect.selectByValue("3");
	}

	public void addCart() {
		addToCart.click();
	}

	public ShoppingCartSummaryPage clickProceedToCheckout() {
		proceedCheckoutBtn.click();
		return new ShoppingCartSummaryPage();
	}

	

	public ShoppingCartSummaryPage tshirtShop() {

		clickOnItem();
		wd.switchTo().frame(0);
		quantityAdd();
		sizeSelection();
		addCart();
		wd.switchTo().defaultContent();
		return clickProceedToCheckout();

	}

}
