package page_Functionality;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Login_Function extends MainClass {

	public void Screenshot() throws IOException {

		File file = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Users\\Admin\\eclipse-workspace\\OrangeHRM\\ScreenShots\\DashBoard.jpeg");
		FileUtils.copyFile(file, file2);
	}

}
