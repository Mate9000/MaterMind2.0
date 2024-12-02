package masterMind2;

import java.util.Random;
import java.util.Scanner;

public class Matecodebreaker02 {

	public static void main(String[] args) {
		// aangeven dat de max attempts 10 is
		int maxAttempts = 10;
		// maakt zeker dat de schrijfer kan typen later op in de code
		Scanner sc = new Scanner(System.in);
		// did randomises de code verder op in d code
		Random random = new Random();
		int r = 0;
		int[] numbers = new int[4];
		String secretCode = "";
		for (int e = 0; e < numbers.length; e++) {
			numbers[e] = (int) random.nextInt(6);
			secretCode = "" + numbers[e];
			System.out.print(secretCode);
		}

		System.out.println("only 4 digit code allowed otherwise game crashes");
		// dit is de attempt counter en het voegt 1 erbij bij elke gok
		for (int i = 1; i <= maxAttempts; i++) {
			// dit print uit jouw aantal attempts die nog hept en de digit code tussen de 0
			// en 5 mag gegokt worden
			System.out.println("Attempt " + i + ": Enter your 4-digit guess from 0 to 5:");
			// hier hier heb ik a b c en d die eigenlijk de x y z en w zijn maar de verschil
			// hier is dat deze de gokken zijn en de x y z en w een random nummer is
			int[] geusses = new int[4];
			String sumGeusses = "";
			for (int x = 0; x < numbers.length; x++) {
				geusses[x] = (int) sc.nextInt();
				sumGeusses = "" + numbers[x];

			}
			// als je de 4 digit code goed hebt geraden dan krijg je deze tekst hier onder
			// en het breakt zodat de code zou stoppen als de code goed is
			if (sumGeusses.equals(secretCode)) {
				System.out.println("Yippieeeee! You win!");
				
			} else {

				// checks de eerste digit als het goed niet goed of een dichtbi is of het
				// helemaal fout is
				r = 0;
				if (geusses[r] == numbers[r]) {
					System.out.print("G");
				} else if (geusses[r] == numbers[1] || geusses[r] == numbers[2] || geusses[r] == numbers[3]) {
					System.out.print("N");
				} else {
					System.out.print("-");
				}
				r++;
				// checks de tweede digit als het goed niet goed of een dichtbi is of het
				// helemaal fout is
				if (geusses[r] == numbers[r]) {
					System.out.print("G");
				} else if (geusses[r] == numbers[0] || geusses[r] == numbers[2] || geusses[r] == numbers[3]) {
					System.out.print("N");
				} else {
					System.out.print("-");
				}
				r++;
				// checks de derde digit als het goed niet goed of een dichtbi is of het
				// helemaal fout is
				if (geusses[r] == numbers[r]) {
					System.out.print("G");
				} else if (geusses[r] == numbers[1] || geusses[r] == numbers[0] || geusses[r] == numbers[3]) {
					System.out.print("N");
				} else {
					System.out.print("-");
				}
				// checks de vierde digit als het goed niet goed of een dichtbi is of het
				// helemaal fout is
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

			if (i == maxAttempts) {
				System.out.println("Womp, Womp! You've used all attempts."); // als je max attempts op is dus max
																				// attempt 10 gebruit dan stopt alles en
																				// je krijgt womp womp
				System.out.println("the secret code was -> " + secretCode);

			}
		}

		sc.close(); // scanner is hier gesloten
	}
}
