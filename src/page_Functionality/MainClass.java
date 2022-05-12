package page_Functionality;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
@Listeners(listener.Listeners.class)
public class MainClass {
	WebDriver d;
	
	public void BrowserIntiate() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Selenium Jar\\chromedriver.exe");
		 d = new ChromeDriver();
		d.get("http://keshavaraj7-trials7401.orangehrmlive.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("d1BnR@1eBX");
		d.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(9000);
		
	}
}