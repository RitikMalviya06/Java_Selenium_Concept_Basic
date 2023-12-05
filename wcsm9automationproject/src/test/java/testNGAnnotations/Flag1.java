package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;     // description flag

public class Flag1 {
  @Test(description="method from flag 1")
  public void method1() 
  {
	  Reporter.log("method from flag 1", true);
  }
}
