package pageObjectModePackage;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException {
		// to open & close browser 
		BaseTest bt = new BaseTest();
		bt.setUp();
		// get login pages frome the pom class web element
		LoginPages lp = new LoginPages(driver);
		// read the data excel sheet 
		Flib flib = new Flib();
		// read the row count 
		int rc = flib.rowCount(EXCEL_PATH, INVALIDCREEDS_SHEET);
		for(int i=1;i<=rc;i++)
		{
			// get the method from to pefrom invalid login from loginpages from pom class 
			//lp.invalidLogin(flib.readDateFromExcel(EXCEL_PATH, INVALIDCREEDS_SHEET, i, 0)),flib.readDateFromExcel(EXCEL_PATH, INVALIDCREEDS_SHEET, i, 1);
			lp.invalidLogin(flib.readDateFromExcel(EXCEL_PATH, INVALIDCREEDS_SHEET, i,0),flib.readDateFromExcel(EXCEL_PATH, INVALIDCREEDS_SHEET, i,1));
		}
		bt.tearDown();
	}

}
