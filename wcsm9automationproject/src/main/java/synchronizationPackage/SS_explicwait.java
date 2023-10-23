package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS_explicwait {
			public static void main(String[] args)  {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.shoppersstack.com/");
			driver.findElement(By.xpath("//span[text()='SAMSUNG']")).click();
			driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("444606");
			
			//driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-1hw9j7s')]")).click();
			// apply explicit 
			
			

			}
}
