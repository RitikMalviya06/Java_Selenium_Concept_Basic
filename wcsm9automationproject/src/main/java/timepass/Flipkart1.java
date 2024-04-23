package timepass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nothing phone",Keys.ENTER);
		
		String pk = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Nothing Phone (2) (Dark Grey, 512 GB)']")).click();
		for(String wh:driver.getWindowHandles())
		{
			if(!wh.equals(pk))
			{
				driver.switchTo().window(wh);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411057");
				driver.findElement(By.xpath("//span[text()='Check']")).click();
				//driver.findElement(By.xpath("//a[@class='_1fGeJ5'and(text()='256 GB')]")).click();
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				 JavascriptExecutor jse = (JavascriptExecutor)driver;
				 jse.executeScript("window.scrollBy(0,1500)");
				 Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='Remove']")).click();
			
			}
		}
	}

}
