/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int x, int y){
		
		int num1 = x;
		int num2 = y;
		
		int count = 0;
		int result = 1;
		while(count < num2){
			//count = count + 1;
			result = result*num1;
			count = count + 1;
			// return result;
		}
		return result;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me 2 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(pow(num1,num2));
	}
}
