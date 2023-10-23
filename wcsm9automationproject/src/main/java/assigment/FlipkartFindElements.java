package assigment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Laptops");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(text()='Brand')]")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='HP')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='13 MORE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='Core i7')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Processor Generation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='11th Gen')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='4★ & above')]")).click();
		Thread.sleep(2000);
		// List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		// List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']//descendant::div[@class='_30jeq3 _1_WHN1']"));
		/*List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']"));
		
		 Thread.sleep(2000);
		 for(WebElement op:laptops)                           // laptops and prices and details 
		 {
			 String ps = op.getText();
			 Thread.sleep(2000);
			 System.out.println(ps);
		 }*/
		 List<WebElement> Allpc = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 List<WebElement> Allpri = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']//descendant::div[@class='_30jeq3 _1_WHN1']"));
		 for(int i=0;i<Allpc.size();i++)
		 {
			 String pc = Allpc.get(i).getText();            // laptops and prices only
			 for(int j=i;j<=i;j++)
			 {
				String pi = Allpri.get(j).getText();
				System.out.println(pc+" "+pi);
			 }
		 }
		
	}

}
