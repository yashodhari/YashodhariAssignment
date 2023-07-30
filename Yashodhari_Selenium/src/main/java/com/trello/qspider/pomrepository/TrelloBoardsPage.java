package com.trello.qspider.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardsPage {
	WebDriver driver;
	public TrelloBoardsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath ="//div[@class='board-tile mod-add']")
     private WebElement createBoards;
	
	public WebElement getCreateBoards() {
		return createBoards;
	}
	
	@FindBy(css ="input[data-testid='create-board-title-input']")
	private WebElement boardTitleTextField;
	
	public WebElement getBoardTitleTextField() {
		return boardTitleTextField;
	}
	@FindBy(xpath ="//button[text()='Create']")
	private WebElement boardCreateButton;
	
	public WebElement getBoardCreateButton() {
		return boardCreateButton;
	}
		
	@FindBy(xpath = "//button[@data-testid='header-member-menu-button']")
	private WebElement userProfileMenuOption;
	
	public WebElement getUserProfileMenuOption() {
		return userProfileMenuOption;
	}

	@FindBy(xpath = "//span[contains(.,'Log out')]")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}	
	}

	/*@FindBy(xpath = "(//div[@title='Selenium'])[2]")
	private WebElement selectAndClickBoard;
	
	public WebElement getSelectAndClickBoard() {
		return selectAndClickBoard;
	}
	
	@FindBy(xpath = "https://trello.com/b/xmHuz7lc")
	private WebElement clickMoreOptiondots;
	
	public WebElement getClickMoreOptiondots() {
		return clickMoreOptiondots;
	}
	
	@FindBy(xpath="//a[@class='board-menu-navigation-item-link js-close-board']")
	private WebElement clickCloseBoardLink;
	
	public WebElement getClickCloseBoardLink() {
		return clickCloseBoardLink;
	}
		@FindBy(xpath="//input[@value='Close']")
		private WebElement closeBoard;
			
	public WebElement getCloseBoard() {
			return closeBoard;
		}
		
	@FindBy(xpath ="//button[text()='Permanently delete board']")		
	private WebElement deleteBoard;
	
	
	public WebElement getDeleteBoard() {
		return deleteBoard;
	}
	public void setDeleteBoard(WebElement deleteBoard) {
		this.deleteBoard = deleteBoard;
	}
	
	@FindBy(xpath ="//button[text()='Delete']")
	private WebElement clickdeleteBoardbutton;
	
	public WebElement getClickdeleteBoardbutton() {
		return clickdeleteBoardbutton;
	
	}
	@FindBy(xpath = "(//div[@title='Yashodhari Somankhot (yashodharisomankhot)'])[1]")
	private WebElement clickOnProfileAccount;
	
	public WebElement getClickOnProfileAccount() {
		return clickOnProfileAccount;
	}
	
	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement logOut;
	
	public WebElement getLogOut() {
		return logOut;
	}
	public WebElement getBoardCreateButton() {
		// TODO Auto-generated method stub
		return null;
	}*/


	