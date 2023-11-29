package keyWordDriverFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt   =new BaseTest();// to launch the browser and close the browser 
	   Flib flib = new Flib();//to read data from property file
		bt.openBrowser();
		WebElement usnTB=driver.findElement(By.name("username"));//identify username Text box
		usnTB.sendKeys(flib.readDataFromProperty(PROP_PATH, "Username"));
		WebElement passTB=driver.findElement(By.name("pwd"));//identify password Text Box
		passTB.sendKeys(flib.readDataFromProperty(PROP_PATH, "Password"));

		driver.findElement(By.id("loginButton")).click();//identify login Button and click
		Thread.sleep(2000);
		bt.closeBrowser();
	
		
		
	}
	

}
