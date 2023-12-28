package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependant_Independant_xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone15",Keys.ENTER);
		WebElement rk = driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Black, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		String kr = rk.getText();
		System.out.println(kr);
		driver.quit();
		
	}

}
