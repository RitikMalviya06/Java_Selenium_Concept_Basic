package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotsWay1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File ritik = new File("./Screenshots/seleniumss1.png");
		Files.copy(src, ritik);
		// directly create the object of browers specific class 
		
	}

}
