package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfBlueStone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.bluestone.com/");
		// handle pop up 
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		// switch the controls to frame
		// identify frame and store it is a web emlement 
		//WebElement frame = driver.findElement(By.xpath("fc_widget"));
		
	//	driver.switchTo().frame(6); // int index 
		
		driver.switchTo().frame("fc_widget"); // string naME ID
		
		//driver.switchTo().frame(frame);// web element frame elment 
		
		// cllick on chat box
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		Thread.sleep(2000);
		// handle all text box present inside chatbox
		
		// all the text box are designed under main webpage so switch back to main web pages 
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("ritik");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("ritik0699@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//a[text()='Start Chat']"));
		
		
	}

}
