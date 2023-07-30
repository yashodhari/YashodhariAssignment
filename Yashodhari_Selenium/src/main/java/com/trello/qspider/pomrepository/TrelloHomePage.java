package com.trello.qspider.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage {
	WebDriver driver;
	public TrelloHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 @FindBy(xpath="//a[text()='Get Trello for free']/preceding-sibling :: a")
 private WebElement loginOption;

 public  WebElement getLoginOption()
 {
	 return loginOption;
 }
 
 @FindBy(xpath="//input[@name=\"email\"])[1]")
private WebElement emailIdTextFiled;

public WebElement getEmailIdTextFiled() {
	return emailIdTextFiled;
}

 
}
