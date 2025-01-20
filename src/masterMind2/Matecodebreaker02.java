package masterMind2;

import java.util.Arrays;
import java.util.Scanner;

public class Matecodebreaker02 {

	public static void main(String[] args) {
		// functie's
		MasterMath gen = new MasterMath();
		// aangeven dat de max attempts 10 is
		int maxAttempts = 10;
		// maakt zeker dat de schrijfer kan typen later op in de code
		Scanner sc = new Scanner(System.in);
		// did randomises de code verder op in d code
		int r = 0;
		int[] numbers = new int[4];
		String secretCode = gen.generator(numbers);

		System.out.println("only 4 digit code allowed otherwise game crashes");
		// dit is de attempt counter en het voegt 1 erbij bij elke gok
		for (int i = 1; i <= maxAttempts; i++) {
			// dit print uit jouw aantal attempts die je nog hept en de digit code tussen de
			// 0
			// en 5 mag gegokt worden
			System.out.println("Attempt " + i + ": Enter your 4-digit guess from 0 to 5:");

			int[] geusses = gen.geusses();
			int winner = gen.winner(numbers, geusses);

			if (winner == 1) {
				return;
			} else {
				// en het breakt zodat de code zou stoppen als de code goed is

				if (i == maxAttempts) {
					System.out.println("Womp, Womp! You've used all attempts."); // als je max attempts op is dus max
																					// attempt 10 gebruit dan stopt
																					// alles en
																					// je krijgt womp womp
					System.out.println("the secret code was -> " + secretCode);

				}
			}
		}
		sc.close(); // scanner is hier gesloten
	}
}