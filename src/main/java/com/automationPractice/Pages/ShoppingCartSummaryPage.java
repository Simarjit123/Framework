package com.automationPractice.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.automationPractice.BasePackage.TestBase;

public class ShoppingCartSummaryPage extends TestBase {

	public ShoppingCartSummaryPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "a[title='Delete']")
	WebElement deleteBtn;

	@FindBy(className = "alert")
	WebElement shoppingCartEmptyAlert;

	public ShoppingCartSummaryPage deleteItem() {
		deleteBtn.click();

		return new ShoppingCartSummaryPage();

	}

	public String getAlertMessage() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return shoppingCartEmptyAlert.getText();
	}

	public OrderSummaryPage summary() {
		deleteItem();
		getAlertMessage();
		return new OrderSummaryPage();
	}

}
