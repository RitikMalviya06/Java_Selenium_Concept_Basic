package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		// 
		String authe = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		Set<String> all = driver.getWindowHandles();
		for(String wh:all)
		{
			if(!authe.equals(wh))
			{
				driver.switchTo().window(wh);
				
			}
			
		}
		Thread.sleep(2000);
		loginCredsOf_auth();
		
	}
	public static void loginCredsOf_auth() throws AWTException
	{
		Robot robot = new Robot();
		
		// username 
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);     // key press 
		robot.keyRelease(KeyEvent.VK_TAB);     // key release 
		
		// password 
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		//robot.key
		
		
		
		
	
	}

}
