package actionspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		// all
		WebElement rk1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement rk2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		Thread.sleep(2000);
		WebElement rk3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement rk4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		Thread.sleep(2000);
		// account bank
		WebElement kr1 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		// ammount 5000
		WebElement kr2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Thread.sleep(2000);
		// account sales
		WebElement kr3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		// ammount 5000
		WebElement kr4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Thread.sleep(2000);
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
