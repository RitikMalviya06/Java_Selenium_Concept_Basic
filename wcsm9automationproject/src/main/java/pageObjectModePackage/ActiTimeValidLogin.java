package pageObjectModePackage;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		// to open and close browaer
		 BaseTest bt = new BaseTest();
		 bt.setUp();
		//get webelement from login page pom class
				LoginPages lp = new LoginPages(driver);
				//read data from property file 
				Flib flib = new Flib();
				Thread.sleep(4000);
				lp.validLogin(flib.readDataFromProperty(PROP_PATH,"Username"),flib.readDataFromProperty(PROP_PATH,"Password"));
				
			
				
				Thread.sleep(2000);
				bt.tearDown();

	}
	
	// to open and close browaer 
	
	

}
