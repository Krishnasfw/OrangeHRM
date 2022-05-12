package myInfo_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

public class Main_Class {
	WebDriver d;
	
	public void applaunch () throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
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