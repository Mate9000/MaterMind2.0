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
public class ComputerFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare = 3;
    	
        if (age < 11) {
        	System.out.println(fare);
    }
        else if (age >= 11 && age < 65) {
        	System.out.println(fare + 2);
    }
        else {
        	System.out.println(fare + 1);
    }
        
    }
}