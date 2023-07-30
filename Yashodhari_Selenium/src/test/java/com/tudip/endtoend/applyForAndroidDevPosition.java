package com.tudip.endtoend;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class applyForAndroidDevPosition 
{

	public static void main(String[] args) throws Throwable 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tudip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='I accept']")).click();
		Actions action=new Actions(driver);
		//Click on careeroption 
		WebElement careerOption = driver.findElement(By.cssSelector("a[title='Careers']"));
		action.moveToElement(careerOption).perform();
		WebElement openPosition = driver.findElement(By.xpath("//a[text()='Open Positions']"));
		openPosition.click();
		
		//Using JavascriptExecutor interface for scrolling and click on androidDeveloper option
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for (; ;) 
		{
		try 
		    {
				 WebElement androidDeveloper = driver.findElement(By.xpath("//h3[text()='Android Developer']"));
				 androidDeveloper.click();
				 break;
			} 
			catch (NoSuchElementException e) 
			{
				jse.executeScript("window.scrollBy(0,500)");
				
			}
		}
		Thread.sleep(3000);
		//Using Actions Class for scroll the webpage
		action.scrollByAmount(0, 700).perform();
		WebElement applyForJob = driver.findElement(By.xpath("//div[@class='job_application application']/p/a/input[@type='button']"));
		applyForJob.click();
		
		//Login to the application
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("yashodharikhot@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		password.sendKeys("123456");
		
		//Click on signup button
		WebElement signupButton = driver.findElement(By.xpath("//div[@class='signUpDiv1']"));
		signupButton.click();
		//Click on Apply button
		driver.findElement(By.xpath("//span[text()='Apply']")).click();
		WebElement highestQualificationdropdown = driver.findElement(By.xpath("//select[@id='course']"));
		//Select qualification
		Select qualificationdrpdown = new Select(highestQualificationdropdown);
		qualificationdrpdown.selectByVisibleText("MSc");
		Thread.sleep(2000);
		//Select position
		WebElement position = driver.findElement(By.xpath("//select[@formcontrolname='position']"));
		Select positiondrpdown = new Select(position);
		positiondrpdown.selectByVisibleText("Android Developer");
		//Select experience
		WebElement experience = driver.findElement(By.xpath("//select[@formcontrolname='experience']"));
		Select expdropdown = new Select(experience);
		expdropdown.selectByVisibleText("2 - 5 years");
		//chooseFile and upload Resume
		/*WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
		chooseFile.sendKeys("C:\\Users\\91995\\Desktop\\Yashodhari Resume(1)-1 (1).pdf");*/
		//Click on submit button
		WebElement submitbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitbutton.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}