package com.trello.qspider.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUserCreateBoardsPage {

	WebDriver driver;

	public TrelloUserCreateBoardsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='Show menu']")
	private WebElement boardMenuOption;

	public WebElement getBoardMenuOption() {
		return boardMenuOption;
		
	}
	
	@FindBy(xpath ="//a[contains(., 'More')]")
	private WebElement clickmoreOption;

	public WebElement getClickmoreOption() {
		return clickmoreOption;
	}
	
	@FindBy(xpath = "//a[contains(.,'Close board…')]")
	private WebElement closeBoard;

	public WebElement getCloseBoard() {
		return closeBoard;
	}

	@FindBy(css="input[value='Close']")
	
	private WebElement closeButton;

	public WebElement getCloseButton() {
		return closeButton;
	}
	
	@FindBy(xpath = "//button[text()='Permanently delete board']")
	
	private WebElement permentlyDeleteBoard;

	public WebElement getPermentlyDeleteBoard() {
		return permentlyDeleteBoard;
	}
	
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement delete;

	public WebElement getDelete() {
		return delete;
	}
}



