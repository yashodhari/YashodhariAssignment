package com.trello.qspider.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginButton {
		WebDriver driver;
		public TrelloLoginButton(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//input[@id='login']")
	   private WebElement LoginButton;
		
		public WebElement getLoginButton() {
			return LoginButton;
		}		
}
