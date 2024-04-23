package timepass;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/button?sublist=0");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Thread.sleep(2000);
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement drag2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement drop2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement drop3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		WebElement drag4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement drop4 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag1, drop1).perform();
		act.dragAndDrop(drag2, drop2).perform();
		act.dragAndDrop(drag3, drop3).perform();
		act.dragAndDrop(drag4, drop4).perform();
		driver.quit();
	}

}
