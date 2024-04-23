package work;

import java.applet.AudioClip;
import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class QsiderDemo {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		
		// Web Element Text box
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ritik");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ritikma1@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rk123");
		Thread.sleep(2000);
		
		
		// button default click 
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		driver.findElement(By.xpath("//button[@id='btn3']")).click();
		driver.findElement(By.xpath("//button[@id='btn4']")).click();
		Thread.sleep(2000);
		
		
		// button Right click 
		
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//button[@id='btn30']"))).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		act.contextClick(driver.findElement(By.xpath("//button[@id='btn31']"))).perform();
		driver.findElement(By.xpath("//div[text()='No']")).click();
		act.contextClick(driver.findElement(By.xpath("//button[@id='btn32']"))).perform();
		driver.findElement(By.xpath("//div[text()='1']")).click();
		
		
		// button double click 
		
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		Thread.sleep(2000);
		act.doubleClick(driver.findElement(By.xpath("//button[@id='btn21']"))).perform();
		act.doubleClick(driver.findElement(By.xpath("//button[@id='btn23']"))).perform();
		act.doubleClick(driver.findElement(By.xpath("//button[@id='btn26']"))).perform();
		Thread.sleep(2000); 
		
		
		// Submit click not working  

		driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
		driver.findElement(By.id("sat1")).click();
		driver.findElement(By.id("btn40")).click();
		
		
		
		// Dropdown single select 
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement drop = driver.findElement(By.xpath("//select[@id='select1']"));
		Select rk = new Select(drop);
		Thread.sleep(2000);
		rk.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
		WebElement drop2 = driver.findElement(By.xpath("//select[@id='select2']"));
		Select rk2 = new Select(drop2);
		rk2.selectByIndex(1);
		WebElement drop3 = driver.findElement(By.xpath("//select[@id='select3']"));
		Select rk3 = new Select(drop3);
		rk3.selectByIndex(7);
		Thread.sleep(2000);
		
		// Radio button 
		
		driver.findElement(By.linkText("Radio Button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='attended1']")).click();
		
		
		// check box
		
		driver.findElement(By.linkText("Check Box")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='domain2']")).click();
		
		
		// toggle
		
		driver.findElement(By.linkText("Toggle")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out']")).click();
		
		
		
		// slider
		
		driver.findElement(By.linkText("Slider")).click();
		Thread.sleep(2000);
		WebElement sider = driver.findElement(By.xpath("//input[@class=' rangeInputSlidebar']"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDropBy(sider, 56, 0).perform();
		
		
		
		// audio play or pause
		
		driver.findElement(By.linkText("Audio")).click();
		Thread.sleep(2000);
		 WebElement Audio = driver.findElement(By.xpath("//audio[@src='/assets/audiofile-zzjK-tOl.mp3']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.querySelector('Audio').play();");
		Thread.sleep(2000);
		jse.executeAsyncScript("document.querySelector('Audio').pause();");
		
		
		
		// video  working but script not continue & play is working but pause not working 
		
		
		driver.findElement(By.xpath("//section[text()='Video']")).click();
		Thread.sleep(2000);
    	WebElement video = driver.findElement(By.xpath("//video[@class='w-[55%] rounded-md']"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].play()",video);
		Thread.sleep(5000);
		jse2.executeScript("arguments[0].pause()",video);
		
		
		
		
		
		// popups javascript alert popups
		
		driver.findElement(By.xpath("//section[@class='poppins text-[15px]'and(text()='Popups')]")).click();
		driver.findElement(By.linkText("Javascript")).click();
		driver.findElement(By.xpath("//button[@id='buttonAlert2']")).click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
		
		// popups javascript confirm popups
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='buttonAlert5']")).click();
		a1.accept();
		
		
		// popups javascript prompt popups
		
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='buttonAlert1']")).click();
		a1.sendKeys("yes");
		a1.accept();
		
		// popups Browser windows ( New window)
		
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(2000);
         String pa = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		for(String rr1:driver.getWindowHandles())
		{
			if(!rr1.equals(pa))
			{
				driver.switchTo().window(rr1);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ritik@gmail.com");
				Thread.sleep(2000);
				driver.close();
				
			}
		}
		
		driver.switchTo().window(pa);      // important part 
		
		

		// popups Browser windows ( New Tab)
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='  flex items-center w-[100%] justify-between py-1 px-2 cursor-pointer poppins']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='poppins ps-1 pe-3 py-1 font-semibold flex items-center justify-between w-full text-[14px] text-orange-500 active'and(text()='New Tab')]")).click();
		String pa2 = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
		for(String rr2:driver.getWindowHandles())
		{
			if(!rr2.equals(pa2))
			{
				driver.switchTo().window(rr2);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("text@gmail.com");
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		
		driver.switchTo().window(pa);      // important part 
		
		
		
		// popups Browser windows ( multiple windows)
		
		Thread.sleep(2000);		
	driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		String pa3 = driver.getWindowHandle();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='browserButton3']")).click();
	Set<String> allId = driver.getWindowHandles();
	for(String all:allId)
	{
		driver.switchTo().window(all);
		if(driver.getTitle().equals("Demoapps | Qspider"))
		{
			break;	
		}
	}
	driver.findElement(By.id("username")).sendKeys("text@gmail.com");
	driver.close();
	
	
	
	driver.switchTo().window(pa);     // important part 
	
	
	// popups Browser windows ( multipe  tabs)
	
	
	driver.findElement(By.xpath("//a[text()='Multiple Tabs']")).click();
	String pa4 = driver.getWindowHandle();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='browserButton2']")).click();
	Set<String> lla = driver.getWindowHandles();
	for(String llaa:lla)
	{
		driver.switchTo().window(llaa);
		if(driver.getTitle().equals("Demoapps | Qspider"))
		{
			break;
		}
	}
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("thwq@gmail.com");
	driver.close();
	
	
	
	driver.switchTo().window(pa);     // important part 
	
	
	    // Authentication Popup
	
	
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		String auth = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='AuthLink']")).click();
		Set<String> all = driver.getWindowHandles();
		for(String rr4:all)
		{
			if(!auth.equals(rr4))
			{
				driver.switchTo().window(rr4);
			}
		}
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		
		
		// username 
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		//password
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_M);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.close();
		
		
		driver.switchTo().window(auth);        // important part 
		Thread.sleep(2000);
		
		
		
		// Filp uploads  // using sendkeys  
		
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\hp\\Downloads\\SQL.pdf");
		Thread.sleep(2000); 
		
		
		// Filp uploads // using robot not working 
		
//		Thread.sleep(2000);
//		driver.findElement(By.id("fileInput")).click();
//		Thread.sleep(2000);
//		StringSelection str = new StringSelection("C:\\Users\\hp\\Downloads\\SQL.pdf");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		// Filp uploads  custom button //using Auto IT
		
		driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Upload File']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\hp\\Documents\\fileupload1.exe");
		Thread.sleep(4000); 
		
		
		// Filp uploads Drap and drop not working 
		
		
//		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
//		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='drop-container loading']")).click();
		
		
		// Modal Default
		
		driver.findElement(By.xpath("//section[text()='Modal']")).click();
		driver.findElement(By.xpath("//button[@id='modal1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='closeModal']")).click();
		
		
		
		// Modal multiple Modal 
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multiple Modal']")).click();
		driver.findElement(By.xpath("//button[@id='multiModalButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='multiClosemodal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='close']")).click();
		driver.findElement(By.xpath("//button[@id='multiclose2']")).click();
		
		
		
		// Download 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Download ']")).click();
		driver.findElement(By.xpath("//textarea[@name='textarea']")).sendKeys("ritik");
		driver.findElement(By.xpath("//input[@id='fileName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fileName']")).sendKeys("ritik.txt");
		driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
		
		
		
		// Hidden division 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		driver.findElement(By.xpath("//input[@class='w-full h-10 px-4 m-2 border-2 border-stone-600 rounded-md']")).sendKeys("ritik");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='hiddendiv']")).click();
		
		
		// Date & time picker  ( date picker )
		
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		
		//data picker (simple data picker )
		
		
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click(); 
		driver.findElement(By.xpath("//div[text()='1']")).click();
		
		
		// data picker ( dropdown data picker )    with select class drop down not working 
		
		
		driver.findElement(By.xpath("//a[text()='Dropdown DatePicker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='react-datepicker-wrapper']/descendant::input[@placeholder='Select A Date']")).click();
		Thread.sleep(2000);
		//WebElement datadropmonth = driver.findElement(By.xpath("//span[@class='react-datepicker__month-read-view--selected-month']"));
		//WebElement datadropmonth = driver.findElement(By.xpath("//div[@class='react-datepicker__header__dropdown react-datepicker__header__dropdown--scroll']/descendant::span[@class='react-datepicker__month-read-view--down-arrow']/following-sibling::span[@class='react-datepicker__month-read-view--selected-month']"));		
		//WebElement datadropmonth = driver.findElement(By.xpath("//div[@class='react-datepicker__month-read-view']"));
		//Select month = new Select(datadropmonth);
		//month.selectByVisibleText("Mar");
		//month.selectByIndex(2);
				
		 driver.findElement(By.xpath("//div[@class='react-datepicker__month-read-view']")).click();
		 driver.findElement(By.xpath("//div[text()='Jun']")).click();
		 driver.findElement(By.xpath("//div[@class='react-datepicker__year-read-view']")).click();
		 driver.findElement(By.xpath("//div[text()='2027']")).click();
		 driver.findElement(By.xpath("//div[@aria-label='Choose Friday, June 4th, 2027']")).click();
		 
		 
		 
		 //  Date & time picker  ( time picker)
		 
		 driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@id=':r8:']")).sendKeys("0325PM");
		// driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiTextField-root css-165mck1']/descendant::label[@id=':rc:-label']")).sendKeys("0555PM");
		WebElement time = driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-adornedEnd css-1bn53lx']/descendant::input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2']"));
		Thread.sleep(1000);
		time.click();
		time.sendKeys("525pm");  
		
		
		
		
		
		//  Date & time picker  ( time picker / time picker clock)
		// span tag not working
		
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
		driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-adornedEnd Mui-readOnly MuiInputBase-readOnly css-1bn53lx']/descendant::input[@aria-label='Choose time, selected time is 12:00 AM']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[name()='svg' and @data-testid='ArrowRightIcon']")).click();
//		driver.findElement(By.xpath("//span[@class='MuiClockNumber-root css-1flhz3h']")).click();
//		driver.findElement(By.xpath("//span[@aria-label='1 hours']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@aria-label='20 minutes']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-subtitle2 MuiTimePickerToolbar-ampmLabel MuiPickersToolbarText-root css-n4qtc0']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		
		
		
		
		// sroll ( in a new tab / vertical  ) 
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		driver.findElement(By.xpath("//section[@class='poppins text-[14px]'and(text()='Scroll')]")).click();
		String srollverticalp = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		 for(String verticalc:driver.getWindowHandles())
		 {
			 Thread.sleep(2000);
			 if(!verticalc.equals(srollverticalp))   // important part
			 {
				
				 driver.switchTo().window(verticalc);
				 Thread.sleep(2000);
					JavascriptExecutor ver = (JavascriptExecutor)driver;
					
					ver.executeScript("window.scrollBy(0,5000)");
					Thread.sleep(2000);
					ver.executeScript("window.scrollBy(0,-2000)");
					driver.close();
			 }
		 }
		
				
	    driver.switchTo().window(pa);    // important part 
	
	
	
	    // sroll ( in a new tab / horizontal  )
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
		String horizontalp = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String> horic = driver.getWindowHandles();
		for(String zontal:horic)
		{
			driver.switchTo().window(zontal);
			if(driver.getTitle().equals("Demoapps | Qspider"))
			{
				break;
			}
		}
		Thread.sleep(2000);
		JavascriptExecutor hori = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		hori.executeScript("window.scrollBy(5000,0)");
		Thread.sleep(2000);
		hori.executeScript("window.scrollBy(0,2000)");
		driver.close();
		
		
		driver.switchTo().window(pa);            // important part
		
		
		
//		 sroll ( in a new tab / infinite   dont  no)
//		
//		
//		
//		driver.findElement(By.xpath("//a[text()='Infinite']")).click();
//		String infinitep = driver.getWindowHandle();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
//		Set<String> infinitec = driver.getWindowHandles();
//		for(String finite:infinitec)
//		{
//			driver.switchTo().window(finite);
//			if(driver.getTitle().equals("Demoapps | Qspider"))
//			{
//				break;
//			}
//		}
//		Thread.sleep(2000);
//		JavascriptExecutor fin = (JavascriptExecutor)driver;
//		Thread.sleep(2000);
//		fin.executeScript("window.scrollBy(5000,0)");
//		driver.close();
//		
//		
//		driver.switchTo().window(pa);            // important part
		
		
		
		
		// sroll ( within the frame / vertical  )
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Within The Frame']")).click();
		driver.findElement(By.xpath("//a[text()='Vertical']")).click();
		WebElement ivertical = driver.findElement(By.xpath("//iframe[@class='w-full border-none h-[55vh]']"));
		driver.switchTo().frame(ivertical);
		Thread.sleep(2000);
		JavascriptExecutor iver = (JavascriptExecutor)driver;
		iver.executeScript("window.scrollBy(0, 5000)");
		
		
		
		
		driver.switchTo().window(pa);            // important part
		
		
		
		//sroll ( within the frame / Horizontal  )   
		
		
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='no-use']/descendant::a[text()='Horizontal']")).click();
    	WebElement ihorizontal = driver.findElement(By.xpath("//iframe[@class='w-full h-[45vh]']"));
		driver.switchTo().frame(ihorizontal);
		Thread.sleep(2000);
		JavascriptExecutor ihori = (JavascriptExecutor)driver;
		ihori.executeScript("window.scrollBy(5000 ,0)");
		
		
		
		driver.switchTo().window(pa);            // important part
		
		
		
		
		// synchronization (progress bar /default)
		
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[contains(text(),'Synchronization')]")).click();
		driver.findElement(By.xpath("//section[contains(text(),'Progress Bar')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		Thread.sleep(10000);
		
		
		// synchronization (with timer)
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'With Timer')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("2");
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		Thread.sleep(4000);
		
		
		//synchronization ( page loading )
		
		
		driver.findElement(By.xpath("//section[contains(text(),'Page Loading')]")).click();
		String page = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Open In New Tab')]")).click();
		Thread.sleep(4000);
		Set<String> egpa = driver.getWindowHandles();
		for(String loading:egpa)
			{
				driver.switchTo().window(loading);
				if(driver.getTitle().equals("Demoapps | Qspider"))
				{
					break;
				}
			}
			Thread.sleep(2000);
			JavascriptExecutor fin = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			fin.executeScript("window.scrollBy(0,500)");
			driver.close();
			
			
			
			driver.switchTo().window(pa);            // important part
			
			
			// Frames ( default)
		
		driver.findElement(By.xpath("//section[contains(text(),'Frames')]")).click();
		driver.findElement(By.xpath("//section[contains(text(),'iframes')]")).click();
		Thread.sleep(2000);
		WebElement defaultirame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(defaultirame);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ritik1@gmail.com");
		
		
		
		
		
		driver.switchTo().window(pa);            // important part
		
		
		
//		// frame ( nested iframe )
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'Nested iframe')]")).click();
//		Thread.sleep(2000);
//		WebElement nestediframe = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
//		driver.switchTo().frame(1);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rit1@gmailcom");
//		
//		
//		driver.switchTo().window(pa);            // important part
//		
		
		
		// frame ( multiple iframe )
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Multiple iframe')]")).click();
		Thread.sleep(2000);
		WebElement multipleiframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(multipleiframe);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asd1@gmail.com");
		Thread.sleep(1000);
		
		
		driver.switchTo().window(pa);            // important part
		
		
		WebElement multipleiframe2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		Thread.sleep(1000);
		driver.switchTo().frame(multipleiframe2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("malviya");
		
 
	
		driver.switchTo().window(pa);            // important part
		
		
		// mouse actions ( drag & drop / drag postion )
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Mouse Actions')]")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Drag Position')]")).click();
		WebElement drag1 = driver.findElement(By.xpath("//div[contains(text(),'Mobile Charger')]"));
		WebElement drop1 = driver.findElement(By.xpath("//div[contains(text(),'Mobile Accessories')]"));
		Thread.sleep(1000);
		WebElement drag2 = driver.findElement(By.xpath("//div[contains(text(),'Mobile Cover')]"));
		WebElement mob2 = driver.findElement(By.xpath("//div[contains(text(),'Mobile Accessories')]"));
		Thread.sleep(1000);
		WebElement drag3 = driver.findElement(By.xpath("//div[contains(text(),'Laptop Charger')]"));
		WebElement lap3 = driver.findElement(By.xpath("//div[contains(text(),'Laptop Accessories')]"));
		Thread.sleep(1000);
		WebElement drag4 = driver.findElement(By.xpath("//div[contains(text(),'Laptop Cover')]"));
		WebElement lap4 = driver.findElement(By.xpath("//div[contains(text(),'Laptop Accessories')]"));
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(drag1, drop1).perform();
		mouse.dragAndDrop(drag2, mob2).perform();
		mouse.dragAndDrop(drag3, lap3).perform();
		mouse.dragAndDrop(drag4, lap4).perform();
	
		
		 // mouse actions (click & hold)
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Click & Hold')]")).click();
		WebElement hold = driver.findElement(By.xpath("//section[@id='mainBlock']"));
		Thread.sleep(2000);
		Actions click = new Actions(driver);
		click.clickAndHold(hold);    
		
		
		//keybord action ( keybord )
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Keyboard Actions')]")).click();
		driver.findElement(By.xpath("//section[@class='poppins text-[14px]'and(text()='Keyboard')]")).click();
		 driver.findElement(By.xpath("//input[@id='email']"));
		Actions email = new Actions(driver);
		email.setActiveKeyboard("ritik");               
		
	}
}
