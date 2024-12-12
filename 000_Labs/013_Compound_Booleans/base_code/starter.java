/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three different values");
		int one = sc.nextInt();
		int two =  sc.nextInt();
		int three = sc.nextInt();
		
		
		if(one > two && one > three){
			System.out.println(one);
		}
		if(two > one && two > three){
			System.out.println(two);
		}
		if(three > one && three > two){
			System.out.println(three);
		}
		
		
		if(one < two && one < three){
			System.out.println(one);
		}
		if(two < one && two < three){
			System.out.println(two);
		}
		if(three < one && three < two){
			System.out.println(three);
		}
	}
}
