package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependant_Independant2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=14746378697762135649&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone15",Keys.ENTER);
		WebElement rk = driver.findElement(By.xpath("(//span[text()='iPhone 15 (128 GB) - Blue'and(@class='a-size-medium a-color-base a-text-normal')]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole'])[1]"));
		String kr = rk.getText();
		System.out.println(kr);
		driver.quit();
	}

}
