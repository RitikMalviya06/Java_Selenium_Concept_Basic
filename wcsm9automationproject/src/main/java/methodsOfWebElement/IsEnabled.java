package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		WebElement en = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		System.out.println(en.isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("Text@xyz.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("Test123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
		WebElement lo = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		System.out.println(lo.isEnabled());
		
		// verify login button of instagram enable or not 
		
	
		
	}

}
