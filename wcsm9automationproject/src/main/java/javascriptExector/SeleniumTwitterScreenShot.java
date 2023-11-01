package javascriptExector;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SeleniumTwitterScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,5000)");
		WebElement tw = driver.findElement(By.xpath("//a[@aria-label='Selenium in Twitter']"));
		 Thread.sleep(2000);
		 TakesScreenshot ts = (TakesScreenshot)tw;
		 File kk = ts.getScreenshotAs(OutputType.FILE);
		 Thread.sleep(2000);
		 File rk1 = new File("./Screenshots/twitter.png");
		 Files.copy(kk, rk1);
		 
		 /* get the loc of twitrer 
		 point loc = twittersymbol .getlocation();
		 int x axis = loc.getx();
		 int y axis = loc .get ();
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollby("+xaxis+","+yaxis+")")*/
		 
		 // way 2 for scroll till particular webelement 
		 
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
		
		
	}

}
