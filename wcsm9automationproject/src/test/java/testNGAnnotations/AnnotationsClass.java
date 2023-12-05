package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void AnnotationsTestMethod()
  {
	  Reporter.log("TestAnnotathod", true);
  }
  @BeforeClass
  public void annotation_BeforeMethod()
  {
	  Reporter.log("BeforeMethodAnntations", true);
  }
  @BeforeClass
  public void annotation_BeforeClass()
  {
	  Reporter.log("BeforeClassAnntations", true);  
  }
  @AfterMethod
  public void annotation_AfterMethod()
  {
	  Reporter.log("AfterMethodsAnntations", true);  
  }
  @AfterClass
  public void annotation_AfterClass()
  {
	  Reporter.log("AfterClassAnntations", true);  
  }
  @BeforeTest
  public void annotation_BeforeTest()
  {
	  Reporter.log("BeforeTestAnntations", true);  
  }
  @BeforeSuite
  public void annotation_BeforeSuite()
  {
	  Reporter.log("BeforeSuiteAnntations", true);  
  }
  @AfterTest
  public void annotation_AfterTest()
  {
	  Reporter.log("AfterTestAnntations", true);  
  }
  @AfterSuite
  public void annotation_AfterSuitet()
  {
	  Reporter.log("AfterSuiteAnntations", true);  
  }
  @Test
  public void test2()
  {
	  Reporter.log("Test Annotation ", true);
  }
  @Test
  public void test3()
  {
	  Reporter.log("Test Annotation ", true);
  }

  @Test
  public void test4()
  {
	  Reporter.log("Test Annotation ", true);
  }
  //hgvhjvjhgj






}
