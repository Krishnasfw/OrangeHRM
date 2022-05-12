package myInfo_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Salary_Details extends Job_Details {

	public void salary_access() {
		d.findElement(By.xpath("//span[text()='My Info']")).click();

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"top-menu\"]/li[3]/a")).click();
		// Negative Testing
		WebElement dropdown = d
				.findElement(By.xpath("//*[@id=\"pim_salary_details\"]/div[3]/form/div[1]/oxd-decorator[1]"
						+ "/div/div[1]/div/div[2]/div/button"));
		dropdown.click();

		/*
		 * Select paygrade = new Select(dropdown); paygrade.selectByIndex(2);// ESS user
		 * is not able to change the salary panel.
		 */
		String salary = d.getTitle();
		System.out.println("Sub Module : "+salary+ "is Displayed");
		
	}

}
