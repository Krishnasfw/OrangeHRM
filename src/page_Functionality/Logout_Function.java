package page_Functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Logout_Function  extends Login_Function {
	
	public void logout() throws InterruptedException {
		d.findElement(By.id("user-dropdown")).click();

		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
		System.out.println("Login with Other UserID and Password");
		Thread.sleep(3000);
		
		
	}

}

