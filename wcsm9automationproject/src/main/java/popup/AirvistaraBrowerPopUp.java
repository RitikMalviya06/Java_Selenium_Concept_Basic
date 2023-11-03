package popup;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AirvistaraBrowerPopUp {
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value  ");
		String rk = sc.next();
		if(rk.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver=new ChromeDriver(co);
		}
		else if(rk.equalsIgnoreCase("edge"))
		{
			EdgeOptions fo = new EdgeOptions();
			fo.addArguments("--disable-notifications");
			driver=new EdgeDriver(fo);
			
		}
		else if(rk.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions eo = new FirefoxOptions();
			eo.addArguments("--disable-notifications");
			driver=new FirefoxDriver(eo);
		}
		else 
		{
			System.out.println("value invaild ");	
		}
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=EAIaIQobChMI9LzUzcC4gQMVu8NMAh1gsQpOEAAYASAAEgIcdvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=EAIaIQobChMI9LzUzcC4gQMVu8NMAh1gsQpOEAAYASAAEgIcdvD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&gad=1");
		
	}

}


