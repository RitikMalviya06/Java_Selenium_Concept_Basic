package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://127.0.0.1/login.do;jsessionid=lnwfdj5j1kcg");
		
		 WebElement name = driver.findElement(By.cssSelector("input[name='username']"));
		  Point na = name.getLocation(); 
		   int xaxis = na.getX();
		    int yaxis = na.getY();
		    System.out.println("location of username box :"+xaxis+":" +yaxis);
		    
		    
		     Dimension size = name.getSize();
		      int heigth = size.getHeight();
		       int width = size.getWidth();
		       System.out.println("dimension :"+heigth+":"+width);
		       
		       
		        Rectangle rc = name.getRect();
		         int x = rc.getX();
		         int y = rc.getY();
		         System.out.println("rectangle :"+x+":"+y);
		    
		    
		
		
	}

}
