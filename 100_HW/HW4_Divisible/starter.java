/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please give two integers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 % 2 == 0){
			System.out.println("The first integer is even");
		}
		else{
			System.out.println("The first integer is odd");
		}
		if(num2 % 2 == 0){
			System.out.println("The second integer is even");
		}
		else{
			System.out.println("The second integer is odd");
		}
		
		if((num1 % 3 == 0) && (num1 % 4 == 0) && (num1 % 5 == 0)){
			System.out.println("The first integer is divisble by 3,4, and 5");
		}
		else{
			System.out.println("The first integer is not divisible by 3,4, and 5");
		}
		
		if((num2 % 3 == 0) && (num2 % 4 == 0) && (num2 % 5 == 0)){
			System.out.println("The second integer is divisble by 3,4, and 5");
		}
		else{
			System.out.println("The second integer is not divisible by 3,4, and 5");
		}
	}
}
