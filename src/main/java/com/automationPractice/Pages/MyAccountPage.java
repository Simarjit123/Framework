
package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = ".sf-with-ul")
	//(css = ".sf-with-ul")
	WebElement womenBtnClick;

	public WomenPage clickWomenbtn() {
		womenBtnClick.click();
		return new WomenPage();
	}

}
