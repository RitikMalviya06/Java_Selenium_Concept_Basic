package testNGAnnotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BestTest {
	static WebDriver driver;
  @BeforeMethod
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	  driver.get("https://www.google.com");
  }
 @AfterMethod
 public void setDown()
 {
	driver.quit(); 
 }
 
}
