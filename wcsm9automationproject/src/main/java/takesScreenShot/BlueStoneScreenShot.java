package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BlueStoneScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions rk = new Actions(driver);
		rk.moveToElement(coins).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		Thread.sleep(2000);
		WebElement coinsfiles = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
		Thread.sleep(2000);
		File src = coinsfiles.getScreenshotAs(OutputType.FILE);
		File kk = new File("./Screenshots/bluecoins.png");
		Files.copy(src, kk);
		
		
		
	}

}
