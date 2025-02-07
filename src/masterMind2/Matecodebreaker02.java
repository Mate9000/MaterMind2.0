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
		//this here makes random code in the function
		String secretCode = gen.generator(numbers);
		//making sure the player knows how to play the game
		System.out.println("Make You're 4 digit guesses from 0-5 have fun :3");
		//keeps on adding one every time the player does not guess correctly
		for (int i = 1; i <= maxAttempts; i++) {
			System.out.println("Attempt " + i + ": Enter your 4-digit guess from 0 to 5:");
			//here the guess can be made by the player
			int[] guess = gen.guessInput();
			//if the hasWon boolean is false the game continues but if it becomes true it stops
			boolean hasWon = gen.winner(guess, numbers);
			if (hasWon) {
				sc.close();
				return;
			} else {
				//this one makes sure that when all the attempts are used then the game stops 
				if (i == maxAttempts) {
					System.out.println(
							"Womp, Womp! You've used all attempts.\r\n" + "the secret code was -> " + secretCode);
					sc.close();
					//dgajvihzkvlks
				}
			}
		}
	}
}