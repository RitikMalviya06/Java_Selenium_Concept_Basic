package timepass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dropdown.Selectionmethod;
import net.bytebuddy.asm.Advice.Enter;

public class Blinkit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://blinkit.com/");                             // Launch the application blinkit 
		driver.findElement(By.xpath("//input[@name='select-locality']")).sendKeys("411057",Keys.ENTER);
		//Thread.sleep(3000);
		WebElement rk = driver.findElement(By.xpath("(//div[text()='Marunji, Maharashtra 411057, India'])"));
		Select dd = new Select(rk);
		dd.selectByIndex(1);
		/*driver.findElement(By.xpath("//button[text()='Detect my location']")).click();  // click on delete button 
		Thread.sleep(7000);
		
		// click  on search bar 
		
		driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']")).sendKeys("biscuits");*/
	}

}
