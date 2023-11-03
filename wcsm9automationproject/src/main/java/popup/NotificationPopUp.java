package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	public static void main(String[] args) {
		
	// handle notification pop up in chrome browser 
	          ChromeOptions co = new ChromeOptions();
	          co.addArguments("--disable-notifications");
	          WebDriver driver=new ChromeDriver(co);
	          driver.manage().window().maximize();
	          driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=EAIaIQobChMI9LzUzcC4gQMVu8NMAh1gsQpOEAAYASAAEgIcdvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=EAIaIQobChMI9LzUzcC4gQMVu8NMAh1gsQpOEAAYASAAEgIcdvD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&gad=1");
		
	}

}
