package testAssertations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertationScriptOnOrangeHRM {
	
	static WebDriver driver;
  @BeforeMethod
  public void setUp()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1/login.do");
  }
  
  @Test
  public void testMethod() throws InterruptedException
  {
	  String LoginTittle = "actiTIME - Login";
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(),LoginTittle);
	  
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		String HomeTittle = "actiTIME - Enter Time-Track";
		
		  Assert.assertEquals(driver.getTitle(),HomeTittle);
		  Reporter.log("user created ", true);
		  
		 WebElement logout= driver.findElement(By.xpath("//a[text()='Logout']"));
		  Assert.assertEquals(logout.isDisplayed(),true);
		  logout.click();
		  sa.assertAll();
		  
		 
		
  }
}
