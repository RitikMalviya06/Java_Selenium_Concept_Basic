package handleDisable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableDemoQspider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Enabled Mode']")).click();
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('name').value='ritik'");
		/*Thread.sleep(2000);
		JavascriptExecutor rk = (JavascriptExecutor)driver;
		rk.executeScript("document.getElementById('email').value='ritik123@gmail.com'");
		Thread.sleep(2000);
		JavascriptExecutor kk = (JavascriptExecutor)driver;
		kk.executeScript("document.getElementById('password').value='ritik123'");
		Thread.sleep(2000);*/
		jse.executeScript("document.getElementById('email').value='ritik123@gmail.com'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('password').value='ritik123'");
		Thread.sleep(2000);
		WebElement disable = driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(2000);
		if(disable.isDisplayed())
		{
			jse.executeScript("arguments[0].click()",disable);
			System.out.println("click");
		}
		else
		{
			System.out.println("not click");	
		}
		driver.findElement(By.xpath("//a[@type='button']")).click();
	}

}
