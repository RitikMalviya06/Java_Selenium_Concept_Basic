package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		/*driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		  driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		  
		  // mutiple select drop down 
		  //=driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		  WebElement cy = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		  Select yc = new Select(cy);*/
		driver.get("file:///D:/html/multipleselectdropdown.html");
		WebElement dp1 = driver.findElement(By.xpath("//select[@id='idddd']"));
		Select pd1 = new Select(dp1);
		for(int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			pd1.selectByIndex(i);
		}
		List<WebElement> opall = pd1.getAllSelectedOptions();
		/*for(int i=0;i<opall.size();i++)
		{
			Thread.sleep(2000);
			String op = opall.get(i).getText();
			Thread.sleep(2000);
			System.out.println(op);
		}*/
		
		for(WebElement os:opall)
		{
			String opp = os.getText();
			Thread.sleep(2000);
			System.out.println(opp);
		}
		  
	
	}

}
