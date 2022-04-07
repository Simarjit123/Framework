package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Utils.Utils;

public class FollowUsSocialMediaPage extends TestBase {
	public FollowUsSocialMediaPage() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
	WebElement fbIcon;

	@FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
	WebElement twtIcon;

	public void facebookIconClick() {
		Utils.javascriptClick(fbIcon);
	}

	public void twitterIconClick() {
		Utils.javascriptClick(twtIcon);
	}
}
