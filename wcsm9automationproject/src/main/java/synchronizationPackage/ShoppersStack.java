package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.shoppersstack.com/");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		//driver.findElement(By.cssSelector("button[name='loginBtn']")).click();
		driver.findElement(By.xpath("//span[text()='SAMSUNG']")).click();
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("444606");
		//driver.findElement(By.xpath("//button[@id='Check']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-1hw9j7s')]")).click();
		// apply explicit 
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
	}

}

	


