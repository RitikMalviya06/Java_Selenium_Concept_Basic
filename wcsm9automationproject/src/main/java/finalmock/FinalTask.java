package finalmock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalTask {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		String ph = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		Set<String> all = driver.getWindowHandles();
		for(String wh:all)
		{
			if(!ph.equals(wh))
			{
		         driver.close();
			}
			
		}
	}

}
