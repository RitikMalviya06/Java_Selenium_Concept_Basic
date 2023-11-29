package testNGExectionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void method1() {
	  Reporter.log("method 1 from test3 class", true);
  }
  @Test
  public void method2() {
	  Reporter.log("method 2 from test3 class", true);
  }
}
