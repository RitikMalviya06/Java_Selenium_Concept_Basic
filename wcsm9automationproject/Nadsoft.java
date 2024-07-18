package my;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nadsoft {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		String home_page = driver.getCurrentUrl();
		System.out.println(home_page);
		
		driver.findElement(By.xpath("//div[@class='product-thumb transition']/descendant::img[@alt='MacBook']/ancestor::div[@class='product-thumb transition']/descendant::button[@type='button'][1]")).click();
		driver.findElement(By.xpath("//div[@class='product-thumb transition']/descendant::img[@alt='MacBook']/ancestor::div[@class='product-thumb transition']/descendant::button[@type='button'][1]")).click();
		driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
		String shopping_cart_page = driver.getCurrentUrl();
		
		System.out.println(shopping_cart_page);
		Thread.sleep(2000);
		driver.quit();
	}
}
