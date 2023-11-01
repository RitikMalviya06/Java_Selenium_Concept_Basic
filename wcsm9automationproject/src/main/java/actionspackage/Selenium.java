package actionspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.selenium.dev/");
		WebElement rk = driver.findElement(By.xpath("//span[text()='Downloads']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(rk).perform();
		
		//context method 
		
		
	}

}
