package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;                          // enabled flag    its use to enabled or disable 

public class Flag2 {
  @Test(description="it is use to pefrom login",enabled = true)
  public void method1() 
  {
	  Reporter.log("method1 for login page ", true);
  }
  @Test(description="it is use to pefrom  create user",enabled = false)
  public void method2()
  {
	  Reporter.log("method 2 for user page", true);
  }
  @Test(description="it is use to pefrom logout",enabled = true)
  public void method3()
  {
	  Reporter.log("method 3 for logout page", true);
  }
}
