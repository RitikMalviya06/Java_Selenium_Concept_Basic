package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		/* driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.quit();*/
		 
	}

}



