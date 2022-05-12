package page_Functionality;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Listeners;

public class Page_Launch extends Logout_Function {
	public void  browserclose() {
		d.close();
	}
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		Page_Launch logfunction = new Page_Launch();
		logfunction.BrowserIntiate();
		logfunction.Screenshot();
		logfunction.logout();
		logfunction.browserclose();
	}

}
