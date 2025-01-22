package masterMind2;

import java.util.Scanner;

public class MateCodeBreaker02 {
	public static void main(String[] args) {
		MasterMath gen = new MasterMath();
		//this integer is the max attempts you're giving
		int maxAttempts = 10;
		//scanner is here so u can actually place guesses
		Scanner sc = new Scanner(System.in);
		//the length of the code
		int[] numbers = new int[4];
		//this here makes random code
		String secretCode = gen.generator(numbers);
		
		System.out.println("Make You're guess from 0-5 have fun :3");
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