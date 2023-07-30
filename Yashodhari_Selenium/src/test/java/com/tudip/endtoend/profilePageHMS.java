package com.tudip.endtoend;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class profilePageHMS {

	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://106.51.75.38:9007/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("Arjun@gmail.com");
		WebElement passwordtextfield = driver.findElement(By.id("password"));
		passwordtextfield.sendKeys("123456");
		WebElement logibbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		logibbutton.click();
		Thread.sleep(2000);
		WebElement patientlink = driver.findElement(By.xpath("//span[text()='Patient']"));
		patientlink.click();
		WebElement patientbutton = driver.findElement(By.xpath("//button[contains(.,'Add Patient')]"));
		patientbutton.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("yashodhari");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("yashodharikhot@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456");
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("Bangaluru");
		WebElement phoneno = driver.findElement(By.name("phone"));
		phoneno.sendKeys("8296752581");
		WebElement dropdown = driver.findElement(By.name("sex"));
		//Select class for handle dropdown
		Select select = new Select(dropdown);
		select.selectByVisibleText("Female");
		WebElement Dob = driver.findElement(By.name("birth_date"));
		Dob.sendKeys("01/08/1998");
		WebElement age = driver.findElement(By.name("age"));
		age.sendKeys("25");
		WebElement bloodgroup = driver.findElement(By.name("blood_group"));
		//Select class for handle bloodgroup dropdown
		Select bloodgoupdropdown = new Select(bloodgroup);
		bloodgoupdropdown.selectByVisibleText("O+");
		Thread.sleep(2000);
		
		//Actions class for scroll the webpage
		/*Actions action = new Actions(driver);
		action.scrollByAmount(0, 200);
		WebElement selectimage = driver.findElement(By.xpath("//span[text()='Select image']"));
		selectimage.sendKeys("C:\\Users\\91995\\Desktop\\yash.pdg.jpg");
		WebElement submitbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitbutton.click();
		Thread.sleep(2000);*/
		
		//Login into the application for password change
		WebElement emailidpatient = driver.findElement(By.id("email"));
		emailidpatient.sendKeys("yashodharikhot@gmail.com");
		WebElement passwordtextfieldpatient = driver.findElement(By.id("password"));
		passwordtextfieldpatient.sendKeys("1234567");
		WebElement logibbutton2 = driver.findElement(By.xpath("//button[@type='submit']"));
		logibbutton2.click();
		driver.quit();

	}
}