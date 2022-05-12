package myInfo_Module;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	

	public class Report_to extends Work_Week {
		
		public void report() throws InterruptedException {

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();
		
		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[7]/a")).click();
		Thread.sleep(3000);
		//Negative Testing
		d.findElement(By.name("listField.name")).click(); // actually it won't work 
		String report = d.getTitle();
		System.out.println("Sub Module : "+report+ "is Displayed");
	}
	}


