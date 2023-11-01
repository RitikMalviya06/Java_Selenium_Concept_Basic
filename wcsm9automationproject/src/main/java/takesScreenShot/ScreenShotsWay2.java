package takesScreenShot;




import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotsWay2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File ritik = new File("./Screenshots/seleniumss2.png");
		Files.copy(src, ritik);
		
		
	}
		// upcast into remote webdriver class 
		
		
		
	}
