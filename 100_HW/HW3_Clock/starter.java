/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday");
		System.out.println("What day is it?");
		
		int day = sc.nextInt();
		
		if(day == 0){
			System.out.print("Sunday, you get to sleep! wake up at 10:00 am");
		}
		if(day == 1){
			System.out.print("It's Monday. wake up at 7:00 am");
		}
		if(day == 2){
			System.out.print("It's Tuesday. wake up at 7:00 am");
		}
		if(day == 3){
			System.out.print("It's Wednesday. wake up at 7:00 am");
		}
		if(day == 4){
			System.out.print("It's Thursday. wake up at 7:00 am");
		}
		if(day == 5){
			System.out.print("It's Friday. wake up at 7:00 am");
		}
		if(day == 6){
			System.out.print("It's Saturday! you get to sleep! wake up at 10:00 am");
		}
	}
}
