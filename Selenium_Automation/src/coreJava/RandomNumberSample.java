package coreJava;

import java.util.Random;

public class RandomNumberSample {
	public static void main(String[] args) {
		// print random number from 1 to 20
		Random r = new Random();
		int number = r.nextInt(20);
		System.out.println(number);

		if (number == 0) {
			number = 1;
			System.out.println("Manually assigned 1 as new random number");
			System.out.println(number);
		}
	}

}
