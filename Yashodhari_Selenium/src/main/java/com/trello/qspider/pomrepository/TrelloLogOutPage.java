package com.trello.qspider.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogOutPage {
	WebDriver driver;

	public TrelloLogOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//button[@id='logout-submit']")
	private WebElement logoutPage;
    public void setLogoutPage(WebElement logoutPage) {
	this.logoutPage = logoutPage;
}	
}



