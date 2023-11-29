package testNGExectionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void method1() {
	  Reporter.log("metohd 1 from test2 class ", true);
  }
  @Test
  public void method2() {
	  
	  Reporter.log("metohd 2 from test2 class ", true);
  }
}
