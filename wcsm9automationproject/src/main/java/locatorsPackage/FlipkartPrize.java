package locatorsPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone15",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> rk = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(2000);
		//List<WebElement> ss = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		/*for(int i=0;i<rk.size();i++)
		{
			String name = rk.get(i).getText();
			for(int j=i;j<=i;j++)
			{
				String prize = ss.get(j).getText();
				System.out.println(name+" : "+prize);
			}
		}*/
		for(WebElement name:rk)
		{
			String phone = name.getText();
			String prize = driver.findElement(By.xpath("//div[text()='"+phone+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
			System.out.println(phone+" : "+prize);
		}
		
	}

}
