package robatmenthod;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;


	public class BlueStone {
		public static void main(String[] args) throws InterruptedException, AWTException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.get("https://www.bluestone.com/");
			driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
			Thread.sleep(2000);
			WebElement breadc = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.moveToElement(breadc).perform();
			driver.findElement(By.xpath("//a[text()='Band']")).click();
			WebElement filter = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
			act.doubleClick(filter).perform();
			Thread.sleep(2000);
			
			act.clickAndHold(filter).perform();
			Thread.sleep(2000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_C);
			WebElement Searchbox = driver.findElement(By.id("search_query_top_elastic_search"));
			Searchbox.click();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			driver.findElement(By.name("submit_search")).submit();
			
			
			
			
			
			
		}

	}


