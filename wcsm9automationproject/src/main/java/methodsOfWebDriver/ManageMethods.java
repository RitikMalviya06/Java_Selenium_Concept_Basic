package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		// handle properties of browser max ,min ,full ,set size ,set position 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);*/
		Dimension targetsize=new Dimension(350, 450);
		driver.manage().window().setSize(targetsize);
		Thread.sleep(2000);
		Point targetposition=new Point(450, 350);
		driver.manage().window().setPosition(targetposition);
		
		
		
	}

}
