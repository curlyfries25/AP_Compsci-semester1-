/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String s){
		System.out.println(s);
	}
	
	public static void toStringCombined(String a, String b){
		System.out.println(a + " " + b);
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		toString(x);
		
		String A = sc.nextLine();
		String B = sc.nextLine();
		toStringCombined(A,B);
		
	}
}
