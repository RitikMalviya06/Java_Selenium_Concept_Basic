package testNGAnnotations;

import org.testng.Assert;
import org.testng.Reporter;                                               // always run flag 
import org.testng.annotations.Test;

public class Flag7 {
	 @Test(description="it is use to pefrom login ")
	  public void method1()
	  {
		  Reporter.log("method 1 for login ", true);
	  }
	  @Test(description="it is use to pefrom  create user",dependsOnMethods = "method1")
	  public void method2()
	  {
		  Assert.fail();
		  Reporter.log("method 2 for create user ", true);
	  }
	  @Test(description="it is use to pefrom logout",dependsOnMethods = "method2",alwaysRun = true)
	  public void method3()
	  {
		  Reporter.log("method 3 for logout page", true);   
	  }


}
