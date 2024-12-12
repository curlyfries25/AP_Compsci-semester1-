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
		
		System.out.println("Give a name.");
		String name = sc.nextLine();
		
		System.out.println("How many times should it show up?");
		int number = sc.nextInt();
		
		int c = 0;
		
		while(true){
			
			System.out.println(name);
			
			if(c < number - 1){
				c = c + 1;
			}
			else{
				break;
			}
		}


		
	}
}
