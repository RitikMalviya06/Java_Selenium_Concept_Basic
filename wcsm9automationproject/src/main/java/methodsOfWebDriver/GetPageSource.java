package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://mk/login.do"/*"https://www.netflix.com/in/"*/);
		 Thread.sleep(2000);
		String loginpagesourcecode =driver.getPageSource();
		System.out.println(loginpagesourcecode);
		driver.quit();
	}

}

