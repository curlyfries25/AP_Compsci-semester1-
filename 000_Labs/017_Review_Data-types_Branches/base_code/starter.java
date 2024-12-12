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
		// System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello player, state your name: ");
		String name = sc.nextLine();
		
		System.out.println("What is your title? ");
		String title = sc.nextLine();
		
		System.out.println("Choose your role: Wizard, Warrior, or Rogue.");
		String role =  sc.nextLine();
		
		if(role.equals("wizard") || role.equals("Wizard") || role.equals("WIZARD")){
			System.out.println("It seems you've chosen to cast spells as a Wizard, a wise choice.");
		}
		if(role.equals("warrior") || role.equals("Warrior") || role.equals("WARRIOR")){
		 	System.out.println("A warrior. Very admirable.");
		}
		if(role.equals("rogue") || role.equals("Rogue") || role.equals("ROGUE")){
		 	System.out.println("A rogue? Sounds like We have a trouble maker...");
		}
		
		System.out.println("You can invest in different traits, those of which being: ");
		System.out.println("Strength, Dexterity, Intelligence, or Charisma.");
		System.out.println("You can spend a maxium of 10 points in each category.");   
		System.out.println("You will receive 20 points to spend. spend them wisely.");
		
		
		
		System.out.println("How many points /10 in strength would you like?");
		int strength = sc.nextInt();
		
		if(strength <= 10){
			System.out.println("You still have "+ (20-strength) + " points.");
		}
		else{
			System.out.println("10 points is the maximum you can invest.");
		}
		
		
		
		
		System.out.println("How many points /10 in dexterity would you like?");
		int dexterity = sc.nextInt();
		
		if(dexterity <= 10){
			System.out.println("You still have "+ (20-strength - dexterity) + " points.");
		}
		else{
			System.out.println("10 points is the maximum you can invest.");
		}
		
		
		
		
		System.out.println("How many points /10 in intelligence would you like?");
		int intelligence = sc.nextInt();
		
		if(intelligence <= 10){
			System.out.println("You still have "+ (20-strength - dexterity - intelligence) + " points.");
		}
		else{
			System.out.println("10 points is the maximum you can invest.");
		}
		
		
		
		System.out.println("How many points /10 in charisma would you like?");
		int charisma = sc.nextInt();
		
		if(charisma <= 10 && (20 - strength - dexterity - intelligence - charisma) > 0){
			System.out.println("you still have "+ (20-strength - dexterity - intelligence - charisma) + " points.");
		}
		if((20 - strength - dexterity - intelligence - charisma) == 0){
			System.out.println("You've ran out of points.");
		}
		if((20 - strength - dexterity - intelligence - charisma) < 0){
			System.out.println("You don't have enough points for that");
		}
		else{
			System.out.println("10 points is the maximum you can invest.");
		}
		
		System.out.println("To recap, you're " + name + ", " + title);
		System.out.println("You're a " + role + ".");
		System.out.println("To recap, your stats are: ");
		System.out.println(strength + " points in Strength.");
		System.out.println(dexterity + " points in Dexterity.");
		System.out.println(intelligence + " points in Intelligence.");
		System.out.println(charisma + " points in Charisma.");
	}
}
