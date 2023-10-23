package dropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementDuplicates {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("file:///D:/html/Dropdown.html");
		
		// identify dropdown and store it in ref verible 
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='idddd']"));
		
		// get all option of menu drop down 
		Select pd1 = new Select(dd1);
		 List<WebElement> allop = pd1.getOptions();
		 
		 // to eliminate  duplicates we use hash set  
		 HashSet<String> rk = new HashSet<String>();
		 
		 // read the list by using for loop and elimate duplicates 
		 for(int i=0;i<allop.size();i++)
		 {
			 WebElement op = allop.get(i);
			 
			 // get the text of webelement 
			 String dd2 = op.getText();
			 
			 System.out.println(dd2);
			 Thread.sleep(2000);
			 
			 rk.add(dd2);
		 }
		 Thread.sleep(2000);
		 // read the option from hashset by using for each loop 
		 for(String opt:rk)
		 {
			 Thread.sleep(2000);
			 System.out.println(opt);
		 }
		
	}

}
