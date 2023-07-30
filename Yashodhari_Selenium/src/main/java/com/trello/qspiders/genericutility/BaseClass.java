package com.trello.qspiders.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.trello.qspider.pomrepository.TrelloLogInToContinue;
import com.trello.qspider.pomrepository.TrelloLoginButton;
import com.trello.qspider.pomrepository.TrelloBoardsPage;
import com.trello.qspider.pomrepository.TrelloHomePage;
import com.trello.qspider.pomrepository.TrelloLoginPage;
import com.trello.qspider.pomrepository.TrelloUserCreateBoardsPage;

public class BaseClass {
	
		public WebDriver driver;
		public Actions actions;
		public TrelloLoginPage username;
		public FileUtility fileUtils = new FileUtility();
		public ExcelUtility excelUtils = new ExcelUtility();
		public WebDriverUtility webdriverUtils = new WebDriverUtility();
		
		@BeforeMethod
		public void configBeforeMethod() throws IOException {
			String browserName = fileUtils.readDataFromPropertyFile("browser");
			if (browserName.equals("chrome")) {
				driver = new ChromeDriver();
			}else if (browserName.equals("edge")) {
				driver=new EdgeDriver();
			}else if (browserName.equals("firefox")) {
			    driver=new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.get(fileUtils.readDataFromPropertyFile("url"));
		}
		
		@AfterMethod
		public void configAfterMethod() {
			driver.manage().window().minimize();
			driver.quit();
		}
			
		}

	

