package com.stepfinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.pages.LoginPage;
import com.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.enterCredentials(username, password);
	}

	@When("User click login button")
	public void user_click_login_button() {
		LoginPage loginPage = new LoginPage();
		loginPage.clickLogin();
	}

	@Then("User verifies the succes message after login {string}")
	public void user_verifies_the_succes_message_after_login(String expected) {
		SearchPage page = new SearchPage();
		String actualText = page.actualText();
		Assert.assertEquals(actualText, expected);
	}

	@Then("User verifies the error message after login {string}")
	public void user_verifies_the_error_message_after_login(String string) {
		LoginPage loginPage = new LoginPage();
		String actualText = loginPage.actualText();
		Assert.assertTrue(actualText.contains(string));
	}

}
