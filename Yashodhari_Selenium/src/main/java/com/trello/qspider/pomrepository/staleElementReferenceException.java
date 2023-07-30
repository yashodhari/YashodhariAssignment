package com.trello.qspider.pomrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class staleElementReferenceException {

	@Test
	
	public void testUserName() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement untbx=driver.findElement(By.id("username"));	
		WebElement pwtbx=driver.findElement(By.id("password"));
		driver.navigate().refresh();
		untbx.sendKeys("admin");
		pwtbx.sendKeys("manager");	
	}
}
