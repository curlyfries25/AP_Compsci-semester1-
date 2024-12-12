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
		System.out.println("You've joined an alien exchange program");
		System.out.println("CHOOSE YOUR ALIEN:");
		System.out.println("1. Joe, fat bellied alien who loves pizza");
		System.out.println("2. Bob, blue alien who's obsessed with trees");
		System.out.println("3. Barney, a purple tailed alien");
		
		
		int answer1 = sc.nextInt();
		if(answer1 == 1)
			System.out.println("You've picked Joe!");
		else if(answer1 == 2)
			System.out.println("You've selected Bob");
		else if(answer1 == 3)
			System.out.println("You got Barney!");
		else
			System.out.println("Looks like you haven't picked anyone...");
		
	}
}
