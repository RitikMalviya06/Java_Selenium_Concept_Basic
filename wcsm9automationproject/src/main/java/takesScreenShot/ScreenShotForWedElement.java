package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotForWedElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		 WebElement rk = driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[6]"));
		 Thread.sleep(2000);
		 TakesScreenshot ts = (TakesScreenshot)rk;
		 File kk = ts.getScreenshotAs(OutputType.FILE);
		 Thread.sleep(2000);
		 File rk1 = new File("./Screenshots/flipkart.png");
		 Files.copy(kk, rk1);
		
	}

}
