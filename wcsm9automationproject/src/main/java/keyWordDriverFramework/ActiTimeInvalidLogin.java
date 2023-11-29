package keyWordDriverFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException {
		// to launch the browser and close the browser 
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		// to read the data frome excel files 
		Flib flib = new Flib();
		//bt.openBrowser();
		int rc=flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds");
		for(int i=1;i<=rc;i++)
		{
		String inusnData = flib.readDateFromExcel(EXCEL_PATH, INVALIDCREEDS_SHEET, i, 0);
		String inpwdData = flib.readDateFromExcel(EXCEL_PATH,INVALIDCREEDS_SHEET , i, 1);
		
		
		
		// identify username text box 
		
		
		WebElement usnTB=driver.findElement(By.name("username"));
		usnTB.sendKeys(inusnData);
		
		//  identify pwd text box 
		
		WebElement passTB=driver.findElement(By.name("pwd"));
		passTB.sendKeys( inpwdData);
		
		// identify login button and click
		
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
		
		}
		bt.closeBrowser();
	}

}
