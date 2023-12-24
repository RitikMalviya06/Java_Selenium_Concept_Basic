package locatorsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// link text work only tag name <a
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.partialLinkText("Regi")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("ritik");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("malviya");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("ritikmalviya069999@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("RKmalviya06@");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("RKmalviya06@");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("ritikmalviya069999@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("RKmalviya06@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

}



