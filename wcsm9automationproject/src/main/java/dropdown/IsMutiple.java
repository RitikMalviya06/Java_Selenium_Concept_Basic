package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMutiple {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		// single select
		 WebElement dropdowm1 = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		  Select dp1 = new Select(dropdowm1);
		  boolean sp = dp1.isMultiple();
		  System.out.println(sp);
		  
		  // mutiple select
		  
		  driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		   WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		    Select dp2 = new Select(dropdown2);
		    boolean sp2 = dp2.isMultiple();
		    System.out.println(sp2);
		    
		  
	}
	

}
