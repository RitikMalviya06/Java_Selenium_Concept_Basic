package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;                 // priority 

public class Flag4 {
  @Test(priority = 1)
  public void method1() 
  {
	  Reporter.log("method 1 for login ", true);
	  
  }
  @Test(priority = 2)
  public void method2() 
  {
	  Reporter.log("method 2 for admin is login ", true);
	  
  }
  @Test(priority =4 )
  public void method3() 
  {
	  Reporter.log("method 3 for manager is login ", true);
	  
  }
  @Test(priority = 6)
  public void method4() 
  {
	  Reporter.log("method 4 for emp ", true);
	  
  }
  @Test(priority = 7)
  public void method5() 
  {
	  Reporter.log("method 5 for user ", true);
	  
  }
  @Test(priority = 3)
  public void method6() 
  {
	  Reporter.log("method 6 for login  ", true);
	  
  }
  @Test(priority = 5)
  public void method7() 
  {
	  Reporter.log("method 7 for login  ", true);
	  
  }


}
