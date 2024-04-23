package timepass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Dining Out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[text()='Yakii']")).click();
		driver.findElement(By.xpath("//a[text()='Book a Table']")).click();
		Thread.sleep(2000);
		WebElement rk = driver.findElement(By.xpath("(//div[@class='sc-qnejpk-9 cUZRcH'])[1]"));
		rk.click();
		Select dd = new Select(rk);
		Thread.sleep(2000);
		dd.selectByIndex(4);
		
	}

}
