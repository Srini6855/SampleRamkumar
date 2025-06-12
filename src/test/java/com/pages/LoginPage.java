package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUsernam;
	@FindBy(id = "password")
	private WebElement txtPassword;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(xpath = "//div[@class='auth_error']//b")
	private WebElement txtErrorMessage;

	public WebElement getTxtErrorMessage() {
		return txtErrorMessage;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void enterCredentials(String username, String password) {
		elementSendKeys(txtUsername, username);
		elementSendKeys(txtPassword, password);
	}

	public void clickLogin() {
		elementClick(btnLogin);
	}

	public String actualText() {
		return elementGetText(txtErrorMessage);
	}
}
