package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {
	
	//explicit type cast into takes screen shot 
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		// take screenshot of the webpages 
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// call the method 
		Thread.sleep(2000);
		File rk = ts.getScreenshotAs(OutputType.FILE);
		
		// define way for storing rk screenshots 
		// retive pathc 
		File dest = new File("./Screenshots/seleniumss5.png");
		
		// store the screenshots into dest 
		Files.copy(rk, dest);
		
		
		
	}

}
