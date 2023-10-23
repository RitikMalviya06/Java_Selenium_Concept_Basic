package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 driver.get("https://www.instagram.com/accounts/login/");
		// Thread.sleep(2000);
		 
		//driver.findElement(By.name("username")).sendKeys("Text@xyz.com");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("Text@xyz.com");
		 
		//driver.findElement(By.name("password")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("Test123");
		 
		//driver.findElement(By.xpath("//html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[3]")).click();
		 driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	}

}
