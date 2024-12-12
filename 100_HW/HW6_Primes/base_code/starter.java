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
		
		System.out.println("Give me 2 numbers");
		//int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		printPrimes(num2);
		 
	}
	
	public static boolean checkPrime(int num){
		
		int i = num - 1;
		while(i > 1){
			if(num%i == 0){
				return false;
			}
			i--;
			
		}
		
		return true;
	}
	
	public static void printPrimes(int num2){
		
		int i = 2;
		
		while(i < num2){
			
			if(checkPrime(i) == true){
				System.out.println(i);
			}
			
			i++;
		}
	}
}
