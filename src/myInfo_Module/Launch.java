package myInfo_Module;

public class Launch extends Covid_19 {
	public void closeBrowser() {
		d.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Launch launch = new Launch();
		launch.applaunch();
		launch.pictureupload();
		launch.FileDownload();
		launch.salary_access();
		launch.contact_details_ESS();
		launch.social_Media_Details();
		launch.emergency_CD();
		launch.dependent_details();
		launch.immigration_details();
		launch.workweek();
		launch.report();
		launch.qualification();
		launch.member_ship();
		launch.direct_depo();
		launch.covid();
		launch.closeBrowser();
	}

}
