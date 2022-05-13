package myInfo_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Covid_19 extends Direct_Deposit {

	public void covid() throws InterruptedException {

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();
		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[11]/a")).click();
		Thread.sleep(3000);

		/*
		 * WebElement vaccine =
		 * d.findElement(By.id("//*[@id=\"40_inputfileddiv\"]/div/input"));
		 * 
		 * vaccine.click();
		 * 
		 * d.findElement(By.xpath("//input[@value='Yes']")).click();
		 * 
		 * d.findElement(By.id("id=\"41_inputfileddiv\"")).click();
		 * d.findElement(By.xpath("//input[@value='Covishield (AstraZeneca )']")).click(
		 * );
		 * 
		 * d.findElement(By.xpath("//*[@id=\"42_inputfileddiv\"]/div")).click();
		 * d.findElement(By.xpath("//input[@value='2nd Dose']")).click();
		 */

		d.findElement(By.id("43")).sendKeys("Fri, 28 May 2021");
		d.findElement(By.xpath("//*[@id=\"employeePimTabsDivMuliple\"]/form/div[2]/div/button")).click();
		System.out.println("Vaccination is done");

		// Attachments
		d.findElement(By.xpath("//a[text()='Add']")).click();
		// Positive Testing
		// Document is upload as < 5MB and in the format of doc
		d.findElement(By.id("filename")).sendKeys("C:\\Users\\Admin\\Desktop\\Testing Data\\Defect management.docx");

		d.findElement(By.id("description")).sendKeys("Covid-19 Vaccination details attachment");
		d.findElement(By.id("modal-save-button")).click();
		d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// Cancel button

		/*
		 * // Negative Testing d.findElement(By.xpath("//a[text()='Add']")).click(); //
		 * Document is upload as > 5MB and in the format of pdf
		 * d.findElement(By.id("filename")).
		 * sendKeys("C:\\Users\\sanjais\\Desktop\\HP Lap\\For File UpLoad Testing.pdf");
		 * 
		 * d.findElement(By.id("description")).
		 * sendKeys("This is the file for contact details attachment");
		 * d.findElement(By.id("modal-save-button")).click();// save button String alert
		 * = d.getTitle(); System.out.println(alert);
		 * 
		 * d.findElement(By.xpath(
		 * "//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// close
		 * button
		 */

		System.out.println("All Sub Modules are Executed");
		
	}
}
