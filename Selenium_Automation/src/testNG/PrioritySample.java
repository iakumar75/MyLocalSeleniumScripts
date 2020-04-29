package testNG;

import org.testng.annotations.Test;

public class PrioritySample {
  @Test(priority = 0)
  public void z() {
	  System.out.println("@Test z");
  }
  @Test(priority = 2)
  public void f() {
	  System.out.println("@Test f");
  }
  @Test(priority = 1)
  public void a() {
	  System.out.println("@Test a");
  }
}
