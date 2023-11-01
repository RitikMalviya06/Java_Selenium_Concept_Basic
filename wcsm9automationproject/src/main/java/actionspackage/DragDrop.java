package actionspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		
		// all 
		WebElement rk1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement rk2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		Thread.sleep(2000);
		WebElement rk3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement rk4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Thread.sleep(2000);
		// 
		WebElement kr1 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		WebElement kr2 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		Thread.sleep(2000);
		WebElement kr3 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
		WebElement kr4 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
		
		
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(rk1, kr1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(rk2, kr2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(rk3, kr3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(rk4, kr4).perform();
		
		
		
	}

}
