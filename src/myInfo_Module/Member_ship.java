package myInfo_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Member_ship extends Qualification {

	public void member_ship() throws InterruptedException {

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();
		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[9]/a/span[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\\\"addButton\\\"]/div/a/i/span")).click();
		d.findElement(By.id("membership"));

		Select membership = new Select(d.findElement(By.id("membership")));
		membership.selectByIndex(4);

		d.findElement(By.id("subscriptionPaidBy"));

		Select paid = new Select(d.findElement(By.id("subscriptionPaidBy")));
		paid.selectByIndex(2);

		d.findElement(By.id("subscriptionCurrency"));

		Select currency = new Select(d.findElement(By.id("subscriptionCurrency")));
		currency.selectByIndex(2);
		//d.findElement(By.id("modal-save-button")).click();// save button
		d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// Cancel

		// Attachments
		d.findElement(By.xpath("//a[text()='Add']")).click();
		// Positive Testing
		// Document is upload as < 5MB and in the format of doc
		d.findElement(By.id("filename")).sendKeys("C:\\Users\\Admin\\Desktop\\Testing Data\\Membership Details.docx");

		d.findElement(By.id("description")).sendKeys(" MemberShip details attachment");
		//d.findElement(By.id("modal-save-button")).click();
		 d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();//cancel


		/*
		 * // Negative Testing d.findElement(By.xpath("//a[text()='Add']")).click(); //
		 * Document is upload as > 5MB and in the format of pdf
		 * d.findElement(By.id("filename")).
		 * sendKeys("C:\\Users\\sanjais\\Desktop\\HP Lap\\For File UpLoad Testing.pdf");
		 * 
		 * d.findElement(By.id("description")).
		 * sendKeys("This is the file for contact details attachment");
		 * d.findElement(By.id("modal-save-button")).click();// save button
		 */		
		 String member = d.getTitle();
			System.out.println("Sub Module : "+member+ "is Displayed");

		//d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// close button

	}

}
