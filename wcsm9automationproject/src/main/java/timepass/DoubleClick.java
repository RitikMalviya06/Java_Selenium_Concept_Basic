package timepass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/button?sublist=0");
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(driver.findElement(By.xpath("//button[@id='btn20']"))).perform();
		act.doubleClick(driver.findElement(By.xpath("//button[@id='btn22']"))).perform();
		act.doubleClick(driver.findElement(By.xpath("//button[@id='btn28']"))).perform();
		driver.quit();
	}

}
