/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class myCharacter{
		
		String role;
		
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
	}


public class starter {
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		Scanner sc = new Scanner(System.in);
		
		myCharacter Role = new myCharacter();
		
		String thingB = sc.nextLine();
		myCharacter role = new myCharacter(thingB);
	}
}
