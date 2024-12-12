/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely.");
		Scanner sc = new Scanner(System.in);
		
		int number = 15;
		
		System.out.println("I'm thinking of a number between 1 and 1000. Guess it.");
		int guess = sc.nextInt();
		
		if(guess == number){
			System.out.print("No way! you got it!");
		}
		else{
			System.out.print("Oops, that's wrong, try again");
		}
	}
}
