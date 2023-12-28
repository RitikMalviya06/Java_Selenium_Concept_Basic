package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAncestorway2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']/ancestor::div[@class='w-full rounded-lg']/descendant::input[@id='name']")).sendKeys("ritik");
		driver.findElement(By.xpath("(//input[@id='password']/ancestor::div[@class='relative overflow-hidden']/descendant::input[@id='email'])")).sendKeys("ritikmalviya06@gmail.com");
		driver.findElement(By.xpath("(//input[@id='name']/ancestor::div[@class='w-full rounded-lg']/descendant::input[@id='password'])")).sendKeys("RKmalviya06@");
	}

}
