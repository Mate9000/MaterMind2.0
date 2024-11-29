/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

	public static void main(String args[]) {
        System.out.print("Enter the movie ticket price \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("movie ticket price is ->");
    	int MoviePrice = sc.nextInt();
        System.out.println("movie rating is ->");
    	int MovieRating = sc.nextInt();
        
    	if (MoviePrice >= 12 && MovieRating == 5) {
        	System.out.println("im interested in the movie");
    }
        else {
        	System.out.println("boring movie not interested");
        }
}
}
