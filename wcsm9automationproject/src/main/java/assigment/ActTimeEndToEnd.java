package assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActTimeEndToEnd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		// 1) login as Admin
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		Thread.sleep(2000);
		// 2) create customer 
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("TATA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("ritik pradip malviya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		Thread.sleep(2000);
		// 3) create project under customer 
		
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		Thread.sleep(2000);
		WebElement rk1 = driver.findElement(By.xpath("//select[@name='customerId']"));
		Thread.sleep(2000);
		Select dd1 = new Select(rk1);
		dd1.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Range Rover");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Defender");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();
		Thread.sleep(2000);
		System.out.println("admin");
		// 4) create user as manager 
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("MRiti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("mriti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("mriti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("RK");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("MA");
		Thread.sleep(2000);
		// check box 
		/*driver.findElement(By.xpath("//input[@name='rightGranted[12]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='right2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='right13']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='rightGranted[5]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='rightGranted[7]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='rightGranted[1]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='right2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='right13']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();*/
		
		driver.findElement(By.xpath("//input[@name='rightGranted[1]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='right2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='rightGranted[5]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='rightGranted[7]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='rightGranted[12]']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@id='right13']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		
		
		// 5) logout as admin 
		System.out.println("admin log out");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		// 6) login as manager 
		Thread.sleep(2000);
		System.out.println("managar login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("MRiti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("mriti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		System.out.println("mana");
		
		// 7) create task 
		//driver.findElement(By.xpath("//a[@class='content tasks_selected selected']")).click();
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		System.out.println("rk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		System.out.println("kkk");
		Thread.sleep(2000);
		WebElement rk2 = driver.findElement(By.xpath("//select[@name='customerId']"));
		Thread.sleep(2000);
		Select dd2 = new Select(rk2);
		Thread.sleep(2000);
		dd2.selectByVisibleText("TATA");
		
		WebElement rk3 = driver.findElement(By.xpath("//select[@name='projectId']"));
		Select dd3 = new Select(rk3);
		Thread.sleep(2000);
		dd3.selectByVisibleText("Range Rover");
		
		driver.findElement(By.xpath("//input[@name='task[0].name']")).sendKeys("music");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		Thread.sleep(2000);
		System.out.println("user ");
		// 8) create user 
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("T_Riti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("triti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("triti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("PM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("CM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		
		// 9) assign task to user 
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Insert existing tasks']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//td[@id='cpSelector.cpButton.contentsContainer']")).click();
		 Thread.sleep(2000);
		//WebElement rk4 = driver.findElement(By.xpath("//input[@id='cpSelector.cpPopup.cpListbox_item_3']"));
		//Thread.sleep(2000);
		//Select dd4 = new Select(rk4);
		//Thread.sleep(2000);
		//dd4.selectByVisibleText("TATA");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='closeButton']")).click();
		Thread.sleep(2000);
		/*WebElement rk5 = driver.findElement(By.xpath("//input[@name='selected_14']"));
		Thread.sleep(2000);
		Select dd5 = new Select(rk5);
		Thread.sleep(2000);
		dd5.selectByVisibleText("TATA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Insert Selected Tasks to the Enter Time-Track Page']")).click();*/
		driver.findElement(By.xpath("(//input[@name='selected_11'])[3]")).click();
		
		// explicit wait 
		
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));    // expectedconditions is a class not interface
		
		
		
		
	}

}
