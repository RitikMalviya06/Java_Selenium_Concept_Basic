package listenerPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;



public class BaseTest {
	static WebDriver driver;
	
  @BeforeMethod
  public void setUp()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("http://127.0.0.1/login.do");
  }
  public void failedMethod(String failName)
  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File drc = new File("./Screenshots/"+failName+".png");
	  Files.copy(src, drc);
	  try
	  {
		  Files.copy(src, drc); 
	  }
	  catch(exception e)
	  {
		  
	  }
	  @AfterMethod
	  public void setDown()
	  {
		  
	  }
	  
  }
}
