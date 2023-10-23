package synchronizationPackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[@onClick='setTimeout(myFunction,3000)']")).click();
		
		driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
		
		//driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		//driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
	}
	

}
