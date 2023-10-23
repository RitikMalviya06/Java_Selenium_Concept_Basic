package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlemethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		// get title of current webpages 
		//String titleofpage = driver.getTitle();
		//System.out.println(titleofpage);
		System.out.println(driver.getTitle());
		//Thread.sleep(2000);
		
		
		
	}

}
