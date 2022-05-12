package myInfo_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Social_Media extends Contact_Details {

	public void social_Media_Details() throws InterruptedException {

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();

		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[2]/a/span[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("#socialMediaDiv > div > a > i")).click();// add button
		// Positive Testing
		d.findElement(By.id("typeId"));
		Select type = new Select(d.findElement(By.id("typeId")));
		type.selectByIndex(2);
		d.findElement(By.id("profileName")).sendKeys("Administrator");

		//d.findElement(By.id("allowShare")).click();
		//d.findElement(By.id("modal-save-button")).click();
		d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// Cancel
		 
		/*
		 * //Negative Testing d.findElement(By.id("typeId")); Select type1 = new Select
		 * (d.findElement(By.id("typeId"))); type1.selectByIndex(2);
		 * d.findElement(By.id("profileName")).sendKeys(" "); //pass null value to
		 * mandatory field d.findElement(By.id("modal-save-button")).click();
		 */
		String social_media = d.getTitle();
		System.out.println("Sub Module : "+social_media+ "is Sucsessfully updated");
	}

}
