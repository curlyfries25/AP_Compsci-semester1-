/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter two values: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 != num2){
			System.out.print("huh, they're different...");
		}
		else{
			System.out.print("No way! It's the same number!");
		}
	}
}
