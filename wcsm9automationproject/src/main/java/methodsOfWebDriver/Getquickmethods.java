package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getquickmethods {
	public static void main(String[] args) throws InterruptedException {
		//lauch the chrome browser
				WebDriver driver=new ChromeDriver();
				//maximize the window
				driver.manage().window().maximize();
				// with 2 sec
				driver.get("https://omayo.blogspot.com/");
				Thread.sleep(2000);
				driver.findElement(By.partialLinkText("Open a popup window")).click();
				Thread.sleep(2000);
				driver.quit();
				
				
	}

}
