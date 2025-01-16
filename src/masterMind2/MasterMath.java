package masterMind2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MasterMath {
	Random random = new Random();
	String secretCode = "";

	public String generator(int[] numbers) {
		for (int e = 0; e < numbers.length; e++) {
			numbers[e] = (int) random.nextInt(6);
			secretCode = "" + numbers[0] + numbers[1] + numbers[2] + numbers[e];
		}
		return secretCode;
	}

	public int[] geusses() {
		int[] guesses = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int x = 0; x < guesses.length; x++) {
			try {
				guesses[x] = sc.nextInt();
			} catch (Exception InputMismatchException) {

				System.out.println("nee mag nie");
				sc.nextLine();
				x--;
			}
		}
		return guesses;
	}


	public int checker(int[] geusses, int[] numbers) {
		if (Arrays.equals(numbers, geusses)) {
			System.out.println("Yippieeeee! You win!");
			return 0;
		} else {

			
			int r = 0;
			if (geusses[r] == numbers[r]) {
				System.out.print("G");
			} else if (geusses[r] == numbers[1] || geusses[r] == numbers[2] || geusses[r] == numbers[3]) {
				System.out.print("N");
			} else {
				System.out.print("-");
			}
			r++;
		
			if (geusses[r] == numbers[r]) {
				System.out.print("G");
			} else if (geusses[r] == numbers[0] || geusses[r] == numbers[2] || geusses[r] == numbers[3]) {
				System.out.print("N");
			} else {
				System.out.print("-");
			}
			r++;
		
			if (geusses[r] == numbers[r]) {
				System.out.print("G");
			} else if (geusses[r] == numbers[1] || geusses[r] == numbers[0] || geusses[r] == numbers[3]) {
				System.out.print("N");
			} else {
				System.out.print("-");
			}

			r++;
			if (geusses[r] == numbers[r]) {
				System.out.print("G");
			} else if (geusses[r] == numbers[1] || geusses[r] == numbers[2] || geusses[r] == numbers[0]) {
				System.out.print("N");
			} else {
				System.out.print("-");
			}

			// did maakt zeker dat de nakijk ding niet samen zit met de attempt counter dus
			// het is boven aan de attempt counter en niet samen in een zin
			System.out.println();
		}
	return 1;
	}
}
