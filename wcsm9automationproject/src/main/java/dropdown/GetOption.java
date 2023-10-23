package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		// single select
		 WebElement dropdowm1 = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		 
		 // get all the option inside in phone no
		  Select sp = new Select(dropdowm1);
		   List<WebElement> allop = sp.getOptions();
		   // we read list using  for loopp
		   
		 /*  for(int i = 0;i<allop.size();i++)
		   {
			   Thread.sleep(2000);
			   String op = allop.get(i).getText();
			   System.out.println(op);
			   
			   
		   }*/
		   // we read list by using for each loop
		   
		   for(WebElement op:allop)
		   {
			   String op1 = op.getText();
			   Thread.sleep(2000);
			   System.out.println(op1);
			   
			      
		   }
		
	}

}
