package masterMind2;

import java.util.Scanner;
import java.util.Random;

public class Basicversionofmastermind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();

		boolean gameGewonnen = false;

		// Genereer code
		int[] codes = new int[4];
		
		
		codes[0]=random.nextInt(6);
		codes[1]=random.nextInt(6);
		codes[2]=random.nextInt(6);
		codes[3]=random.nextInt(6);


		// Loop 10 keer
		for (int i = 0; i < 10; i++)
		{
		    // Vraag voor user input
		    int[] pogingen = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};


		    // Controleer eerste poging
		    if (pogingen[0] == codes[0])
		    {
			System.out.print("Zwart");
		    } else if (pogingen[1] == codes[1])
		    {
			System.out.print("Wit");
		    } else if (pogingen[2] == codes[2])
		    {
			System.out.print("Wit");

		    } else if (pogingen[3] == codes[3])
		    {
			System.out.print("Wit");
		    } else
		    {
			System.out.print("Niks");
		    }

		    // Controleer tweede poging
		    if (pogingen[1] == codes[1])
		    {
			System.out.print("Zwart");
		    } else if (pogingen[0] == codes[0])
		    {
			System.out.print("Wit");
		    } else if (pogingen[2] == codes[2])
		    {
			System.out.print("Wit");
		    } else if (pogingen[3] == codes[3])
		    {
			System.out.print("Wit");
		    } else
		    {
			System.out.print("Niks");
		    }

		    // Controleer derde poging
		    if (pogingen[2] == codes[2])
		    {
			System.out.print("Zwart");
		    } else if (pogingen[0] == codes[0])
		    {
			System.out.print("Wit");
		    } else if (pogingen[1] == codes[1])
		    {
			System.out.print("Wit");

		    } else if (pogingen[3] == codes[3])
		    {
			System.out.print("Wit");
		    } else
		    {
			System.out.print("Niks");
		    }

		    // Controleer vierde poging
		    if (pogingen[3] == codes[3])
		    {
			System.out.print("Zwart");
		    } else if (pogingen[0] == codes[0])
		    {
			System.out.print("Wit");
		    } else if (pogingen[1] == codes[1])
		    {
			System.out.print("Wit");

		    } else if (pogingen[2] == codes[2])
		    {
			System.out.print("Wit");
		    } else
		    {
			System.out.print("Niks");
		    }

		    if (pogingen[0] == codes[0])
		    {
			if (pogingen[1] == codes[1])
			{
			    if (pogingen[2] == codes[2])
			    {
				if (pogingen[3] == codes[3])
				{
				    i = 11;
				    gameGewonnen = true;
				}
			    }
			}
		    }
		}
		
		System.out.println();
		if (gameGewonnen)
		{
		    System.out.println("Gefeliciteerd!");
		} else
		{
		    System.out.println("Helaas, de code was:" + codes[0] + codes[1] + codes[2] + codes[3]);
		}
	    }
	}