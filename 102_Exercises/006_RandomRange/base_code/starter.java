/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to create a range for your random number."); 
		System.out.println("Please enter a number: ");
		double ____ = sc.nextDouble();
		System.out.println("Please enter a number(larger than the first): ");
		double range = sc.nextDouble();
		
		//GO OVER THE NOTES AGAIN!   
		// int x = sc.nextInt(); 75
		// int y = sc.nextInt(); 100
		// (int)(Math.random()*(y-x=100-75))+x=75
		// do this: System.out.print((int)(Math.random()*(y-x))+x);
		System.out.print((Math.random()*_____)+range);
	}
}
