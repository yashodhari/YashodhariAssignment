package com.trello.qspider.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloAddListPage {
    WebDriver driver;
    public TrelloAddListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath ="//span[text()='Add a list']")
	private WebElement list;
	public WebElement getList() {
		return list;
	}

	@FindBy(xpath = "//input[@placeholder=\"Enter list title…\"]")
	private WebElement enterListName;
	public WebElement getEnterListName() {
		return enterListName;
	}

	}



