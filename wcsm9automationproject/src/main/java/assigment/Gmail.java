package assigment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
	public static void main(String[] args) {
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		  driver.get("https://www.google.com/gmail/about/");
		
	
	
	
	
	
	}

}
