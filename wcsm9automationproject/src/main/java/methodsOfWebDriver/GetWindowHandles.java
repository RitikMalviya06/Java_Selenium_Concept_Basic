package methodsOfWebDriver;

import java.lang.annotation.Target;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://omayo.blogspot.com/");
		//Thread.sleep(2000);
		String ParentHandle=driver.getWindowHandle();
		System.out.println("address of parent browser or window "+ParentHandle);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String> AllHandles = driver.getWindowHandles();
		for(String wh:AllHandles)
		{
			if(!ParentHandle.equals(wh))
			{
				System.out.println("address of child"+wh);
				TargetLocator switchto=driver.switchTo();
				//System.out.println(switchto);
				switchto.window(wh).manage().window().maximize();
				switchto.window(wh).close();
			}
			else
			{
				System.out.println("address of parent "+wh);
			}
		}
		driver.quit();
		
		
		
		
		
	}

}
