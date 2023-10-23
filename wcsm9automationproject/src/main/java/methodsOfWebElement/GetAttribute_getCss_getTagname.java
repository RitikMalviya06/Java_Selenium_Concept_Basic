package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_getCss_getTagname {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement ritik = driver.findElement(By.xpath("//button[@type='submit']"));
		String rk = ritik.getAttribute("class");
		System.out.println(rk);
		
		WebElement cs = driver.findElement(By.xpath("//button[@type='submit']"));
		String css = cs.getCssValue("width");
		System.out.println(css);
		
		 WebElement tag = driver.findElement(By.xpath("//button[@type='submit']"));
		 String na = tag.getTagName();
		 System.out.println(na);
		
	}

}
