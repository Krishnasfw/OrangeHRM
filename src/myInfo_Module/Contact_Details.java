package myInfo_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Contact_Details extends Salary_Details {

	public void contact_details_ESS() throws InterruptedException {

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();

		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[1]/a")).click();
		Thread.sleep(3000);

		WebElement address1 = d.findElement(By.id("street1"));
		address1.clear();
		address1.sendKeys("HRC 6 Winnepeg");

		d.findElement(By.id("emp_oth_email")).clear();
		d.findElement(By.id("emp_oth_email")).sendKeys("abcd123@gmail.com");
		/*
		 * d.findElement(By.id("country_inputfileddiv")).click();
		 * d.findElement(By.xpath("//input[@value='Canada']")).click();
		 */

		d.findElement(By.id("modal-save-button")).click();
		
		//attachment
		// Positive Testing
		d.findElement(By.xpath("//a[text()='Add']")).click();
		// Document is upload as < 5MB and in the format of doc
		d.findElement(By.id("filename")).sendKeys("C:\\Users\\Admin\\Desktop\\Testing Data\\Contact Detail File.docx");

		d.findElement(By.id("description")).sendKeys("Contact details attachment");
		Thread.sleep(3000);
		//d.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
		
		d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();
		
		/*
		 * // Negative Testing d.findElement(By.xpath("//a[text()='Add']")).click(); //
		 * Document is upload as > 5MB and in the format of pdf
		 * d.findElement(By.id("filename")).
		 * sendKeys("C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf"
		 * );  modal-save-button
		 * 
		 * d.findElement(By.id("description")).
		 * sendKeys("This is the file for contact details attachment");
		 * d.findElement(By.id("modal-save-button")).click();
		 */
		String Contact = d.getTitle();
		System.out.println("Sub Module : "+Contact+ "is Displayed");
	}
}
