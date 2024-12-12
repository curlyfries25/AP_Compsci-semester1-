/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose your role: Wizard, Warrior, or Rogue.");
		
		String role =  sc.nextLine();
		
		if(role.equals("wizard") || role.equals("Wizard") || role.equals("WIZARD")){
			System.out.print("It seems you've chosen to cast spells as a Wizard, a wise choice");
		}
		if(role.equals("warrior") || role.equals("Warrior") || role.equals("WARRIOR")){
		 	System.out.print("A warrior. Very admirable");
		}
		if(role.equals("rogue") || role.equals("Rogue") || role.equals("ROGUE")){
		 	System.out.print("A rogue? Sounds like We have a trouble maker");
		}
		else{
			System.out.print("Please learn to spell and try again");
		}
	}
}
