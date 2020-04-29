package coreJava;

public class LoopsSample {
	public static void main(String[] args) {
		// for(initilize the Variable; condition; increment/decrement){}
		// print the number from 1 to 10
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("***************************");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("***************************");
		// print alphabets
		for (char alph = 'a'; alph <= 'z'; alph++) {
			System.out.println(alph);
		}

		System.out.println("***************************");
		int abc = 90;
		while (abc < 101) {
			// abc++;
			System.out.println(abc);
			abc++;
		}

		System.out.println("***************************");
		int xyz = 80;
		do {
			System.out.println(xyz);
			xyz++;
		} while (xyz < 91);

		// Nested For loop
		// parent for loop
		for (int i = 1; i < 11; i++) {
			// Child for loop
			for (int j = 1; j < 5; j++) {
				System.out.println(i + "," + j + "   ");// (1,1)1,2   1,3  1,4  1,5
			} // j for lopp end
		} // i for loop end

	}
}
