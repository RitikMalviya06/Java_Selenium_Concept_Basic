package takesScreenShot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;


public class ScreenShotsWay4_1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.selenium.dev/");
	    Thread.sleep(2000);
	    EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
	    File src = ewf.getScreenshotAs(OutputType.FILE);
		   File dest = new File("./Screenshots/seleniumss4.1.png");
		    
		    //store the screenshot into dest
		    Files.copy(src, dest);	    
	}

	
		
	}


