package myInfo_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Depandent_Details extends Emergency_Contacts {

	public void dependent_details() throws InterruptedException {

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();
		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[4]/a/span[2]")).click();
		//d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[4]/a")).click();	
		Thread.sleep(3000);
		// Assigned Dependent
		d.findElement(By.xpath("//*[@id=\"socialMediaDiv\"]/div/a/i")).click();
		// Positive Testing
		d.findElement(By.id("name")).sendKeys("Daniel Sams");
		d.findElement(By.id("relationship_type"));
		Select relation = new Select(d.findElement(By.id("relationship_type")));
		relation.selectByIndex(2);

		d.findElement(By.id("date_of_birth")).sendKeys("Wed, 24 July 1991");
		d.findElement(By.id("relationship")).sendKeys("Friend");
		//d.findElement(By.id("modal-save-button")).click(); // save Button
		 d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// close

		// Marriage Info
		d.findElement(By.id("3")).sendKeys("--Nil--");
		d.findElement(By.id("4")).sendKeys("Wed, 04 May 2022");
		d.findElement(By.xpath("//button[text()='Save']")).click();

		// Attachments
		d.findElement(By.xpath("//a[text()='Add']")).click();
		// Positive Testing
		// Document is upload as < 5MB and in the format of doc
		d.findElement(By.id("filename")).sendKeys("C:\\Users\\Admin\\Desktop\\Testing Data\\Dependant Details.docx");

		d.findElement(By.id("description")).sendKeys("Depandent details attachment");
		//d.findElement(By.id("modal-save-button")).click();
		 d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// close

		/*
		 * // Negative Testing d.findElement(By.xpath("//a[text()='Add']")).click(); //
		 * Document is upload as > 5MB and in the format of pdf
		 * d.findElement(By.id("filename")).
		 * sendKeys("C:\Users\Admin\Desktop\Testing Data\File upload for Testing.pdf");
		 * 
		 * d.findElement(By.id("description")).
		 * sendKeys("This is the file for contact details attachment");
		 * d.findElement(By.id("modal-save-button")).click();// save button
		 */
		 String depandant = d.getTitle();
			System.out.println("Sub Module : "+depandant+ "is Done");

		// d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();//
		// Cancel

	}

}
