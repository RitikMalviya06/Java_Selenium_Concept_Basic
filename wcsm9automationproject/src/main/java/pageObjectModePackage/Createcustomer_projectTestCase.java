package pageObjectModePackage;

import java.io.IOException;

public class Createcustomer_projectTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// to open & close browesr
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		// read the data from property and excal file 
		
		Flib flib = new Flib();
		
		// to perfrom valid login use to login pages of pom class 
		
		LoginPages lp = new LoginPages(driver);
		lp.validLogin(flib.readDataFromProperty(PROP_PATH,"username"),flib.readDataFromProperty(PROP_PATH, "Password"));
		Thread.sleep(2000);
		
		// to work task module use home pages pom
		HomePage hp = new HomePage(driver);
		hp.click_on_Tasks();
		Thread.sleep(2000);
		
		// to create customer & poject use tasks pages pom 
		
		TasksPage tp = new TasksPage(driver);
		tp.createcustomer_createproject_method(flib.readDateFromExcel(EXCEL_PATH,CUSTOMER_PROJECT_SHEET , 1, 0),flib.readDateFromExcel(EXCEL_PATH, CUSTOMER_PROJECT_SHEET, 1, 1));
		Thread.sleep(2000);
		
	}

}
