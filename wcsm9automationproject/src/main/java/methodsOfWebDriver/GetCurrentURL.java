package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mk/login.do");
		Thread.sleep(2000);
		String loginCurrentURL=driver.getCurrentUrl();
		System.out.println(loginCurrentURL);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
