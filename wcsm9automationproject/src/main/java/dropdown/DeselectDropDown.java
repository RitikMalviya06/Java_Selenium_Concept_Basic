package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("file:///D:/html/multipleselectdropdown.html");
		
		driver.findElement(By.xpath("//select[@id='idddd']")).click();
		  WebElement rk1 = driver.findElement(By.xpath("//option[@value='v1']"));
		    Select kr1 = new Select(rk1);
		    kr1.selectByValue("v1");
	}

}
