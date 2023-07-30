package RobotClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintPopup {
	WebDriver driver;
@Test
	public void robotPrint() throws Throwable {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_P);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_1);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_MINUS);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_2);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_ENTER);
	//driver.findElement(By.cssSelector("cr-button[class='action-button']")).click();
	Thread.sleep(2000);
}
}
	
	
	
	
		

	


