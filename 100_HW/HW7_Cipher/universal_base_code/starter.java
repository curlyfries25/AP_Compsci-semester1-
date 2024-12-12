/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a message to encode");
		String message = sc.nextLine();
		System.out.println("...and a number to use as a key");
		int number = sc.nextInt();
		System.out.println(Cipher.keyedEncode(message,number));

	}
}
