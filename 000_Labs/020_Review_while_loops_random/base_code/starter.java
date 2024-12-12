/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("I'm thinking of a number between 1 and a 1000.");
		System.out.println("Guess it");
		
		int guess = sc.nextInt();
		
		int correct = 589;
		
		
		while(true){
			
			if(guess == correct){
				
				System.out.println("THAT'S CORRECT!");
				break;
				
			}
			else{
				
				System.out.println("Nope, try again.");
				guess = sc.nextInt();
			}
			
		}
	}
}
