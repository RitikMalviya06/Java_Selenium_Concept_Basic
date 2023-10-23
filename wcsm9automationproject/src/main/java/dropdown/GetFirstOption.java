package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("file:///D:/html/Dropdown.html");
		//single select 
		Thread.sleep(2000);
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='idddd']"));
		Select pd1 = new Select(dd1);
		pd1.selectByValue("v1");
		WebElement fo = pd1.getFirstSelectedOption();
		Thread.sleep(2000);
		System.out.println(fo.getText());
		//
		
		
		//multipe select drop down 
		driver.navigate().to("file:///D:/html/multipleselectdropdown.html");
		WebElement dd2 = driver.findElement(By.xpath("//select[@id='idddd']"));
		Thread.sleep(2000);
		Select pd2 = new Select(dd2);
		for(int i=1;i<4;i++)
		{
			Thread.sleep(2000);
			pd2.selectByIndex(i);
			
		}
		Thread.sleep(2000);
		System.out.println(pd2.getFirstSelectedOption().getText());
		
		
		
	}

}
