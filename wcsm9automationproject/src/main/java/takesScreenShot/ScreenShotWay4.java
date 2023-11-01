package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay4 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.selenium.dev/");
		
		EventFiringWebDriver ewf=new EventFiringWebDriver(driver);
		File src = ewf.getScreenshotAs(OutputType.FILE);
		File ritik = new File("./Screenshots/seleniumss4.png");   // .png or .jpg
		Files.copy(src, ritik);
		
		// take a help of third party class 
		
		
	}

}
