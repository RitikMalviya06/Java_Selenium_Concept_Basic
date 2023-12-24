package testAssertations;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestAssert {
  @Test
  public void assertMethod()
  {
	  Reporter.log("launch browsers", true);
	  Reporter.log("launch web application by using url", true);
	  
	  Reporter.log("verify and validate the login page ", true);
	  
	  // apply soft assert 
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(true, true);           // soft assert
	  
	  Reporter.log("login performend  ", true);
	  Reporter.log("verify and validate the home page ", true);
	  // Hard assert
	  
	  Assert.assertEquals(true, true);          // hard assert 
	  
	  Reporter.log("User created ", true);
	  Reporter.log("Task created ", true);
	  
  }
}
