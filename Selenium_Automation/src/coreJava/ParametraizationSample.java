package coreJava;

public class ParametraizationSample {
//	 Global variable
//	 static int a = 60;
//	 static int b = 76;

	public static void add() {
		// Local variables
		int a = 90;
		int b = 80;
		System.out.println(a + b);
	}

	public static void test(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		add();
		test(15,94);
		test(12,5);
		test(63,45);
	}

}
