
package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#center_column p")
	WebElement welcomeMessageText;

	@FindBy(css = ".sf-with-ul")
	WebElement womenBtnClick;

	public String getTextFromMessage() {
		return welcomeMessageText.getText();
	}

	public ShoppingPage clickWomenbtn() {
		womenBtnClick.click();
		return new ShoppingPage();
	}

}
