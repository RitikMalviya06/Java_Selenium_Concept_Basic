package locatorsPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Airvistara {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
		//driver.findElement(By.xpath("//button[@id='acceptAllBtn']")).click();
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PNQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("DXB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='31']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
		//Alert a1 = driver.switchTo().alert();
		//a1.accept();
		//driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
		driver.quit();
	}

}
