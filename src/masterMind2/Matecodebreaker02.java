package masterMind2;

import java.util.Scanner;

public class MateCodeBreaker02 {
	public static void main(String[] args) {
		MasterMath gen = new MasterMath();
		int maxAttempts = 10;
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[4];
		String secretCode = gen.generator(numbers);
		System.out.println("only 4 digit code allowed otherwise game crashes");
		for (int i = 1; i <= maxAttempts; i++) {
			System.out.println("Attempt " + i + ": Enter your 4-digit guess from 0 to 5:");
			int[] guess = gen.guessInput();
			boolean hasWon = gen.winner(guess, numbers);
			if (hasWon) {
				sc.close();
				return;
			} else {
				if (i == maxAttempts) {
					System.out.println(
							"Womp, Womp! You've used all attempts.\r\n" + "the secret code was -> " + secretCode);
					sc.close();
				}
			}
		}
	}
}