package actionspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement yess = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		WebElement noo = driver.findElement(By.xpath("(//button[text()='No'])[2]"));
		WebElement rk = driver.findElement(By.xpath("//button[text()='5']"));
		//Thread.sleep(2000);
		Actions act = new Actions(driver);
		//Thread.sleep(2000);
		act.doubleClick(yess).perform();
		Thread.sleep(2000);
		act.doubleClick(noo).perform();
		Thread.sleep(2000);
		act.doubleClick(rk).perform();
		
		

		
		
		
		
	}

}
