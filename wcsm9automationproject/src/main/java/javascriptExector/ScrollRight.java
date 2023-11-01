package javascriptExector;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(2000);
		// java perfrom scroll right
		Thread.sleep(2000);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(5000,0)");
				
				
		
	}

}
