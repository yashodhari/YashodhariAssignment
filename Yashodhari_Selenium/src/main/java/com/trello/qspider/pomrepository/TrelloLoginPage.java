package com.trello.qspider.pomrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
@Test
public class TrelloLoginPage {
WebDriver driver;
public TrelloLoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@id='user']")
private WebElement username;

public WebElement getUsername() {
	return username;
}


@FindBy(xpath = "//input[@value='Continue']")
private WebElement logintocontinue;

public WebElement getocontinueButton() {
	return logintocontinue;
}
}






