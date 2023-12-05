package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;                     // invocation count flag   mutiple time  we use 

public class Flag3 {
  @Test(invocationCount = 10)
  public void method1()
  {
	Reporter.log("method1 for login ", true);  
  }
}
