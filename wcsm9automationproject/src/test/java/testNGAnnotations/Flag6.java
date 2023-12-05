package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;                        // groups Flag

public class Flag6 {
  @Test(groups="Functional test case")
  public void ft1() 
  {
	  Reporter.log(" ft1Functional test case ", true);
  }
  @Test(groups="Integration test case")
  public void it1()
  {
	  Reporter.log(" it 1Integration test case  ", true);
  }
  @Test(groups ="smoke test case")
  public void st1()
  {
	  Reporter.log("st 1 smoke test case", true);   
  }
  //----------------------------------------------------------------------------------------------------------
  
  @Test(groups="Functional test case")
  public void ft2() 
  {
	  Reporter.log(" ft2Functional test case ", true);
  }
  @Test(groups="Integration test case")
  public void it2()
  {
	  Reporter.log(" it 2Integration test case  ", true);
  }
  @Test(groups ="smoke test case")
  public void st2()
  {
	  Reporter.log("st 2 smoke test case", true);   
  }
  //------------------------------------------------------------------------------------------------------------
  
  @Test(groups="Functional test case")
  public void ft3() 
  {
	  Reporter.log(" ft3 Functional test case ", true);
  }
  @Test(groups="Integration test case")
  public void it3()
  {
	  Reporter.log(" it 3Integration test case  ", true);
  }
  @Test(groups ="smoke test case")
  public void st3()
  {
	  Reporter.log("st 3 smoke test case", true);   
  }
  //------------------------------------------------------------------------------------------------------------
  
  @Test(groups="Functional test case")
  public void ft4() 
  {
	  Reporter.log(" ft4Functional test case ", true);
  }
  @Test(groups="Integration test case")
  public void it4()
  {
	  Reporter.log(" it 4Integration test case  ", true);
  }
  @Test(groups ="smoke test case")
  public void st4()
  {
	  Reporter.log("st 4 smoke test case", true);   
  }
  
  //---------------------------------------------------------------------------------------------------------

  @Test(groups="Functional test case")
  public void ft5() 
  {
	  Reporter.log(" ft5Functional test case ", true);
  }
  @Test(groups="Integration test case")
  public void it5()
  {
	  Reporter.log(" it 5Integration test case  ", true);
  }
  @Test(groups ="smoke test case")
  public void st5()
  {
	  Reporter.log("st 5 smoke test case", true);   
  }
  
  //--------------------------------------------------------------------------------------------------------
  
  @Test(groups="Functional test case")
  public void ft6() 
  {
	  Reporter.log(" ft6Functional test case ", true);
  }
  @Test(groups="Integration test case")
  public void it6()
  {
	  Reporter.log(" it 6Integration test case  ", true);
  }
  @Test(groups ="smoke test case")
  public void st6()
  {
	  Reporter.log("st 6 smoke test case", true);   
  }
  
  //---------------------------------------------------------------------------------------------------------
}
