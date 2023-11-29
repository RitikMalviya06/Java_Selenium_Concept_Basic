package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() {
	 // System.out.println("method1 from Demo class");
	  // method over loading 
	  Reporter.log("method1 from Demo class",true);
  }
  @Test
  public void method2()
  {
	// System.out.println("method2 from Demo class "); 
	  Reporter.log("method2 from Demo class",false);
  }
}
