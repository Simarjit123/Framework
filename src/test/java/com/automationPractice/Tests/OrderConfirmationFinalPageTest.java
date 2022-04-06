package com.automationPractice.Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.BillingAddressPage;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.OrderConfirmationFinalPage;
import com.automationPractice.Pages.OrderPaymentMethodPage;
import com.automationPractice.Pages.PaymentSummaryPage;
import com.automationPractice.Pages.ShippingPage;
import com.automationPractice.Pages.ShoppingOrderPage;
import com.automationPractice.Pages.SignInPage;
import com.automationPractice.Pages.WomenPage;

public class OrderConfirmationFinalPageTest extends TestBase {
	HomePage homepage;
	SignInPage signinPage;
	MyAccountPage myAccountPage;
	WomenPage womenPage;
	ShoppingOrderPage shoppingOrderPage;
	BillingAddressPage billingAddressPage;
	ShippingPage shippingPge;
	OrderPaymentMethodPage orderPaymentMethodPage;
	PaymentSummaryPage paymentpage;
	OrderConfirmationFinalPage orderFinalPage;

	@BeforeMethod

	public void setUp() {
		initialization();
		homepage = new HomePage();
		signinPage = homepage.clickSignInBtn();
		signinPage.enterEmail(prop.getProperty("email"));
		signinPage.enterPassword(prop.getProperty("password"));
		myAccountPage = signinPage.clickSignInBtn();

	}

	@Test
	public void verifyUserCanCompleteOrder() {
		womenPage = myAccountPage.clickWomenbtn();
		shoppingOrderPage = womenPage.tshirtShop(prop.getProperty("quantity"), prop.getProperty("size"));
		billingAddressPage = shoppingOrderPage.proceedToCheckOut();
		shippingPge = billingAddressPage.proceedToCheckoutClick();
		shippingPge.checkBoxSelection();
		orderPaymentMethodPage = shippingPge.proceedToPaymentShipping();
		paymentpage = orderPaymentMethodPage.paymentMethod();
		orderFinalPage = paymentpage.clickConfirm();
		String orderConfirmationMessage = orderFinalPage.getOrderConfirmation();
		Assert.assertEquals(orderConfirmationMessage, prop.getProperty("confirmationMessage"));

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}