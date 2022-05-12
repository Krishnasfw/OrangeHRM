package myInfo_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Direct_Deposit extends Member_ship{

	public void direct_depo() throws InterruptedException {
		
		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();
		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[7]/a/span[2]")).click();
		Thread.sleep(3000);
		 String dd = d.getTitle();
			System.out.println(dd);

	}

}
