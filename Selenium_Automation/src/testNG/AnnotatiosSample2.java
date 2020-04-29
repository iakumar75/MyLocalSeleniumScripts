package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotatiosSample2 {
	@Test
	public void f() {
		System.out.println("@test f");
	}

	@Test
	public void d() {
		System.out.println("@test d");
	}

	@Test
	public void r() {
		System.out.println("@test r");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@after method");
	}

}
