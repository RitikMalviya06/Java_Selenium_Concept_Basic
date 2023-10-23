package assigment;
// ctrl+shift+c
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@class='img-responsive'and(@alt='U.S. Polo Assn. Men White Clarkin Sneakers')]")).click();
		for(String wh:driver.getWindowHandles())
		{
			if(!wh.equals(parent))
			{
				driver.switchTo().window(wh);
				driver.findElement(By.xpath("//p[@class='size-buttons-unified-size'and(text()='8')]")).click();
				//driver.findElement(By.xpath("//input[@class='pincode-code']")).sendKeys("444606");
				//driver.findElement(By.xpath("//input[@class='pincode-check pincode-button']")).click();
				
				driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
				//driver.findElement(By.xpath("//input[@class='pincode-code']")).sendKeys("444606");
				//driver.findElement(By.xpath("//input[@class='pincode-check pincode-button']")).click();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ']")).click();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='itemComponents-base-invisibleBackDrop']")).click();
				driver.findElement(By.xpath("//div[text()='ENTER PIN CODE']")).click();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='pincode']")).sendKeys("444606");
				driver.findElement(By.xpath("//div[@class='checkDelivery-base-checkBtn checkDelivery-base-valid']")).click();
				driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkRemove']")).click();
				driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton 'and(text()='REMOVE')]")).click();
			}
		}
	}

}
