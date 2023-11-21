package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.google.com");
		/*Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		// click on google apps link 
		//driver.findElement(By.xpath("//div[@aria-label='Google apps']")).click();
		driver.findElement(By.className("gb_d")).click();
		
		// before clicking on maps switch contrls to frame
		// identify frame and store its as web element 
		WebElement frameElement = driver.findElement((By.name("app"));
		
		// click on google map
		Thread.sleep(2000);
		driver.switchTo().frame(1);   // int index
		
		//driver.switchTo().frame(null)  // string name or id 
		//driver.switchTo().frame(null)
		// click on google map
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Maps']")).click();*/
		//click on Google apps link
				driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
				
				//before clicking on maps switch controls to frame
				//identify frame and store it as WebElement
				WebElement frameElement = driver.findElement(By.name("app"));
				
				Thread.sleep(2000);
				//driver.switchTo().frame(1); //int index
				//driver.switchTo().frame("app");//string name or id
				driver.switchTo().frame(frameElement);
				Thread.sleep(2000);
				//click on Google map
				driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
	}

}
