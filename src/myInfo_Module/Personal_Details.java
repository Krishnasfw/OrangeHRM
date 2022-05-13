package myInfo_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Personal_Details extends Main_Class {

	public void pictureupload() throws InterruptedException {

		d.findElement(By.xpath("//span[text()='My Info']")).click();

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		// Positive Testing

		d.findElement(By.xpath("//*[@id=\"right-side\"]/header/div[1]/nav/div/div/ul[2]/li[1]/img")).click();
		Thread.sleep(8000);
		// Picture is uploaded as < 1MB and in JPEG format
		d.findElement(By.id("employeePicture")).sendKeys("C:\\Users\\Admin\\Downloads\\Formal_man.png");
		d.findElement(By.xpath("//a[text()='Save']")).click();

		/*
		 * //Negative Testing d.findElement(By.xpath(
		 * "//*[@id=\"right-side\"]/header/div[1]/nav/div/div/ul[2]/li[1]/img")).click()
		 * ; Thread.sleep(8000); //Document is upload as > 5MB and in the format of PDF
		 * d.findElement(By.id("employeePicture")).
		 * sendKeys("C:\\Users\\sanjais\\Desktop\\HP Lap\\For File UpLoad Testing.pdf");
		 * d.findElement(By.xpath("//a[text()='Save']")).click();
		 */

		WebElement namElement = d.findElement(By.id("firstName"));
		namElement.clear();
		namElement.sendKeys("Smith Bravo");

		WebElement namElement1 = d.findElement(By.id("otherId"));
		namElement1.clear();
		namElement1.sendKeys("License");
		WebElement namElement2 = d.findElement(By.id("employeeId"));
		namElement2.clear();
		namElement2.sendKeys("100245");//
		WebElement Date = d.findElement(By.id("emp_birthday"));
		Date.clear();
		Date.sendKeys("Fri, 24 Mar 1995");

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("scrollBy(0,100)");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(3000);
		//attachment
				// Positive Testing
				d.findElement(By.xpath("//a[text()='Add']")).click();
				// Document is upload as < 5MB and in the format of doc
				d.findElement(By.id("filename")).sendKeys("C:\\Users\\Admin\\Desktop\\Testing Data\\Personal Details.docx");

				d.findElement(By.id("description")).sendKeys("Personal details attachment");
				Thread.sleep(3000);
				d.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
				
				//d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();

		
		String text = d.getTitle();
		System.out.println("Sub Module : "+text+ "is Displayed");
	
		/*
		 * //WebElement menu = d.findElement(By.id("top-menu-trigger")); //
		 * menu.click();
		 * 
		 * d.findElement(By.id("stickyHelpButton")).click();
		 * 
		 * d.findElement(By.id("query")).sendKeys("Orange HRM Testcase");
		 * d.findElement(By.name("submit")).click();
		 */

	}
}