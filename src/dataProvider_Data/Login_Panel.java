package dataProvider_Data;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@Listeners(listener.Listeners.class)
public class Login_Panel {
	WebDriver d;

	@DataProvider(name = "logindata")
	public String[][] loginDataprovider() throws BiffException, IOException {
		String[][] data = getxl();
		return data;
	}

	public String[][] getxl() throws BiffException, IOException {
		String EXL = "C:\\Users\\Admin\\Documents\\Login TestData.xls";
		FileInputStream xl = new FileInputStream(EXL);
		Workbook workbook = Workbook.getWorkbook(xl);

		Sheet sheet = workbook.getSheet(0);
		int rowcount = sheet.getRows();
		int colcount = sheet.getColumns();
		String testdata[][] = new String[rowcount - 1][colcount];
		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				testdata[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testdata;
	}

	@Test(dataProvider = "logindata")
	public void logindata(String U, String P) {
		d.findElement(By.id("txtUsername")).sendKeys(U);
		d.findElement(By.id("txtPassword")).sendKeys(P);
		d.findElement(By.xpath("//button[text()='Login']")).click();
		// d.findElement(By.id("btnLogin")).click();
		//d.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@BeforeTest
	public void OpenBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Selenium Jar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://keshavaraj7-trials7401.orangehrmlive.com/");

		d.manage().window().maximize();
		Thread.sleep(3000);
	}

	@AfterTest
	public void CloseBrowser() {
		d.close();
	}
}
