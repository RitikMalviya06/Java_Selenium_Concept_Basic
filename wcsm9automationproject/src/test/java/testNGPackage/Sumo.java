package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void method1() {
	 // System.out.println("method3 from Sumo class");
	  Reporter.log("method1 from Sumo class", true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("method1 from Sumo class", true);  
  }
}
