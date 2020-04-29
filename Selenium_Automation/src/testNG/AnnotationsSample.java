package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsSample {

	@Test // Actual Functional Script
	public void f() {
		System.out.println("@test f");
	}

	@Test // Actual Functional Script
	public void b() {
		System.out.println("@test b");
	}

	@Test // Actual Functional Script
	public void t() {
		System.out.println("@test t");
	}

	@BeforeClass // Pre-Conditions
	public void beforeClass() {
		System.out.println("@beforeClass");
	}

	@AfterClass // Post Conditions
	public void afterClass() {
		System.out.println("@afterClass");
	}

}
