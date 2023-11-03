package handleDisable;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OmayoDisable {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('tb2').value='ritik'");
		WebElement ritik = driver.findElement(By.xpath("//input[@id='tb2']"));
		Thread.sleep(2000);
		File src = ritik.getScreenshotAs(OutputType.FILE);
		File kk = new File("./Screenshots/ritik.png");
		Files.copy(src, kk);
		
		
		
	}

}
