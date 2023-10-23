package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {
	public static void main(String[] args) throws InterruptedException {
		//lauch the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		// lauch the webapplication
		driver.get("https://www.flipkart.com/");
		// with 2 sec
		Thread.sleep(2000);
		driver.close();
		
		
	}

}


