package myInfo_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Qualification extends Report_to {

	public void qualification() throws InterruptedException {

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();
		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[8]/a")).click();
		Thread.sleep(3000);
		// Add Button
		// d.findElement(By.xpath("//*[@id=\"addButton\"]/div/a/i/span")).click();

		// workexperience
		Actions a = new Actions(d);

		WebElement addbutton = d.findElement(By.xpath("//*[@id=\"addButton\"]/div/a/i/span"));
		a.moveToElement(addbutton).perform();
		Thread.sleep(6000);
		WebElement workexperience = d
				.findElement(By.xpath("//*[@id=\"additem-options-dropdown-qualifications\"]/li[1]/a"));
		workexperience.click();
		d.findElement(By.id("employer")).sendKeys("ABD 17");
		d.findElement(By.id("jobtitle")).sendKeys("All rounder");
		d.findElement(By.id("from_date")).sendKeys("Tue, 08 Aug 2006");
		d.findElement(By.id("to_date")).sendKeys("Mon, 14 Jun 2021");
		d.findElement(By.id("comments")).sendKeys("Good");
		//d.findElement(By.id("modal-save-button")).click();// save button
		 d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// Cancel
		Thread.sleep(2000);
		// qualify
		Actions a1 = new Actions(d);

		WebElement addbutton1 = d.findElement(By.xpath("//*[@id=\"addButton\"]/div/a/i/span"));
		a1.moveToElement(addbutton1).perform();
		Thread.sleep(6000);
		WebElement educate = d.findElement(By.xpath("//*[@id=\"additem-options-dropdown-qualifications\"]/li[2]/a"));
		educate.click();
		d.findElement(By.id("educationId"));
		Select edu_type = new Select(d.findElement(By.id("educationId")));
		edu_type.selectByIndex(1);
		d.findElement(By.id("institute")).sendKeys("AANNAAAA UNIVERSALCITY");
		d.findElement(By.id("major")).sendKeys("Easily Understanding");
		d.findElement(By.id("year")).sendKeys("2019");
		d.findElement(By.id("score")).sendKeys("7.5");
		//d.findElement(By.id("modal-save-button")).click();// save button
		 d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// Cancel button

		// skills()
		Actions a2 = new Actions(d);

		WebElement addbutton2 = d.findElement(By.xpath("//*[@id=\"addButton\"]/div/a/i/span"));
		a2.moveToElement(addbutton2).perform();
		Thread.sleep(6000);
		WebElement skillss = d.findElement(By.xpath("//*[@id=\"additem-options-dropdown-qualifications\"]/li[3]/a"));
		skillss.click();
		d.findElement(By.id("skillId"));
		Select skillset = new Select(d.findElement(By.id("skillId")));
		skillset.selectByIndex(1);
		d.findElement(By.id("years_of_exp")).sendKeys("3");
		d.findElement(By.id("comments")).sendKeys("Good");
		//d.findElement(By.id("modal-save-button")).click();// save button
		 d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();//
		// Cancel
		Thread.sleep(3000);

		// Language
		Actions a3 = new Actions(d);

		WebElement addbutton3 = d.findElement(By.xpath("//*[@id=\"addButton\"]/div/a/i/span"));
		a3.moveToElement(addbutton3).perform();
		Thread.sleep(6000);
		WebElement language = d.findElement(By.xpath("//*[@id=\"additem-options-dropdown-qualifications\"]/li[4]/a"));
		language.click();
		// Language
		d.findElement(By.id("langId"));
		Select lang = new Select(d.findElement(By.id("langId")));
		lang.selectByIndex(2);

		d.findElement(By.id("fluency"));
		Select lang1 = new Select(d.findElement(By.id("fluency")));
		lang1.selectByIndex(1);

		d.findElement(By.id("competency"));
		Select lang2 = new Select(d.findElement(By.id("competency")));
		lang2.selectByIndex(3);

		d.findElement(By.id("comments")).sendKeys("Language is must");

		//d.findElement(By.id("modal-save-button")).click();// save button
		d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// Cancel
		Thread.sleep(3000);

		// License 

		Actions a4 = new Actions(d);

		WebElement addbutton4 = d.findElement(By.xpath("//*[@id=\"addButton\"]/div/a/i/span"));
		a4.moveToElement(addbutton4).perform();
		Thread.sleep(6000);
		WebElement license = d.findElement(By.xpath("//*[@id=\"additem-options-dropdown-qualifications\"]/li[5]/a"));
		license.click();

		d.findElement(By.id("licenseId"));
		Select lice = new Select(d.findElement(By.id("licenseId")));
		lice.selectByIndex(2);

		d.findElement(By.id("licenseNo")).sendKeys("TN3800QEEw57554");
		//d.findElement(By.id("modal-save-button")).click();// save button
	 d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();//cancel
		Thread.sleep(3000);
		// Attachments
		d.findElement(By.xpath("//a[text()='Add']")).click();
		// Positive Testing
		// Document is upload as < 5MB and in the format of doc
		d.findElement(By.id("filename")).sendKeys("C:\\Users\\Admin\\Desktop\\Testing Data\\Qualification Details.docx");

		d.findElement(By.id("description")).sendKeys("Contact details attachment");
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
		 String qualification = d.getTitle();
			System.out.println("Sub Module : "+qualification+ "is Displayed");

		// d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();//
		// close button
	}

}
