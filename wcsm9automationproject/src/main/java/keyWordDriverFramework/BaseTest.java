package keyWordDriverFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest extends Flib {
	static WebDriver driver;
	public void openBrowser() throws IOException {
		Flib flib= new Flib();
		 String browservalue = flib.readDataFromProperty("./src/main/resources/config.properties","browservalue");
		 String url = flib.readDataFromProperty("./src/main/resources/config.properties","url");
		 if(browservalue.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(browservalue.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
				
			}
			else if(browservalue.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			
	}

	
}
