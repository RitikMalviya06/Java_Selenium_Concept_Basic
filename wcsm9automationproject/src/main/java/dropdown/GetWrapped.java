package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrapped {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("file:///D:/html/Dropdown.html");
		//single select 
		Thread.sleep(2000);
		
		
		// get wrapped method 
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='idddd']"));
		Select pd1 = new Select(dd1);
		WebElement all = pd1.getWrappedElement();
		System.out.println(all.getText());
		
		
		// get options method 
		List<WebElement> option = pd1.getOptions();
		for(WebElement op:option)
		{
			Thread.sleep(2000);
			System.out.println(op.getText());
			
		}
		
		// select from drop down without using selection method
		for(WebElement op:option)
		{
			if(op.getText().equals("coldcoffee"))
			{
				op.click();
				break;
				
			}
		}
	}

}
