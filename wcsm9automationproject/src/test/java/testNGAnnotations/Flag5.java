package testNGAnnotations;

import org.testng.Reporter;                                 // depends on method flag
import org.testng.annotations.Test;

public class Flag5 {
  @Test(description="it is use to pefrom login ")
  public void method1()
  {
	  Reporter.log("method 1 for login ", true);
  }
  @Test(description="it is use to pefrom  create user",dependsOnMethods = "method1")
  public void method2()
  {
	  Reporter.log("method 2 for create user ", true);
  }
  @Test(description="it is use to pefrom logout",dependsOnMethods = "method2")
  public void method3()
  {
	  Reporter.log("method 3 for logout page", true);   
  }

}
