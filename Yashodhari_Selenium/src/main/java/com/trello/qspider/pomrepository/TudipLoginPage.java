package com.trello.qspider.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TudipLoginPage {
	
  WebDriver driver;
  public TudipLoginPage (WebDriver driver)
  {
	  this.driver=driver;
		PageFactory.initElements(driver, this);
  }
  

}
