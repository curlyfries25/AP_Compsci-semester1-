/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class myCharacter{
		
		String role;
		int strength = 0;
		int dexterity = 0;
		int inteliigence = 0;
		int charisma = 0;
		
		public myCharacter(){
			role = "No role";
			System.out.println(role);
		}
		
		public myCharacter(String role){
			if(role.equals("wizard")){
				System.out.println("you've chosen wizard");
			}
			else if(role.equals("warrior")){
				System.out.println("you chose warrior");
			}
			else if(role.equals("rogue")){
				System.out.println("you chose rogue");
			}
			else{
				System.out.println("no role");
			}
		}
		
		public void myToString(){
			System.out.println(role);
			System.out.println("Your strength: " + strength);
			System.out.println("Your dexterity: " + dexterity);
			System.out.println("Your intelligence: " + intelligence);
			System.out.println("Your charisma: " + charisma);
		}
		
	}

class starter {
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		Scanner sc = new Scanner(System.in);
		
		String role = sc.nextLine();
		myCharacter Role = new myCharacter(role);
	}
}
