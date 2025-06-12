package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchPage extends BaseClass {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username_show")
	private WebElement textUsername;

	public WebElement getTextUsername() {
		return textUsername;
	}

	public String actualText() {
		return elementGetAttribute(textUsername, "value");
	}

}
