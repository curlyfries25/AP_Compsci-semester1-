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
		
		System.out.print("Hello, what's your name?");
		String name = sc.nextLine();
		System.out.println("Hi " + name);
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("Wow, you're " + age + " years old");
		
		System.out.println("What month were you born?");
		String month = sc.nextLine();
		System.out.println(month + "? That's cool");
		
		System.out.println("What day were you born?");
		int day = sc.nextInt();
		System.out.println(day + "? That's my favorite number!");
		
		System.out.println("What year were you born in?");
		int year = sc.nextInt();
		System.out.println(year + "??? wow, time flies!");
		
		System.out.println("How much is a buck fifty?");
		double buck = sc.nextDouble();
		System.out.println(buck);
	}
}
