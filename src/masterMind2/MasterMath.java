package masterMind2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MasterMath {
	Random random = new Random();

	public String generator(int[] numbers) {
		String secretCode = "";
		for (int e = 0; e < numbers.length; e++) {
			numbers[e] = random.nextInt(6);
			secretCode += numbers[e];
		}
		return secretCode;
	}

	public int[] guessInput() {
		int[] guess = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int x = 0; x < guess.length; x++) {
			try {
				guess[x] = sc.nextInt();
			} catch (Exception InputMismatchException) {
				System.out.println("nee mag nie");
				sc.nextLine();
				x--;
			}
		}
		return guess;
	}

	public boolean winner(int[] guess, int[] numbers) {
		if (Arrays.equals(numbers, guess)) {
			System.out.println("Yippieeeee! You win!");
			return true;
		} else {
			int r = 0;
			if (guess[r] == numbers[r]) {
				System.out.print("G");
			} else if (guess[r] == numbers[1] || guess[r] == numbers[2] || guess[r] == numbers[3]) {
				System.out.print("N");
			} else {
				System.out.print("-");
			}
			r++;
			if (guess[r] == numbers[r]) {
				System.out.print("G");
			} else if (guess[r] == numbers[0] || guess[r] == numbers[2] || guess[r] == numbers[3]) {
				System.out.print("N");
			} else {
				System.out.print("-");
			}
			r++;
			if (guess[r] == numbers[r]) {
				System.out.print("G");
			} else if (guess[r] == numbers[0] || guess[r] == numbers[1] || guess[r] == numbers[3]) {
				System.out.print("N");
			} else {
				System.out.print("-");
			}
			r++;
			if (guess[r] == numbers[r]) {
				System.out.print("G");
			} else if (guess[r] == numbers[0] || guess[r] == numbers[1] || guess[r] == numbers[2]) {
				System.out.print("N");
			} else {
				System.out.print("-");
			}
			System.out.println();
		}
		return false;
	}
}