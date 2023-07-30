package com.trello.qspider.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogInToContinue {

	WebDriver driver;

	public TrelloLogInToContinue(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id ="password")
	private WebElement passwordTextField;

	public WebElement getPasswordTextField() {
		return passwordTextField;

	}
	@FindBy(id="login-submit")
	private WebElement LoginButton;

	public WebElement getLoginButton() {
		return LoginButton;
	}
	}

	

