package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		//drag webelement
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		//drop webelement
		WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act =  new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		
		
		

	}

}
