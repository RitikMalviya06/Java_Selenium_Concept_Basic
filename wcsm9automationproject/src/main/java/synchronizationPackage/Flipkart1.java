package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		//driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 15 pro");
		
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("one plus mobile");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String parent=driver.getWindowHandle();
		//driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).click();
		
	    driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).click();
	   
		   for(String wh:driver.getWindowHandles())
		   {
			   if(!wh.equals(parent))
			   {
				   driver.switchTo().window(wh);
				   driver.findElement(By.xpath("//a[text()='256 GB']")).click();
				   //driver.findElement(By.xpath("//a[text()='8 GB']")).click();
				   driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("444606");
				   driver.findElement(By.xpath("//span[text()='Check']")).click();
				  // Thread.sleep(2000);
				   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				  // Thread.sleep(4000);
				   driver.findElement(By.xpath("//div[text()='Remove'and(@class='_3dsJAO')]")).click();
				   driver.findElement(By.xpath("//div[text()='Remove'and(@class='_3dsJAO _24d-qY FhkMJZ')]")).click();
				   //driver.findElement(By.xpath(parent))
			   }
		   }
		
		//driver.findElement(By.xpath("//a[text()='256 GB']")).click();
		//driver.findElement(By.xpath("//a[text()='128 GB']")).click();
		//driver.findElement(By.xpath("//a[text()='8 GB']")).click();
		//driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("444606");
	}

}
