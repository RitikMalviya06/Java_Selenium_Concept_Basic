package assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
	public static void Flipkart(String Product)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
        driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("watches ");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='Titan')]")).click();	
		
	}
	public static void main(String[] args) {
		
		//Flipkart()	
	}

}
