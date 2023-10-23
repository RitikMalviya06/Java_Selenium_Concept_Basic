package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSychronize {
	
		public static void main(String[] args) throws InterruptedException  {
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			 driver.get("https://www.flipkart.com/");
			 
			 driver.findElement(By.xpath("//span[@role='button']")).click();
			 driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			 //driver.findElement(By.xpath("//a[text()='Login']")).click();
			// Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[(@class='_2KpZ6l _1sbqEe _3AWRsL')]")).click();
			// driver.quit();
			 

		}
}
