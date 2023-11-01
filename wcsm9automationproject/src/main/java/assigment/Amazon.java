package assigment;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// all filter start RK
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'and(text()='Puma')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='See more, Brands']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'and(text()='Skechers')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'and(text()='Over ₹5,000')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='8']")).click();
		Thread.sleep(2000);
		WebElement lk = driver.findElement(By.xpath("(//div[@class='puis-card-container s-card-container s-overflow-hidden aok-relative puis-expand-height puis-include-content-margin puis puis-v3vtwxgppca0z12v18v51zrqona s-latency-cf-section puis-card-border'])[4]"));
		Thread.sleep(2000);
		  System.out.println(lk.getText());
		// all filter end RK
		String parent= driver.getWindowHandle();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]")).click();
	    for(String wh:driver.getWindowHandles())
	    {
	    	if(!wh.equals(parent))
	    	{
	    		driver.switchTo().window(wh);
	    		driver.findElement(By.xpath("//select[@id='quantity']")).click();
	    		driver.findElement(By.xpath("//option[@value='2']")).click();
	    		Thread.sleep(4000);
	    		driver.findElement(By.xpath("//select[@id='quantity']")).click();
	    		driver.findElement(By.xpath("//option[@value='1']")).click();
	    		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	    		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	    	}
	    }
		
	}

}
