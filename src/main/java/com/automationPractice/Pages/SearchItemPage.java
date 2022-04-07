package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Utils.Utils;

public class SearchItemPage extends TestBase {

	public SearchItemPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);
	}

	@FindBy(css = "span.lighter")
	WebElement searchResult;

	public String getSeachedItemText() {
		return Utils.getTextFromWebelement(searchResult);

	}
}
