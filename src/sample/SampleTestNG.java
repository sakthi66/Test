package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTestNG {
  @Test(priority=-1,invocationCount=2)
  public void test1() {
	  Reporter.log("good",false);
  }
  @Test(priority=-2,invocationCount=1)
  public void test2() {
	  Reporter.log("bad",true);
	  
   }

}
 