package masterMind2;

import java.util.Random;
import java.util.Scanner;

public class Testzone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int[] numbers = new int[4];
		for (int e = 0; e < numbers.length; e++) {
			numbers[e] = (int) random.nextInt(6);
	        String secretCode = "" + numbers[e];
	        System.out.print(secretCode);
		
		}
	}

}
